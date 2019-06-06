/**
 * Copyright (C), 2015-2019, 申雪供应链有限公司
 * FileName: Road
 * Author:   Administrator
 * Date:     2019-04-17 20:06
 * Description: 根据省份和城市查询路名
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sto.vo;/**
 * Created by Administrator on 2019-04-17.
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈根据省份和城市查询路名〉
 *
 * @author Administrator
 * @create 2019-04-17
 * @since 1.0.0
 */
public class Road {
    private String roadName;
    private String id;

    public Road() {
    }

    public Road(String roadName, String id) {
        this.roadName = roadName;
        this.id = id;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Road{" +
                "roadName='" + roadName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
