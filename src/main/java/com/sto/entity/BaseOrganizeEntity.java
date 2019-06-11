package com.sto.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * BaseOrganizeEntity
 * 组织机构(根据区县id查询网点)
 * Created by Administrator on 2018-10-17.
 */
public class BaseOrganizeEntity implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 编号
     */
    private String code;

    /**
     * 简称
     */
    private String shortName;

    /**
     * 名称
     */
    private String fullName;

    /**
     * 标准名称
     */
    private String standardName;

    /**
     * 标准编号
     */
    private String standardCode;

    /**
     * 父级网点主键
     */
    private String parentId;

    /**
     * 父级网点名称
     */
    private String parentName;

    /**
     * 父级网点编号
     */
    private String parentCode;

    /**
     * 所属公司,一级网点主键
     */
    private String companyId;

    /**
     * 所属公司,一级网点编号
     */
    private String companyCode;

    /**
     * 所属公司,一级网点名称
     */
    private String companyName;

    /**
     * 结算中心主键
     */
    private String costCenterId;

    /**
     * 结算中心编号
     */
    private String costCenterCode;

    /**
     * 结算中心
     */
    private String costCenter;

    /**
     * 财务中心主键
     */
    private String financialCenterId;

    /**
     * 财务中心编号
     */
    private String financialCenterCode;

    /**
     * 财务中心
     */
    private String financialCenter;

    /**
     * 省级网点主键
     */
    private String provinceSiteId;

    /**
     * 省级网点编号
     */
    private String provinceSiteCode;

    /**
     * 省级网点
     */
    private String provinceSite;

    /**
     * 排序码
     */
    private Long sortCode;

    /**
     * 分类编号
     */
    private String categoryCode;

    /**
     * 层
     */
    private Short layer;

    /**
     * 外线电话(查询电话)
     */
    private String outerPhone;

    /**
     * 内线电话
     */
    private String innerPhone;

    /**
     * 传真
     */
    private String fax;

    /**
     * 邮编
     */
    private String postalCode;

    /**
     * 网址
     */
    private String web;

    /**
     * 内部组织机构
     */
    private Short isInnerOrganize;

    /**
     * 开户行
     */
    private String bank;

    /**
     * 银行帐号
     */
    private String bankAccount;

    /**
     * 描述
     */
    private String description;

    /**
     * 大片区
     */
    private String bigArea;

    /**
     * 所属片区名称
     */
    private String area;

    /**
     * 加盟方式
     */
    private String joiningMethods;

    /**
     * 是否包含下属节点
     */
    private Short containChildNodes;

    /**
     * 快速查询码
     */
    private String quickQuery;

    /**
     * 简拼
     */
    private String simpleSpelling;

    /**
     * 省主键
     */
    private String provinceId;

    /**
     * 省
     */
    private String province;

    /**
     * 市主键
     */
    private String cityId;

    /**
     * 市
     */
    private String city;

    /**
     * 县区主键
     */
    private String districtId;

    /**
     * 县
     */
    private String district;

    /**
     * 街道主键
     */
    private String streetId;

    /**
     * 街道名称
     */
    private String street;

    /**
     * 地址
     */
    private String address;

    /**
     * 统计名称
     */
    private String statisticalName;

    /**
     * 经理主键
     */
    private String masterId;

    /**
     * 网点负责人
     */
    private String master;

    /**
     * 网点负责人手机
     */
    private String masterMobile;

    /**
     * 网点负责人QQ
     */
    private String masterQq;

    /**
     * 紧急联系电话(e3公司总机)
     */
    private String emergencyCall;

    /**
     * 业务电话（e3业务电话总机）
     */
    private String businessPhone;

    /**
     * 业务负责人
     */
    private String manager;

    /**
     * 业务负责人手机
     */
    private String managerMobile;

    /**
     * 业务负责人QQ
     */
    private String managerQq;

    /**
     * 客服经理姓名(外网)
     */
    private String serviceManager;

    /**
     * 客服经理手机号码(外网)
     */
    private String serviceManagerMobile;

    /**
     * 客服经理主键(外网)
     */
    private String serviceManagerId;

    /**
     * 投诉电话
     */
    private String complaintPhone;

    /**
     * 所属组织机构主键
     */
    private String manageId;

    /**
     * 所属组织机构
     */
    private String manageName;

    /**
     * 删除标记：0未删除，1删除
     */
    private Short deletionStateCode;

    /**
     * 有效：0无效，1有效
     */
    private Short enabled;

    /**
     * 创建日期
     */
    private Timestamp createOn;

    /**
     * 创建用户主键
     */
    private String createUserId;

    /**
     * 创建用户
     */
    private String createBy;

    /**
     * 修改日期
     */
    private Timestamp modifiedOn;

    /**
     * 修改用户主键
     */
    private String modifiedUserId;

    /**
     * 修改用户
     */
    private String modifiedBy;

    /**
     * 网点电话，临时存放在这里，后期分开
     */
    private String siteTelephone;

    /**
     * 外网启用：0不启用，1启用
     */
    private Short webEnabled;

    /**
     * 业务负责人电话
     */
    private String managerPhone;

    /**
     * 客服经理电话(外网)
     */
    private String serviceManagerPhone;

    /**
     * 客服经理QQ(外网)
     */
    private String serviceManagerQq;

    /**
     * 经理电话
     */
    private String masterPhone;

    /**
     * 国家主键(中国是86)
     */
    private String countryId;

    /**
     * 国家
     */
    private String country;

    /**
     * 网点来源
     */
    private String organizeFrom;

    /**
     * 审核状态 
     */
    private String auditStatus;

    /**
     * 主键
     * @return ID 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 编号
     * @return CODE 编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 编号
     * @param code 编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 简称
     * @return SHORT_NAME 简称
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 简称
     * @param shortName 简称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * 名称
     * @return FULL_NAME 名称
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 名称
     * @param fullName 名称
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 标准名称
     * @return STANDARD_NAME 标准名称
     */
    public String getStandardName() {
        return standardName;
    }

    /**
     * 标准名称
     * @param standardName 标准名称
     */
    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    /**
     * 标准编号
     * @return STANDARD_CODE 标准编号
     */
    public String getStandardCode() {
        return standardCode;
    }

    /**
     * 标准编号
     * @param standardCode 标准编号
     */
    public void setStandardCode(String standardCode) {
        this.standardCode = standardCode;
    }

    /**
     * 父级网点主键
     * @return PARENT_ID 父级网点主键
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 父级网点主键
     * @param parentId 父级网点主键
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 父级网点名称
     * @return PARENT_NAME 父级网点名称
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * 父级网点名称
     * @param parentName 父级网点名称
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * 父级网点编号
     * @return PARENT_CODE 父级网点编号
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 父级网点编号
     * @param parentCode 父级网点编号
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * 所属公司,一级网点主键
     * @return COMPANY_ID 所属公司,一级网点主键
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 所属公司,一级网点主键
     * @param companyId 所属公司,一级网点主键
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 所属公司,一级网点编号
     * @return COMPANY_CODE 所属公司,一级网点编号
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 所属公司,一级网点编号
     * @param companyCode 所属公司,一级网点编号
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 所属公司,一级网点名称
     * @return COMPANY_NAME 所属公司,一级网点名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 所属公司,一级网点名称
     * @param companyName 所属公司,一级网点名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 结算中心主键
     * @return COST_CENTER_ID 结算中心主键
     */
    public String getCostCenterId() {
        return costCenterId;
    }

    /**
     * 结算中心主键
     * @param costCenterId 结算中心主键
     */
    public void setCostCenterId(String costCenterId) {
        this.costCenterId = costCenterId;
    }

    /**
     * 结算中心编号
     * @return COST_CENTER_CODE 结算中心编号
     */
    public String getCostCenterCode() {
        return costCenterCode;
    }

    /**
     * 结算中心编号
     * @param costCenterCode 结算中心编号
     */
    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    /**
     * 结算中心
     * @return COST_CENTER 结算中心
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * 结算中心
     * @param costCenter 结算中心
     */
    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    /**
     * 财务中心主键
     * @return FINANCIAL_CENTER_ID 财务中心主键
     */
    public String getFinancialCenterId() {
        return financialCenterId;
    }

    /**
     * 财务中心主键
     * @param financialCenterId 财务中心主键
     */
    public void setFinancialCenterId(String financialCenterId) {
        this.financialCenterId = financialCenterId;
    }

    /**
     * 财务中心编号
     * @return FINANCIAL_CENTER_CODE 财务中心编号
     */
    public String getFinancialCenterCode() {
        return financialCenterCode;
    }

    /**
     * 财务中心编号
     * @param financialCenterCode 财务中心编号
     */
    public void setFinancialCenterCode(String financialCenterCode) {
        this.financialCenterCode = financialCenterCode;
    }

    /**
     * 财务中心
     * @return FINANCIAL_CENTER 财务中心
     */
    public String getFinancialCenter() {
        return financialCenter;
    }

    /**
     * 财务中心
     * @param financialCenter 财务中心
     */
    public void setFinancialCenter(String financialCenter) {
        this.financialCenter = financialCenter;
    }

    /**
     * 省级网点主键
     * @return PROVINCE_SITE_ID 省级网点主键
     */
    public String getProvinceSiteId() {
        return provinceSiteId;
    }

    /**
     * 省级网点主键
     * @param provinceSiteId 省级网点主键
     */
    public void setProvinceSiteId(String provinceSiteId) {
        this.provinceSiteId = provinceSiteId;
    }

    /**
     * 省级网点编号
     * @return PROVINCE_SITE_CODE 省级网点编号
     */
    public String getProvinceSiteCode() {
        return provinceSiteCode;
    }

    /**
     * 省级网点编号
     * @param provinceSiteCode 省级网点编号
     */
    public void setProvinceSiteCode(String provinceSiteCode) {
        this.provinceSiteCode = provinceSiteCode;
    }

    /**
     * 省级网点
     * @return PROVINCE_SITE 省级网点
     */
    public String getProvinceSite() {
        return provinceSite;
    }

    /**
     * 省级网点
     * @param provinceSite 省级网点
     */
    public void setProvinceSite(String provinceSite) {
        this.provinceSite = provinceSite;
    }

    /**
     * 排序码
     * @return SORT_CODE 排序码
     */
    public Long getSortCode() {
        return sortCode;
    }

    /**
     * 排序码
     * @param sortCode 排序码
     */
    public void setSortCode(Long sortCode) {
        this.sortCode = sortCode;
    }

    /**
     * 分类编号
     * @return CATEGORY_CODE 分类编号
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * 分类编号
     * @param categoryCode 分类编号
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * 层
     * @return LAYER 层
     */
    public Short getLayer() {
        return layer;
    }

    /**
     * 层
     * @param layer 层
     */
    public void setLayer(Short layer) {
        this.layer = layer;
    }

    /**
     * 外线电话(查询电话)
     * @return OUTER_PHONE 外线电话(查询电话)
     */
    public String getOuterPhone() {
        return outerPhone;
    }

    /**
     * 外线电话(查询电话)
     * @param outerPhone 外线电话(查询电话)
     */
    public void setOuterPhone(String outerPhone) {
        this.outerPhone = outerPhone;
    }

    /**
     * 内线电话
     * @return INNER_PHONE 内线电话
     */
    public String getInnerPhone() {
        return innerPhone;
    }

    /**
     * 内线电话
     * @param innerPhone 内线电话
     */
    public void setInnerPhone(String innerPhone) {
        this.innerPhone = innerPhone;
    }

    /**
     * 传真
     * @return FAX 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 传真
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 邮编
     * @return POSTAL_CODE 邮编
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 邮编
     * @param postalCode 邮编
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 网址
     * @return WEB 网址
     */
    public String getWeb() {
        return web;
    }

    /**
     * 网址
     * @param web 网址
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * 内部组织机构
     * @return IS_INNER_ORGANIZE 内部组织机构
     */
    public Short getIsInnerOrganize() {
        return isInnerOrganize;
    }

    /**
     * 内部组织机构
     * @param isInnerOrganize 内部组织机构
     */
    public void setIsInnerOrganize(Short isInnerOrganize) {
        this.isInnerOrganize = isInnerOrganize;
    }

    /**
     * 开户行
     * @return BANK 开户行
     */
    public String getBank() {
        return bank;
    }

    /**
     * 开户行
     * @param bank 开户行
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * 银行帐号
     * @return BANK_ACCOUNT 银行帐号
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 银行帐号
     * @param bankAccount 银行帐号
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * 描述
     * @return DESCRIPTION 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 大片区
     * @return BIG_AREA 大片区
     */
    public String getBigArea() {
        return bigArea;
    }

    /**
     * 大片区
     * @param bigArea 大片区
     */
    public void setBigArea(String bigArea) {
        this.bigArea = bigArea;
    }

    /**
     * 所属片区名称
     * @return AREA 所属片区名称
     */
    public String getArea() {
        return area;
    }

    /**
     * 所属片区名称
     * @param area 所属片区名称
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 加盟方式
     * @return JOINING_METHODS 加盟方式
     */
    public String getJoiningMethods() {
        return joiningMethods;
    }

    /**
     * 加盟方式
     * @param joiningMethods 加盟方式
     */
    public void setJoiningMethods(String joiningMethods) {
        this.joiningMethods = joiningMethods;
    }

    /**
     * 是否包含下属节点
     * @return CONTAIN_CHILD_NODES 是否包含下属节点
     */
    public Short getContainChildNodes() {
        return containChildNodes;
    }

    /**
     * 是否包含下属节点
     * @param containChildNodes 是否包含下属节点
     */
    public void setContainChildNodes(Short containChildNodes) {
        this.containChildNodes = containChildNodes;
    }

    /**
     * 快速查询码
     * @return QUICK_QUERY 快速查询码
     */
    public String getQuickQuery() {
        return quickQuery;
    }

    /**
     * 快速查询码
     * @param quickQuery 快速查询码
     */
    public void setQuickQuery(String quickQuery) {
        this.quickQuery = quickQuery;
    }

    /**
     * 简拼
     * @return SIMPLE_SPELLING 简拼
     */
    public String getSimpleSpelling() {
        return simpleSpelling;
    }

    /**
     * 简拼
     * @param simpleSpelling 简拼
     */
    public void setSimpleSpelling(String simpleSpelling) {
        this.simpleSpelling = simpleSpelling;
    }

    /**
     * 省主键
     * @return PROVINCE_ID 省主键
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 省主键
     * @param provinceId 省主键
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 省
     * @return PROVINCE 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 市主键
     * @return CITY_ID 市主键
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 市主键
     * @param cityId 市主键
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * 市
     * @return CITY 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 市
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 县区主键
     * @return DISTRICT_ID 县区主键
     */
    public String getDistrictId() {
        return districtId;
    }

    /**
     * 县区主键
     * @param districtId 县区主键
     */
    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    /**
     * 县
     * @return DISTRICT 县
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 县
     * @param district 县
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 街道主键
     * @return STREET_ID 街道主键
     */
    public String getStreetId() {
        return streetId;
    }

    /**
     * 街道主键
     * @param streetId 街道主键
     */
    public void setStreetId(String streetId) {
        this.streetId = streetId;
    }

    /**
     * 街道名称
     * @return STREET 街道名称
     */
    public String getStreet() {
        return street;
    }

    /**
     * 街道名称
     * @param street 街道名称
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 地址
     * @return ADDRESS 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 统计名称
     * @return STATISTICAL_NAME 统计名称
     */
    public String getStatisticalName() {
        return statisticalName;
    }

    /**
     * 统计名称
     * @param statisticalName 统计名称
     */
    public void setStatisticalName(String statisticalName) {
        this.statisticalName = statisticalName;
    }

    /**
     * 经理主键
     * @return MASTER_ID 经理主键
     */
    public String getMasterId() {
        return masterId;
    }

    /**
     * 经理主键
     * @param masterId 经理主键
     */
    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * 网点负责人
     * @return MASTER 网点负责人
     */
    public String getMaster() {
        return master;
    }

    /**
     * 网点负责人
     * @param master 网点负责人
     */
    public void setMaster(String master) {
        this.master = master;
    }

    /**
     * 网点负责人手机
     * @return MASTER_MOBILE 网点负责人手机
     */
    public String getMasterMobile() {
        return masterMobile;
    }

    /**
     * 网点负责人手机
     * @param masterMobile 网点负责人手机
     */
    public void setMasterMobile(String masterMobile) {
        this.masterMobile = masterMobile;
    }

    /**
     * 网点负责人QQ
     * @return MASTER_QQ 网点负责人QQ
     */
    public String getMasterQq() {
        return masterQq;
    }

    /**
     * 网点负责人QQ
     * @param masterQq 网点负责人QQ
     */
    public void setMasterQq(String masterQq) {
        this.masterQq = masterQq;
    }

    /**
     * 紧急联系电话(e3公司总机)
     * @return EMERGENCY_CALL 紧急联系电话(e3公司总机)
     */
    public String getEmergencyCall() {
        return emergencyCall;
    }

    /**
     * 紧急联系电话(e3公司总机)
     * @param emergencyCall 紧急联系电话(e3公司总机)
     */
    public void setEmergencyCall(String emergencyCall) {
        this.emergencyCall = emergencyCall;
    }

    /**
     * 业务电话（e3业务电话总机）
     * @return BUSINESS_PHONE 业务电话（e3业务电话总机）
     */
    public String getBusinessPhone() {
        return businessPhone;
    }

    /**
     * 业务电话（e3业务电话总机）
     * @param businessPhone 业务电话（e3业务电话总机）
     */
    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    /**
     * 业务负责人
     * @return MANAGER 业务负责人
     */
    public String getManager() {
        return manager;
    }

    /**
     * 业务负责人
     * @param manager 业务负责人
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * 业务负责人手机
     * @return MANAGER_MOBILE 业务负责人手机
     */
    public String getManagerMobile() {
        return managerMobile;
    }

    /**
     * 业务负责人手机
     * @param managerMobile 业务负责人手机
     */
    public void setManagerMobile(String managerMobile) {
        this.managerMobile = managerMobile;
    }

    /**
     * 业务负责人QQ
     * @return MANAGER_QQ 业务负责人QQ
     */
    public String getManagerQq() {
        return managerQq;
    }

    /**
     * 业务负责人QQ
     * @param managerQq 业务负责人QQ
     */
    public void setManagerQq(String managerQq) {
        this.managerQq = managerQq;
    }

    /**
     * 客服经理姓名(外网)
     * @return SERVICE_MANAGER 客服经理姓名(外网)
     */
    public String getServiceManager() {
        return serviceManager;
    }

    /**
     * 客服经理姓名(外网)
     * @param serviceManager 客服经理姓名(外网)
     */
    public void setServiceManager(String serviceManager) {
        this.serviceManager = serviceManager;
    }

    /**
     * 客服经理手机号码(外网)
     * @return SERVICE_MANAGER_MOBILE 客服经理手机号码(外网)
     */
    public String getServiceManagerMobile() {
        return serviceManagerMobile;
    }

    /**
     * 客服经理手机号码(外网)
     * @param serviceManagerMobile 客服经理手机号码(外网)
     */
    public void setServiceManagerMobile(String serviceManagerMobile) {
        this.serviceManagerMobile = serviceManagerMobile;
    }

    /**
     * 客服经理主键(外网)
     * @return SERVICE_MANAGER_ID 客服经理主键(外网)
     */
    public String getServiceManagerId() {
        return serviceManagerId;
    }

    /**
     * 客服经理主键(外网)
     * @param serviceManagerId 客服经理主键(外网)
     */
    public void setServiceManagerId(String serviceManagerId) {
        this.serviceManagerId = serviceManagerId;
    }

    /**
     * 投诉电话
     * @return COMPLAINT_PHONE 投诉电话
     */
    public String getComplaintPhone() {
        return complaintPhone;
    }

    /**
     * 投诉电话
     * @param complaintPhone 投诉电话
     */
    public void setComplaintPhone(String complaintPhone) {
        this.complaintPhone = complaintPhone;
    }

    /**
     * 所属组织机构主键
     * @return MANAGE_ID 所属组织机构主键
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 所属组织机构主键
     * @param manageId 所属组织机构主键
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 所属组织机构
     * @return MANAGE_NAME 所属组织机构
     */
    public String getManageName() {
        return manageName;
    }

    /**
     * 所属组织机构
     * @param manageName 所属组织机构
     */
    public void setManageName(String manageName) {
        this.manageName = manageName;
    }

    /**
     * 删除标记：0未删除，1删除
     * @return DELETION_STATE_CODE 删除标记：0未删除，1删除
     */
    public Short getDeletionStateCode() {
        return deletionStateCode;
    }

    /**
     * 删除标记：0未删除，1删除
     * @param deletionStateCode 删除标记：0未删除，1删除
     */
    public void setDeletionStateCode(Short deletionStateCode) {
        this.deletionStateCode = deletionStateCode;
    }

    /**
     * 有效：0无效，1有效
     * @return ENABLED 有效：0无效，1有效
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * 有效：0无效，1有效
     * @param enabled 有效：0无效，1有效
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    /**
     * 创建日期
     * @return CREATE_ON 创建日期
     */
    public Timestamp getCreateOn() {
        return createOn;
    }

    /**
     * 创建日期
     * @param createOn 创建日期
     */
    public void setCreateOn(Timestamp createOn) {
        this.createOn = createOn;
    }

    /**
     * 创建用户主键
     * @return CREATE_USER_ID 创建用户主键
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户主键
     * @param createUserId 创建用户主键
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 创建用户
     * @return CREATE_BY 创建用户
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建用户
     * @param createBy 创建用户
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 修改日期
     * @return MODIFIED_ON 修改日期
     */
    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    /**
     * 修改日期
     * @param modifiedOn 修改日期
     */
    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    /**
     * 修改用户主键
     * @return MODIFIED_USER_ID 修改用户主键
     */
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    /**
     * 修改用户主键
     * @param modifiedUserId 修改用户主键
     */
    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    /**
     * 修改用户
     * @return MODIFIED_BY 修改用户
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 修改用户
     * @param modifiedBy 修改用户
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * 网点电话，临时存放在这里，后期分开
     * @return SITE_TELEPHONE 网点电话，临时存放在这里，后期分开
     */
    public String getSiteTelephone() {
        return siteTelephone;
    }

    /**
     * 网点电话，临时存放在这里，后期分开
     * @param siteTelephone 网点电话，临时存放在这里，后期分开
     */
    public void setSiteTelephone(String siteTelephone) {
        this.siteTelephone = siteTelephone;
    }

    /**
     * 外网启用：0不启用，1启用
     * @return WEB_ENABLED 外网启用：0不启用，1启用
     */
    public Short getWebEnabled() {
        return webEnabled;
    }

    /**
     * 外网启用：0不启用，1启用
     * @param webEnabled 外网启用：0不启用，1启用
     */
    public void setWebEnabled(Short webEnabled) {
        this.webEnabled = webEnabled;
    }

    /**
     * 业务负责人电话
     * @return MANAGER_PHONE 业务负责人电话
     */
    public String getManagerPhone() {
        return managerPhone;
    }

    /**
     * 业务负责人电话
     * @param managerPhone 业务负责人电话
     */
    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    /**
     * 客服经理电话(外网)
     * @return SERVICE_MANAGER_PHONE 客服经理电话(外网)
     */
    public String getServiceManagerPhone() {
        return serviceManagerPhone;
    }

    /**
     * 客服经理电话(外网)
     * @param serviceManagerPhone 客服经理电话(外网)
     */
    public void setServiceManagerPhone(String serviceManagerPhone) {
        this.serviceManagerPhone = serviceManagerPhone;
    }

    /**
     * 客服经理QQ(外网)
     * @return SERVICE_MANAGER_QQ 客服经理QQ(外网)
     */
    public String getServiceManagerQq() {
        return serviceManagerQq;
    }

    /**
     * 客服经理QQ(外网)
     * @param serviceManagerQq 客服经理QQ(外网)
     */
    public void setServiceManagerQq(String serviceManagerQq) {
        this.serviceManagerQq = serviceManagerQq;
    }

    /**
     * 经理电话
     * @return MASTER_PHONE 经理电话
     */
    public String getMasterPhone() {
        return masterPhone;
    }

    /**
     * 经理电话
     * @param masterPhone 经理电话
     */
    public void setMasterPhone(String masterPhone) {
        this.masterPhone = masterPhone;
    }

    /**
     * 国家主键(中国是86)
     * @return COUNTRY_ID 国家主键(中国是86)
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * 国家主键(中国是86)
     * @param countryId 国家主键(中国是86)
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    /**
     * 国家
     * @return COUNTRY 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 国家
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 网点来源
     * @return ORGANIZE_FROM 网点来源
     */
    public String getOrganizeFrom() {
        return organizeFrom;
    }

    /**
     * 网点来源
     * @param organizeFrom 网点来源
     */
    public void setOrganizeFrom(String organizeFrom) {
        this.organizeFrom = organizeFrom;
    }

    /**
     * 审核状态 
     * @return AUDIT_STATUS 审核状态 
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * 审核状态 
     * @param auditStatus 审核状态 
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    @Override
    public String toString() {
        return "BaseOrganizeEntity{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", shortName='" + shortName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", standardName='" + standardName + '\'' +
                ", standardCode='" + standardCode + '\'' +
                ", parentId='" + parentId + '\'' +
                ", parentName='" + parentName + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", companyId='" + companyId + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", costCenterId='" + costCenterId + '\'' +
                ", costCenterCode='" + costCenterCode + '\'' +
                ", costCenter='" + costCenter + '\'' +
                ", financialCenterId='" + financialCenterId + '\'' +
                ", financialCenterCode='" + financialCenterCode + '\'' +
                ", financialCenter='" + financialCenter + '\'' +
                ", provinceSiteId='" + provinceSiteId + '\'' +
                ", provinceSiteCode='" + provinceSiteCode + '\'' +
                ", provinceSite='" + provinceSite + '\'' +
                ", sortCode=" + sortCode +
                ", categoryCode='" + categoryCode + '\'' +
                ", layer=" + layer +
                ", outerPhone='" + outerPhone + '\'' +
                ", innerPhone='" + innerPhone + '\'' +
                ", fax='" + fax + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", web='" + web + '\'' +
                ", isInnerOrganize=" + isInnerOrganize +
                ", bank='" + bank + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", description='" + description + '\'' +
                ", bigArea='" + bigArea + '\'' +
                ", area='" + area + '\'' +
                ", joiningMethods='" + joiningMethods + '\'' +
                ", containChildNodes=" + containChildNodes +
                ", quickQuery='" + quickQuery + '\'' +
                ", simpleSpelling='" + simpleSpelling + '\'' +
                ", provinceId='" + provinceId + '\'' +
                ", province='" + province + '\'' +
                ", cityId='" + cityId + '\'' +
                ", city='" + city + '\'' +
                ", districtId='" + districtId + '\'' +
                ", district='" + district + '\'' +
                ", streetId='" + streetId + '\'' +
                ", street='" + street + '\'' +
                ", address='" + address + '\'' +
                ", statisticalName='" + statisticalName + '\'' +
                ", masterId='" + masterId + '\'' +
                ", master='" + master + '\'' +
                ", masterMobile='" + masterMobile + '\'' +
                ", masterQq='" + masterQq + '\'' +
                ", emergencyCall='" + emergencyCall + '\'' +
                ", businessPhone='" + businessPhone + '\'' +
                ", manager='" + manager + '\'' +
                ", managerMobile='" + managerMobile + '\'' +
                ", managerQq='" + managerQq + '\'' +
                ", serviceManager='" + serviceManager + '\'' +
                ", serviceManagerMobile='" + serviceManagerMobile + '\'' +
                ", serviceManagerId='" + serviceManagerId + '\'' +
                ", complaintPhone='" + complaintPhone + '\'' +
                ", manageId='" + manageId + '\'' +
                ", manageName='" + manageName + '\'' +
                ", deletionStateCode=" + deletionStateCode +
                ", enabled=" + enabled +
                ", createOn=" + createOn +
                ", createUserId='" + createUserId + '\'' +
                ", createBy='" + createBy + '\'' +
                ", modifiedOn=" + modifiedOn +
                ", modifiedUserId='" + modifiedUserId + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", siteTelephone='" + siteTelephone + '\'' +
                ", webEnabled=" + webEnabled +
                ", managerPhone='" + managerPhone + '\'' +
                ", serviceManagerPhone='" + serviceManagerPhone + '\'' +
                ", serviceManagerQq='" + serviceManagerQq + '\'' +
                ", masterPhone='" + masterPhone + '\'' +
                ", countryId='" + countryId + '\'' +
                ", country='" + country + '\'' +
                ", organizeFrom='" + organizeFrom + '\'' +
                ", auditStatus='" + auditStatus + '\'' +
                '}';
    }
}