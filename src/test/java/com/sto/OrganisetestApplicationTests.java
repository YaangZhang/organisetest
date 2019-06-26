package com.sto;

import com.sto.config.RedisManager;
import com.sto.entity.*;
import com.sto.mapper.one.BaseOrganizeArea1Mapper;
import com.sto.mapper.one.OrderMapper;
import com.sto.mapper.one.UserExpressMapper;
import com.sto.mapper.three.StoOrderCallMapper;
import com.sto.mapper.two.BaseOrganizeArea2Mapper;
import com.sto.mapper.two.User2Mapper;
import com.sto.param.AreaParam;
import com.sto.result.Page;
import com.sto.service.BaseOrganizeAreaManager;
import com.sto.service.DataService;
import com.sto.service.RedisService;
import com.sto.util.AddressResolutionUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrganisetestApplicationTests {
	@Autowired
	private BaseOrganizeArea1Mapper areaMapper;
	@Autowired
	private BaseOrganizeArea2Mapper areaMapper2;
	@Autowired
	private StoOrderCallMapper orderCallMapper;
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private RedisService redisService;
	@Autowired
	private RedisManager redisManager;
	@Autowired
	private BaseOrganizeAreaManager areaManager;
	@Autowired
	private User2Mapper user2Mapper;
	@Autowired
	private UserExpressMapper userExpressMapper;
	@Autowired
	private DataService dataService;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void userExpressTest(){
		List<EmployeeScope> expressEntities = userExpressMapper.getUserByCompanyId("1e8e921a", "");
		List<String> ids = new ArrayList<>();
		expressEntities.forEach(employeeScope -> {
			System.out.println(employeeScope);
			ids.add(employeeScope.getId());
		});

		ids.add("05f158df27df4b2b89c66f9dc3ec1e75");
		ids.add("032dc78aece841398e1de9bd5ca2986a");
		ids.add("3cf3c0d494b6419e9d82ad9f19e2cc84");
		ids.add("0e05900d75db4c8cbea4430a32c0ef27");
		System.out.println(ids);
		System.out.println(expressEntities.size()+" ==……………………………………………………………………………………………………………………");
//		System.out.println(" ==……………………………………………………………………………………………………………………");
		List<BaseUserExpressEntity> listById = userExpressMapper.getListById(ids, "财政局");
		listById.forEach(baseUserExpressEntity -> {
			System.out.println("listById :"+baseUserExpressEntity);
		});
		System.out.println(listById.size());
	}
	@Test
	public void testuser(){
		String sql = "insert into BASE_USER (ID, CODE, USER_NAME, \n" +
				"      REAL_NAME, NICKNAME, QUICK_QUERY, \n" +
				"      SIMPLE_SPELLING, DUTY, TITLE, \n" +
				"      GENDER, SIGNATURE, IDCARD, \n" +
				"      BIRTHDAY, COMPANY_ID, COMPANY_CODE, \n" +
				"      COMPANY_NAME, DEPARTMENT_ID, DEPARTMENT_CODE, \n" +
				"      DEPARTMENT_NAME, SUB_COMPANY_ID, SUB_COMPANY_NAME, \n" +
				"      SUB_DEPARTMENT_ID, SUB_DEPARTMENT_NAME, WORKGROUP_ID, \n" +
				"      WORKGROUP_NAME, PROVINCE_ID, PROVINCE, \n" +
				"      CITY_ID, CITY, DISTRICT_ID, \n" +
				"      DISTRICT, HOME_ADDRESS, DESCRIPTION, \n" +
				"      IS_ADMINISTRATOR, WORK_CATEGORY, SECURITY_LEVEL, \n" +
				"      LANG, THEME, SCORE, \n" +
				"      FANS, USER_FROM, MANAGER_ID, \n" +
				"      MANAGER_AUDIT_STATUS, MANAGER_AUDIT_DATE, \n" +
				"      SORT_CODE, IS_STAFF, IS_VISIBLE, \n" +
				"      ENABLED, DELETION_STATE_CODE, AUDIT_STATUS, \n" +
				"      CREATE_ON, CREATE_USER_ID, CREATE_BY, \n" +
				"      MODIFIED_ON, MODIFIED_USER_ID, MODIFIED_BY \n" +
				"      )\n" +
				"    VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		long l = System.currentTimeMillis();
		List<BaseUser> entities = user2Mapper.getUserAll();
//		List<BaseUser> entities = user2Mapper.getByProv("上海");
		int size = entities.size();
		System.out.println("size == "+size);
//		entities.forEach(baseUserExpressEntity -> {
//			System.out.println(baseUserExpressEntity);
//		});
		long beginTime = System.currentTimeMillis();
		System.out.println("查询 "+size+" 条， 共用时 "+(beginTime - l) +" ms !   ===================");
		System.out.println(new Date());
		try {
			String insertSqlStr = genMulFixSqlStr(sql, 200);
			BlockingQueue<BaseUser> userQueue = initUserQueue(entities);
			List<BaseUser> userList = new ArrayList<>();
			while (!userQueue.isEmpty()) {
				BaseUser user = userQueue.take();
				userList.add(user);
				if (userList.size() == 200) {
					Object[] params = getMulParams(userList);
					jdbcTemplate.update(insertSqlStr, params);
					userList.clear();
				}
			}
			//插入剩余的数据
			if (!userList.isEmpty()) {
				String restInsertSql = genMulFixSqlStr(sql, userList.size());
				Object[] params = getMulParams(userList);
				jdbcTemplate.update(restInsertSql, params);
				userList.clear();
			}
			long endTime = System.currentTimeMillis();
			long time = endTime - beginTime;
			System.out.println(size + " 条记录插入，耗时 " + time+" ms ,   速度 ："+(size / time * 1000)+" 条/s");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private Object[] getMulParams(List<BaseUser> userList) {
		Object[] params = new Object[userList.size() * 56];
		for (int i = 0; i < userList.size(); i++) {
			BaseUser userInfo = userList.get(i);
			params[56 * i] = userInfo.getId();
			params[56 * i + 1] = userInfo.getCode();
			params[56 * i + 2] = userInfo.getUserName();
			params[56 * i + 3] = userInfo.getRealName();
			params[56 * i + 4] = userInfo.getNickname();
			params[56 * i + 5] = userInfo.getQuickQuery();
			params[56 * i + 6] = userInfo.getSimpleSpelling();
			params[56 * i + 7] = userInfo.getDuty();
			params[56 * i + 8] = userInfo.getTitle();
			params[56 * i + 9] = userInfo.getGender();
			params[56 * i + 10] = userInfo.getSignature();
			params[56 * i + 11] = userInfo.getIdcard();
			params[56 * i + 12] = userInfo.getBirthday();
			params[56 * i + 13] = userInfo.getCompanyId();
			params[56 * i + 14] = userInfo.getCompanyCode();
			params[56 * i + 15] = userInfo.getCompanyName();
			params[56 * i + 16] = userInfo.getDepartmentId();
			params[56 * i + 17] = userInfo.getDepartmentCode();
			params[56 * i + 18] = userInfo.getDepartmentName();
			params[56 * i + 19] = userInfo.getSubCompanyId();
			params[56 * i + 20] = userInfo.getSubCompanyName();
			params[56 * i + 21] = userInfo.getSubDepartmentId();
			params[56 * i + 22] = userInfo.getSubDepartmentName();
			params[56 * i + 23] = userInfo.getWorkgroupId();
			params[56 * i + 24] = userInfo.getWorkgroupName();
			params[56 * i + 25] = userInfo.getProvinceId();
			params[56 * i + 26] = userInfo.getProvince();
			params[56 * i + 27] = userInfo.getCityId();
			params[56 * i + 28] = userInfo.getCity();
			params[56 * i + 29] = userInfo.getDistrictId();
			params[56 * i + 30] = userInfo.getDistrict();
			params[56 * i + 31] = userInfo.getHomeAddress();
			params[56 * i + 32] = userInfo.getDescription();
			params[56 * i + 33] = userInfo.getIsAdministrator();
			params[56 * i + 34] = userInfo.getWorkCategory();
			params[56 * i + 35] = userInfo.getSecurityLevel();
			params[56 * i + 36] = userInfo.getLang();
			params[56 * i + 37] = userInfo.getTheme();
			params[56 * i + 38] = userInfo.getScore();
			params[56 * i + 39] = userInfo.getFans();
			params[56 * i + 40] = userInfo.getUserFrom();
			params[56 * i + 41] = userInfo.getManagerId();
			params[56 * i + 42] = userInfo.getManagerAuditStatus();
			params[56 * i + 43] = userInfo.getManagerAuditDate();
			params[56 * i + 44] = userInfo.getSortCode();
			params[56 * i + 45] = userInfo.getIsStaff();
			params[56 * i + 46] = userInfo.getIsVisible();
			params[56 * i + 47] = userInfo.getEnabled();
			params[56 * i + 48] = userInfo.getDeletionStateCode();
			params[56 * i + 49] = userInfo.getAuditStatus();
			params[56 * i + 50] = userInfo.getCreateOn();
			params[56 * i + 51] = userInfo.getCreateUserId();
			params[56 * i + 52] = userInfo.getCreateBy();
			params[56 * i + 53] = userInfo.getModifiedOn();
			params[56 * i + 54] = userInfo.getModifiedUserId();
			params[56 * i + 55] = userInfo.getModifiedBy();
//			params[56 * i + 56] = userInfo.getManager();
		}
		return params;
	}

	public BlockingQueue<BaseUser> initUserQueue(List<BaseUser> entities) {
		BlockingQueue<BaseUser> userQueue = new LinkedBlockingQueue<>();
		for (BaseUser user : entities) {
			userQueue.add(user);
		}
		return userQueue;
	}

	private String genMulFixSqlStr(String sql, int mulSize) {
		StringBuffer mulInserSql = new StringBuffer();
		mulInserSql.append(sql);
		for (int i = 1; i < mulSize; i++) {
			mulInserSql.append(",(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		}
		return mulInserSql.toString();
	}

	@Test
	public void testRedis(){
		areaManager.getListByAreaCodeByCache("210202", true, false, true);
	}

	@Test
	public void testOrganize(){
//		BaseOrganizeEntity organizeEntity = areaMapper2.selectOrganizeById("fkty3ane");
//		System.out.println(organizeEntity);
//		areaMapper.insertOrganize(organizeEntity);

		List<BaseOrganizeEntity> organizeEntities = areaMapper2.selectOrganizeAll();
		organizeEntities.forEach(baseOrganizeEntity -> {
			System.out.println(baseOrganizeEntity);
			areaMapper.insertOrganize(baseOrganizeEntity);
		});
		System.out.println("organizeEntities.size()  = "+organizeEntities.size());
	}

	@Test
	public void testDate(){
//		BaseUserExpressEntity expressEntity = areaMapper2.selectExpressById("920bc0384f934d809b49985c62844732");
//		System.out.println(expressEntity);
//		int i = areaMapper.insertExpress(expressEntity);
//		BaseUserExpressEntity entity = areaMapper.selectById("920bc0384f934d809b49985c62844732");
////		BaseUserExpressEntity entity = areaMapper.selectById("2c01bbb4e2db4b61bd4cf5648261b8dc");
//		System.out.println(entity);
		List<BaseUserExpressEntity> expressAll = areaMapper2.getExpressAll();
		System.out.println("expressAll.size() = "+expressAll.size());
		for (int i1 = 0; i1 < expressAll.size(); i1++) {
			BaseUserExpressEntity entity = expressAll.get(i1);
			System.out.println(i1+"  =  "+entity);
			areaMapper.insertExpress(entity);
		}
//		expressAll.forEach(baseUserExpressEntity -> {
//			System.out.println(baseUserExpressEntity);
//			areaMapper.insertExpress(baseUserExpressEntity);
//		});
		System.out.println("expressAll.size() = "+expressAll.size());
	}

	@Test
	public void sortTest(){
		List<String> aa = new ArrayList<>();
		aa.add("a");
		aa.add("a46w5");
		aa.add("aabcd");
		aa.add("aabcd");
		aa.add("awe");
		aa.add("awe");
		Collections.sort(aa, (String h1, String h2) -> h2.length() - h1.length());
		System.out.println(aa);

		int youNumber = 15;
		// 0 代表前面补充0
		// 4 代表长度为4
		// d 代表参数为正数型
		String str = String.format("%04d", youNumber);
		System.out.println(str); // 0001

		Stream<String> distinct = aa.stream().distinct();

		System.out.println(distinct);
		distinct.forEach(dis -> {
			System.out.println(dis);
		});
	}
	@Test
	public void redisCon(){
		AreaParam userParam=new AreaParam();
		userParam.setCompanyCode("117400");
		userParam.setBusinessDistrict("210202");
		userParam.setCurrentPage(1);
		List<BaseOrganizeArea> areaList=areaMapper.getListByPage(userParam);
		areaList.forEach(area ->{
			System.out.println(area);
			redisManager.SetListCacheCommon("AreaCode2:" + area.getBusinessDistrict(), areaList, 120L);
			redisService.set("AreaCode1:" + area.getBusinessDistrict(), areaList, 120L);
		});
//		List<BaseOrganizeArea> list1 = redisService.getList("AreaCode1:210202", BaseOrganizeArea.class);
//		list1.forEach(area1 -> {
//			System.out.println("area1 = "+area1);
//		});
//		List<BaseOrganizeArea> list2 = redisManager.GetListCacheCommon("AreaCode2:210202");
//		list2.forEach(area2 -> {
//			System.out.println("area2 = "+area2);
//		});

	}

	@Test
	public void contextLoads() {
		Order order = orderCallMapper.getOrderByOrderId("ST194115034693");
//		System.out.println("order = "+order);
		int insert = orderMapper.insertSelective(order);
		System.out.println("insert ="+ insert +", order ="+ order);
	}

	@Test
	public void getlistByDate() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		map.put("beginTime",sdf.format(new Date(System.currentTimeMillis() - 200000000)) );
//		map.put("endTime",sdf.format(new Date()));
		map.put("beginTime","2019-06-06 00:00:00");
		map.put("endTime","2019-06-11 00:00:00");
		map.put("sendProv","辽宁省");

		System.out.println("map = "+map);
		List<Order> orders = orderCallMapper.getListByProv(map);
		orders.forEach(order -> {
			orderMapper.insertSelective(order);
			System.out.println("getlistByDate ="+ order);
		});
		System.out.println("orders.size() ="+ orders.size());
	}

	@Test
	public void testPage() {
		AreaParam userParam=new AreaParam();
		userParam.setCompanyCode("223316");
		userParam.setBusinessDistrict("洛阳市");
		userParam.setCurrentPage(1);
		List<BaseOrganizeArea> users=areaMapper.getListByPage(userParam);
		System.out.println(users);
		long count=areaMapper.getCount(userParam);
		Page page = new Page(userParam,count,users);
		System.out.println(page);
	}

	@Test
	public void insert2() throws ParseException {
//		Date date = new Date(System.currentTimeMillis()-9300032L);
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String format = dateFormat.format(date);
//		System.out.println(format);
//		return; 兴和街 兰州牛肉面 胶州街 西南路46 同德路 爱民巷15号楼？合力巷？ 绿园街 怡景园 星海花园？平安银行？永青驾校 第46中学 现代博物馆 宁安大厦 千汇城？中山分局
		BaseArea area = new BaseArea();
		area.setRoadName("兴和街");
		area.setId(UUID.randomUUID().toString().replace("-", ""));
		System.out.println("id : "+area.getId());
		area.setOddOrEven(0);
		area.setMinRoad(0);
		area.setMaxRoad(0);
		area.setCompanyName("辽宁大连秀月公司");
		area.setCompanyCode("116140");
		area.setProvince("辽宁省");
		area.setDistrict("中山区");
		area.setCity("大连市");
		area.setCreateUserId("c8e0d7cdb08f4561952d2e8e9853e815");
		area.setCreateBy("张洋");
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
		String format = dateFormat.format(date);
		System.out.println("format : "+format);
		Date parse = dateFormat.parse("2019-03-15 13:57:28");
		System.out.println("Date parse : "+parse);
		area.setCreateOn(format);
		area.setModifiedUserId("c8e0d7cdb08f4561952d2e8e9853e815");
		area.setModifiedBy("张洋");
		area.setModifiedOn(format);
		area.setEnabled(1);
		area.setDeletionStateCode(0);
		String districtCode = AddressResolutionUtil.getDistrictCode("辽宁", area.getCity(), area.getDistrict());
		area.setBusinessDistrict(districtCode);
		areaMapper2.insert(area);
//		areaMapper2.insertSelective(area);
		System.out.println(area);
	}


}
