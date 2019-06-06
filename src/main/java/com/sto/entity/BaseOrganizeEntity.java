package com.sto.entity;

import java.io.Serializable;

/**
 * BaseOrganizeEntity
 * 组织机构(根据区县id查询网点)
 * Created by Administrator on 2018-10-17.
 */

public class BaseOrganizeEntity implements Serializable{
    /// 主键
    public String Id;
    /// 网点来源
    public String OrganizeFrom;
    /// 编号
    public String Code;
    /// 简称
    public String ShortName;
    /// 名称
    public String FullName;
    /// 标准名称
    public String StandardName;
    /// 标准编号
    public String StandardCode;
    /// 父级网点主键
    public String ParentId;
    /// 父级网点名称
    public String ParentName;
    /// 父级网点编号
    public String ParentCode;
    /// 排序码
    public int SortCode;
    /// 分类编号
    public String CategoryCode;
    /// 层
    public int Layer;
    /// 外线电话(查询电话)
    public String OuterPhone;
    /// 内线电话
    public String InnerPhone;
    /// 传真
    public String Fax;
    /// 邮编
    public String PostalCode;
    /// 网址
    public String Web;
    /// 内部组织机构
    public int IsInnerOrganize;
    /// 开户行
    public String Bank;
    /// 银行帐号
    public String BankAccount;
    /// 描述
    public String Description;
    /// 大片区
    public String BigArea;
    /// 所属片区名称
    public String Area;
    /// 加盟方式
    public String JoiningMethods;
    /// 是否包含下属节点]
    public int ContainChildNodes;
    /// 快速查询码
    public String QuickQuery;
    /// 简拼
    public String SimpleSpelling;
    /// 区域的英文名称
    public String EnglishName;
    /// 国家主键(中国是86)
    public String CountryId;
    /// 国家
    public String Country;
    /// 省主键]
    public String ProvinceId;
    /// 省
    public String Province;
    /// 市主键
    public String CityId;
    /// 市
    public String City;
    /// 县区主键
    public String DistrictId;
    /// 县
    public String District;
    /// 街道主键
    public String StreetId;
    /// 街道名称
    public String Street;
    /// 地址
    public String Address;
    /// 统计名称
    public String StatisticalName;
    /// 网点负责人主键
    public String MasterId;
    /// 网点负责人
    public String Master;
    /// 网点负责人手机
    public String MasterMobile;
    /// 网点负责人QQ
    public String MasterQQ;
    /// 紧急联系电话(e3公司总机)
    public String EmergencyCall;
    /// 业务电话（e3业务电话总机）
    public String BusinessPhone;
    /// 负责人
    public String Manager;
    /// 负责人手机
    public String ManagerMobile;
    /// 负责人QQ50)]
    public String ManagerQQ;
    /// 客服经理姓名
    public String ServiceManager;
    /// 客服经理手机号码
    public String ServiceManagerMobile;
    /// 客服经理主键
    public String ServiceManagerId;
    /// 投诉电话
    public String ComplaintPhone;
    /// 所属组织机构主键
    public String ManageId;
    /// 所属组织机构
    public String ManageName;
    /// 删除标记
    public int DeletionStateCode;
    /// 启用
    public int Enabled;
    /// 创建日期
    public String CreateOn;
    /// 创建用户主键
    public String CreateUserId;
    /// 创建用户
    public String CreateBy;
    /// 修改日期
    public String ModifiedOn;
    /// 修改用户主键
    public String ModifiedUserId;
    /// 修改用户
    public String ModifiedBy;
    /// 网点电话，临时存放在这里，后期分开
    public String SiteTelephone;
    /// 外网启用：0不启用，1启用
    public int WebEnabled;
    /// 业务经理电话
    public String ManagerPhone;
    /// 客服经理电话
    public String ServiceManagerPhone;
    /// 客服经理QQ
    public String ServiceManagerQQ;
    /// 经理电话
    public String MasterPhone;
    /// 审核状态
    public String AuditStatus;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getOrganizeFrom() {
        return OrganizeFrom;
    }

