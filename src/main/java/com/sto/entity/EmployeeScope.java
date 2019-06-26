package com.sto.entity;

/**
 * 业务员收派范围实体
 */
public class EmployeeScope {
    /**
     * 主键
     */
    private String id;

    /**
     * 编号(工号)
     */
    private String code;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 呢称
     */
    private String nickName;
    // 收件区域
    private String receiveArea;
    // 派件区域 区域之间用中文全角分号"；"隔开，例如：春江花月（晓风苑、江树苑、月华苑、 流云苑）；姚江路3号-5号
    private String dispArea;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getReceiveArea() {
        return receiveArea;
    }

    public void setReceiveArea(String receiveArea) {
        this.receiveArea = receiveArea;
    }

    public String getDispArea() {
        return dispArea;
    }

    public void setDispArea(String dispArea) {
        this.dispArea = dispArea;
    }

    @Override
    public String toString() {
        return "EmployeeScope{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", realName='" + realName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", receiveArea='" + receiveArea + '\'' +
                ", dispArea='" + dispArea + '\'' +
                '}';
    }
}
