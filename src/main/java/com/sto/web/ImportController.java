/**
 * Copyright (C), 2015-2019, 申雪供应链有限公司
 * FileName: ImportController
 * Author:   Administrator
 * Date:     2019-03-25 18:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sto.web;/**
 * Created by Administrator on 2019-03-25.
 */

import com.sto.entity.BaseArea;
import com.sto.mapper.one.BaseOrganizeArea1Mapper;
import com.sto.mapper.two.BaseOrganizeArea2Mapper;
import com.sto.service.ImportService;
import com.sto.util.AddressResolutionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019-03-25
 * @since 1.0.0
 */
@Controller
@RequestMapping("/file")
public class ImportController {

    @Value("classpath:static/china_city_data.json")
    private Resource areaRes;

    @Autowired
    private ImportService importService;
    @Autowired
    private BaseOrganizeArea1Mapper areaMapper;
    @Autowired
    private BaseOrganizeArea2Mapper areaMapper2;


    @GetMapping("/index")
    public String importExcel(){
        return "index";
    }

    @PostMapping(value = "/upload")
    @ResponseBody
    public String uploadExcel(HttpServletRequest request) throws Exception {
        long start = System.currentTimeMillis();
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("filename");
        if (file.isEmpty()) {
            return "文件不能为空";
        }
        InputStream inputStream = file.getInputStream();
        List<List<List<Object>>> list = importService.getBankListByExcel(inputStream, file.getOriginalFilename());

        inputStream.close();
        System.out.println("list ="+list);

        BaseArea area = new BaseArea();
        // area.setCreateOn(importService.getStringDate());

//        for (int j = 0; j < list.size(); j++) {
//            List<List<Object>> bookList = list.get(j);
            
//        }
        for (List<List<Object>> bookList : list) {

            if (bookList.size() > 0) {
                area.setOddOrEven(0);
                area.setMinRoad(0);
                area.setMaxRoad(0);
//                Date date = new Date(System.currentTimeMillis()-j*2000L);
//                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                String format = dateFormat.format(date);
//                area.setCreateOn(format);
                System.out.println("bookList ="+bookList);
                area.setCompanyName(bookList.get(0).get(0).toString());
                area.setCompanyCode(bookList.get(0).get(1).toString());
                area.setProvince("辽宁省");
                area.setDistrict(bookList.get(0).get(4).toString());
                area.setCity(bookList.get(0).get(3).toString());
//                area.setCreateUserId(bookList.get(0).get(6).toString());
                area.setCreateUserId("c8e0d7cdb08f4561952d2e8e9853e815");
                area.setCreateBy("张洋");
//                area.setCreateBy(bookList.get(0).get(5).toString());
                area.setModifiedUserId("c8e0d7cdb08f4561952d2e8e9853e815");
                area.setModifiedBy("张洋");
//                area.setModifiedOn(format);
                area.setEnabled(1);
                area.setDeletionStateCode(0);
                String districtCode = AddressResolutionUtil.getDistrictCode("辽宁", area.getCity(), area.getDistrict());
                area.setBusinessDistrict(districtCode);
                for (int i = 1; i < bookList.size(); i++) {
                    List<Object> lo = bookList.get(i);
                    //TODO 随意发挥
                    System.out.println(lo);
//                    for (Object name : lo) {
                        for (int j = 0; j < lo.size(); j++) {
                            Object name = lo.get(j);
                        Date date = new Date(System.currentTimeMillis()-j*1300032L);
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String format = dateFormat.format(date);
                        area.setCreateOn(format);
                        area.setModifiedOn(format);
                        if (null != name) {
                            String[] splits = name.toString().trim().split("\\s+");
                            if (splits.length > 1) {
                                for (String roadName : splits) {
                                    area.setRoadName(roadName);
                                    area.setId(UUID.randomUUID().toString().replace("-", ""));
                                    areaMapper2.insert(area);
//                                    areaMapper.insertSelective(area); 兴和街 兰州牛肉面 胶州街 西南路46 同德路 爱民巷15号楼？合力巷？ 绿园街 怡景园 星海花园？平安银行？永青驾校 第46中学 现代博物馆 宁安大厦 千汇城？中山分局？
                                     System.out.println("area : "+area.getRoadName() +", area time : "+area.getCreateOn());
                                }
                            }else {
                                area.setRoadName(name.toString().trim());
                                area.setId(UUID.randomUUID().toString().replace("-", ""));
//                                areaMapper.insertSelective(area);
                                areaMapper2.insert(area);
                                 System.out.println(" SINGLE  area : "+area.getRoadName()+", area time : "+area.getCreateOn());
                            }
                        }
                    }
                }
            }
        }
        System.out.println("所有时间 ="+(System.currentTimeMillis() - start));
        return "上传成功";
    }



}