    public void setOrganizeFrom(String organizeFrom) {
        OrganizeFrom = organizeFrom;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        ShortName = shortName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getStandardName() {
        return StandardName;
    }

    public void setStandardName(String standardName) {
        StandardName = standardName;
    }

    public String getStandardCode() {
        return StandardCode;
    }

    public void setStandardCode(String standardCode) {
        StandardCode = standardCode;
    }

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String parentId) {
        ParentId = parentId;
    }

    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String parentName) {
        ParentName = parentName;
    }

    public String getParentCode() {
        return ParentCode;
    }

    public void setParentCode(String parentCode) {
        ParentCode = parentCode;
    }

    public int getSortCode() {
        return SortCode;
    }

    public void setSortCode(int sortCode) {
        SortCode = sortCode;
    }

    public String getCategoryCode() {
        return CategoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        CategoryCode = categoryCode;
    }

    public int getLayer() {
        return Layer;
    }

    public void setLayer(int layer) {
        Layer = layer;
    }

    public String getOuterPhone() {
        return OuterPhone;
    }

    public void setOuterPhone(String outerPhone) {
        OuterPhone = outerPhone;
    }

    public String getInnerPhone() {
        return InnerPhone;
    }

    public void setInnerPhone(String innerPhone) {
        InnerPhone = innerPhone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getWeb() {
        return Web;
    }

    public void setWeb(String web) {
        Web = web;
    }

    public int getIsInnerOrganize() {
        return IsInnerOrganize;
    }

    public void setIsInnerOrganize(int isInnerOrganize) {
        IsInnerOrganize = isInnerOrganize;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public String getBankAccount() {
        return BankAccount;
    }

    public void setBankAccount(String bankAccount) {
        BankAccount = bankAccount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getBigArea() {
        return BigArea;
    }

    public void setBigArea(String bigArea) {
        BigArea = bigArea;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getJoiningMethods() {
        return JoiningMethods;
    }

    public void setJoiningMethods(String joiningMethods) {
        JoiningMethods = joiningMethods;
    }

    public int getContainChildNodes() {
        return ContainChildNodes;
    }

    public void setContainChildNodes(int containChildNodes) {
        ContainChildNodes = containChildNodes;
    }

    public String getQuickQuery() {
        return QuickQuery;
    }

    public void setQuickQuery(String quickQuery) {
        QuickQuery = quickQuery;
    }

    public String getSimpleSpelling() {
        return SimpleSpelling;
    }

    public void setSimpleSpelling(String simpleSpelling) {
        SimpleSpelling = simpleSpelling;
    }

    public String getEnglishName() {
        return EnglishName;
    }

    public void setEnglishName(String englishName) {
        EnglishName = englishName;
    }

    public String getCountryId() {
        return CountryId;
    }

    public void setCountryId(String countryId) {
        CountryId = countryId;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(String provinceId) {
        ProvinceId = provinceId;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCityId() {
        return CityId;
    }

    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDistrictId() {
        return DistrictId;
    }

    public void setDistrictId(String districtId) {
        DistrictId = districtId;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getStreetId() {
        return StreetId;
    }

    public void setStreetId(String streetId) {
        StreetId = streetId;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getStatisticalName() {
        return StatisticalName;
    }

    public void setStatisticalName(String statisticalName) {
        StatisticalName = statisticalName;
    }

    public String getMasterId() {
        return MasterId;
    }

    public void setMasterId(String masterId) {
        MasterId = masterId;
    }

    public String getMaster() {
        return Master;
    }

    public void setMaster(String master) {
        Master = master;
    }

    public String getMasterMobile() {
        return MasterMobile;
    }

    public void setMasterMobile(String masterMobile) {
        MasterMobile = masterMobile;
    }

    public String getMasterQQ() {
        return MasterQQ;
    }

    public void setMasterQQ(String masterQQ) {
        MasterQQ = masterQQ;
    }

    public String getEmergencyCall() {
        return EmergencyCall;
    }

    public void setEmergencyCall(String emergencyCall) {
        EmergencyCall = emergencyCall;
    }

    public String getBusinessPhone() {
        return BusinessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        BusinessPhone = businessPhone;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String manager) {
        Manager = manager;
    }

    public String getManagerMobile() {
        return ManagerMobile;
    }

    public void setManagerMobile(String managerMobile) {
        ManagerMobile = managerMobile;
    }

    public String getManagerQQ() {
        return ManagerQQ;
    }

    public void setManagerQQ(String managerQQ) {
        ManagerQQ = managerQQ;
    }

    public String getServiceManager() {
        return ServiceManager;
    }

    public void setServiceManager(String serviceManager) {
        ServiceManager = serviceManager;
    }

    public String getServiceManagerMobile() {
        return ServiceManagerMobile;
    }

    public void setServiceManagerMobile(String serviceManagerMobile) {
        ServiceManagerMobile = serviceManagerMobile;
    }

    public String getServiceManagerId() {
        return ServiceManagerId;
    }

    public void setServiceManagerId(String serviceManagerId) {
        ServiceManagerId = serviceManagerId;
    }

    public String getComplaintPhone() {
        return ComplaintPhone;
    }

    public void setComplaintPhone(String complaintPhone) {
        ComplaintPhone = complaintPhone;
    }

    public String getManageId() {
        return ManageId;
    }

    public void setManageId(String manageId) {
        ManageId = manageId;
    }

    public String getManageName() {
        return ManageName;
    }

    public void setManageName(String manageName) {
        ManageName = manageName;
    }

    public int getDeletionStateCode() {
        return DeletionStateCode;
    }

    public void setDeletionStateCode(int deletionStateCode) {
        DeletionStateCode = deletionStateCode;
    }

    public int getEnabled() {
        return Enabled;
    }

    public void setEnabled(int enabled) {
        Enabled = enabled;
    }

    public String getCreateOn() {
        return CreateOn;
    }

    public void setCreateOn(String createOn) {
        CreateOn = createOn;
    }

    public String getCreateUserId() {
        return CreateUserId;
    }

    public void setCreateUserId(String createUserId) {
        CreateUserId = createUserId;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String createBy) {
        CreateBy = createBy;
    }

    public String getModifiedOn() {
        return ModifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        ModifiedOn = modifiedOn;
    }

    public String getModifiedUserId() {
        return ModifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        ModifiedUserId = modifiedUserId;
    }

    public String getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        ModifiedBy = modifiedBy;
    }

    public String getSiteTelephone() {
        return SiteTelephone;
    }

    public void setSiteTelephone(String siteTelephone) {
        SiteTelephone = siteTelephone;
    }

    public int getWebEnabled() {
        return WebEnabled;
    }

    public void setWebEnabled(int webEnabled) {
        WebEnabled = webEnabled;
    }

    public String getManagerPhone() {
        return ManagerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        ManagerPhone = managerPhone;
    }

    public String getServiceManagerPhone() {
        return ServiceManagerPhone;
    }

    public void setServiceManagerPhone(String serviceManagerPhone) {
        ServiceManagerPhone = serviceManagerPhone;
    }

    public String getServiceManagerQQ() {
        return ServiceManagerQQ;
    }

    public void setServiceManagerQQ(String serviceManagerQQ) {
        ServiceManagerQQ = serviceManagerQQ;
    }

    public String getMasterPhone() {
        return MasterPhone;
    }

    public void setMasterPhone(String masterPhone) {
        MasterPhone = masterPhone;
    }

    public String getAuditStatus() {
        return AuditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        AuditStatus = auditStatus;
    }
}
