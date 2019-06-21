package com.sto.order.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 网点区域范围
 */
public class BaseOrganizeArea implements Serializable{
    private static final long serialVersionUID = 1L;

    private String id;
    // 县级别行政区域主键
    private String businessDistrict;
    // 业务区域名称地点名称（大厦，医院，便利店，大学，小区，农村等）
    /// 区域之间用中文全角分号"；"隔开，例如：春江花月（晓风苑、江树苑、月华苑、 流云苑）；姚江路3号-5号
    private String placeName;
    // 匹配的关键字搜索
    private String roadName;
    // 单双号（0：全部，1：单号，2：双号）
    private Integer oddOrEven;
    // 起始路编号
    private Integer minRoad;
    // 结束路编号
    private Integer maxRoad;
    // 组织机构编号
    private String companyCode;
    // 组织机构
    private String companyName;
    // 业务员编号
    private String userCode;

    private Timestamp createOn;

    private String createUserId;

    private String createBy;

    private Timestamp modifiedOn;

    private String modifiedUserId;

    private String modifiedBy;
    // 有效
    private Integer enabled;
    // 删除标志：0未删除，1已删除
    private Integer deletionStateCode;

    private String auditStatus;

    private String province;

    private String city;

    private String district;
    // 排序码
    private Integer sortCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusinessDistrict() {
        return businessDistrict;
    }

    public void setBusinessDistrict(String businessDistrict) {
        this.businessDistrict = businessDistrict == null ? null : businessDistrict.trim();
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName == null ? null : roadName.trim();
    }

    public Integer getOddOrEven() {
        return oddOrEven;
    }

    public void setOddOrEven(Integer oddOrEven) {
        this.oddOrEven = oddOrEven;
    }

    public Integer getMinRoad() {
        return minRoad;
    }

    public void setMinRoad(Integer minRoad) {
        this.minRoad = minRoad;
    }

    public Integer getMaxRoad() {
        return maxRoad;
    }

    public void setMaxRoad(Integer maxRoad) {
        this.maxRoad = maxRoad;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Timestamp getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Timestamp createOn) {
        this.createOn = createOn;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId == null ? null : modifiedUserId.trim();
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getDeletionStateCode() {
        return deletionStateCode;
    }

    public void setDeletionStateCode(Integer deletionStateCode) {
        this.deletionStateCode = deletionStateCode;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Integer getSortCode() {
        return sortCode;
    }

    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }

    @Override
    public String toString() {
        return "BaseOrganizeArea{" +
                "id='" + id + '\'' +
                ", businessDistrict='" + businessDistrict + '\'' +
                ", placeName='" + placeName + '\'' +
                ", roadName='" + roadName + '\'' +
                ", oddOrEven=" + oddOrEven +
                ", minRoad=" + minRoad +
                ", maxRoad=" + maxRoad +
                ", companyCode='" + companyCode + '\'' +
                ", userCode='" + userCode + '\'' +
                ", createOn=" + createOn +
                ", createUserId='" + createUserId + '\'' +
                ", createBy='" + createBy + '\'' +
                ", modifiedOn=" + modifiedOn +
                ", modifiedUserId='" + modifiedUserId + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", enabled=" + enabled +
                ", deletionStateCode=" + deletionStateCode +
                ", auditStatus='" + auditStatus + '\'' +
                ", companyName='" + companyName + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", sortCode=" + sortCode +
                '}';
    }
}