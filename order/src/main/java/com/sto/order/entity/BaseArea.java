package com.sto.order.entity;


import java.io.Serializable;

public class BaseArea implements Serializable{
    private static final long serialVersionUID = 1L;

    private String id;

    private String businessDistrict;

    private String placeName;

    private String roadName;

    private Integer oddOrEven;

    private Integer minRoad;

    private Integer maxRoad;

    private String companyCode;

    private String userCode;

    private String createOn;

    private String createUserId;

    private String createBy;

    private String modifiedOn;

    private String modifiedUserId;

    private String modifiedBy;

    private Integer enabled;

    private Integer deletionStateCode;

    private String auditStatus;

    private String companyName;

    private String province;

    private String city;

    private String district;

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

    public String getCreateOn() {
        return createOn;
    }

    public void setCreateOn(String createOn) {
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

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
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