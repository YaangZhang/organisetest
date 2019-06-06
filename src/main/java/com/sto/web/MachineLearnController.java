package com.sto.web;

import com.sto.entity.BaseOrganizeEntity;
import com.sto.service.BaseOrganizeAreaManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 机器学习控制器
 */
@Controller
public class MachineLearnController {
    @Autowired
    private BaseOrganizeAreaManager areaManager;

    public List<String> MachineLearning(String provinceName, String cityName, String cityCode, String districtName,
                                        String districtCode, String address, Date signFor, String organizeCode, String userCode) {
       List<String> result = new ArrayList<>();

        String areaCode = districtCode;
        if (StringUtils.isEmpty(areaCode) || StringUtils.isEmpty(districtName)
                || StringUtils.isEmpty(organizeCode) || organizeCode.length() < 6) {
            return result;
        }
        // 用户可以是空的，只标注是这个网点的数据
        if (StringUtils.isEmpty(userCode)) {
            userCode = organizeCode;
        } else if (!userCode.startsWith(organizeCode)) {
            return result;
        }

//        省市都对不上的垃圾数据根本没必要学习，反而会让数据更脏一些，差距太远去了，除非特殊的情况下的。
        BaseOrganizeEntity entity = areaManager.getObjectByCodeByCache(organizeCode);
        if (entity == null || !entity.Province.equals(provinceName) || !entity.City.equals(cityName)) {
            return result;
        }

        return result;
    }

}
