package com.sto;

import com.sto.config.RedisManager;
import com.sto.entity.BaseArea;
import com.sto.entity.BaseOrganizeArea;
import com.sto.entity.Order;
import com.sto.mapper.one.BaseOrganizeArea1Mapper;
import com.sto.mapper.one.OrderMapper;
import com.sto.mapper.three.StoOrderCallMapper;
import com.sto.mapper.two.BaseOrganizeArea2Mapper;
import com.sto.param.AreaParam;
import com.sto.result.Page;
import com.sto.service.BaseOrganizeAreaManager;
import com.sto.service.RedisService;
import com.sto.util.AddressResolutionUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
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

	@Test
	public void testRedis(){
		areaManager.getListByAreaCodeByCache("210202", true, false, true);
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
		List<BaseOrganizeArea> list1 = redisService.getList("AreaCode1:210202", BaseOrganizeArea.class);
		list1.forEach(area1 -> {
			System.out.println("area1 = "+area1);
		});
		List<BaseOrganizeArea> list2 = redisManager.GetListCacheCommon("AreaCode2:210202");
		list2.forEach(area2 -> {
			System.out.println("area2 = "+area2);
		});

	}

	@Test
	public void contextLoads() {
		Order order = orderCallMapper.getOrderByOrderId("ST194115034693");
		System.out.println("order = "+order);
		int insert = orderMapper.insertSelective(order);
		System.out.println("insert ="+ insert +"order ="+ order);
	}

	@Test
	public void getlistByDate() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		map.put("beginTime",sdf.format(new Date(System.currentTimeMillis() - 2000000000)) );
		map.put("endTime",sdf.format(new Date()));
		System.out.println("map = "+map);
		List<Order> orders = orderCallMapper.getListByDate(map);
		orders.forEach(order -> {
			orderMapper.insertSelective(order);
			System.out.println("getlistByDate ="+ order);
		});

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
