package com.sto.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 用户快递信息表
 */
public class BaseUserExpressEntity {
 
    // 用户ID
    public String id;
    // 公司主键
    public String companyId;
    // 扫描检测余额(0不检测，1检测)
    private int isCheckBalance;
    // 中转附加费
    private int transferAddFee;
    // 所属承包区ID
    private String ownerId;
    // 所属承包区
    private String ownerRange;
    // 派件附加费
    private int dispatchAddFee;
    // 收件区域
    private String receiveArea;
    // 派件区域 区域之间用中文全角分号"；"隔开，例如：春江花月（晓风苑、江树苑、月华苑、 流云苑）；姚江路3号-5号
    private String dispArea;
    // 百度经度
    private String longitude;
    // 百度纬度
    private String latitude;
    // 外网启用：0不启用，1启用(需要默认值修改为0，防止默认增加的数据外网展示了)
    private int webEnabled;
    // 创建用户主键
    private String createUserId ;
    // 创建用户
    private String createBy;
    // 创建日期
    private Timestamp createOn;
    // 修改用户主键
    private String modifiedUserId;
    // 修改用户
    private String modifiedBy;
    // 修改日期
    private Timestamp modifiedOn;
    // 三段码
    private String sanDuanMa;
    // 收件：1，收件，0，不收件
    private int isReceive = 1;
    // 派件：1，派件，0，不派件
    private int isDisp = 0;
    // 接收网络订单：0不接收，1接收，默认应该是接受才对，否则都很麻烦了
    private int networkOrders = 1;
    // 订单分派给某个员工，当前员工不接单时可以将订单分配给其他员工
    private String orderAssignTo;
    // 所属职能，对外合作(菜鸟)的员工职能，1：小件员 3：财务 4: 运营, 5: 客服, 6: 网管,7:质控, 8: IT, 9:市场; 99:其他
    private String cooperateFunction;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public int getIsCheckBalance() {
        return isCheckBalance;
    }

    public void setIsCheckBalance(int isCheckBalance) {
        this.isCheckBalance = isCheckBalance;
    }

    public int getTransferAddFee() {
        return transferAddFee;
    }

    public void setTransferAddFee(int transferAddFee) {
        this.transferAddFee = transferAddFee;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerRange() {
        return ownerRange;
    }

    public void setOwnerRange(String ownerRange) {
        this.ownerRange = ownerRange;
    }

    public int getDispatchAddFee() {
        return dispatchAddFee;
    }

    public void setDispatchAddFee(int dispatchAddFee) {
        this.dispatchAddFee = dispatchAddFee;
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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public int getWebEnabled() {
        return webEnabled;
    }

    public void setWebEnabled(int webEnabled) {
        this.webEnabled = webEnabled;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Timestamp createOn) {
        this.createOn = createOn;
    }

    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getSanDuanMa() {
        return sanDuanMa;
    }

    public void setSanDuanMa(String sanDuanMa) {
        this.sanDuanMa = sanDuanMa;
    }

    public int getIsReceive() {
        return isReceive;
    }

    public void setIsReceive(int isReceive) {
        this.isReceive = isReceive;
    }

    public int getIsDisp() {
        return isDisp;
    }

    public void setIsDisp(int isDisp) {
        this.isDisp = isDisp;
    }

    public int getNetworkOrders() {
        return networkOrders;
    }

    public void setNetworkOrders(int networkOrders) {
        this.networkOrders = networkOrders;
    }

    public String getOrderAssignTo() {
        return orderAssignTo;
    }

    public void setOrderAssignTo(String orderAssignTo) {
        this.orderAssignTo = orderAssignTo;
    }

    public String getCooperateFunction() {
        return cooperateFunction;
    }

    public void setCooperateFunction(String cooperateFunction) {
        this.cooperateFunction = cooperateFunction;
    }

    @Override
    public String toString() {
        return "BaseUserExpressEntity{" +
                "id='" + id + '\'' +
                ", companyId='" + companyId + '\'' +
                ", isCheckBalance=" + isCheckBalance +
                ", transferAddFee=" + transferAddFee +
                ", ownerId='" + ownerId + '\'' +
                ", ownerRange='" + ownerRange + '\'' +
                ", dispatchAddFee=" + dispatchAddFee +
                ", receiveArea='" + receiveArea + '\'' +
                ", dispArea='" + dispArea + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", webEnabled=" + webEnabled +
                ", createUserId='" + createUserId + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createOn=" + createOn +
                ", modifiedUserId='" + modifiedUserId + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedOn=" + modifiedOn +
                ", sanDuanMa='" + sanDuanMa + '\'' +
                ", isReceive=" + isReceive +
                ", isDisp=" + isDisp +
                ", networkOrders=" + networkOrders +
                ", orderAssignTo='" + orderAssignTo + '\'' +
                ", cooperateFunction='" + cooperateFunction + '\'' +
                '}';
    }
}
