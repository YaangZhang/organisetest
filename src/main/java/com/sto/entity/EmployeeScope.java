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
}
