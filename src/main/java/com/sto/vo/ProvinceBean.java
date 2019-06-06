package com.sto.vo;


import java.io.Serializable;
import java.util.ArrayList;

/**
 * @2Do:
 * @Author M2
 * @Version v ${VERSION}
 * @Date 2017/7/7 0007.
 */
public class ProvinceBean implements Serializable {

    private String id; /*110101*/

    private String name; /*东城区*/

    private ArrayList<CityBean> cityList;

    public String getId() {
        return id == null ? "" : id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CityBean> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<CityBean> cityList) {
        this.cityList = cityList;
    }

    public ProvinceBean() {
    }

    @Override
    public String toString() {
        return "ProvinceBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cityList=" + cityList +
                '}';
    }
}
