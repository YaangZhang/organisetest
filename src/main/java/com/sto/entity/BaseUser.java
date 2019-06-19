package com.sto.entity;

import java.util.Date;

/**
 * 用户账户表
 */
public class BaseUser {
    /**
     * 主键
     */
    private String id;

    /**
     * 编号(工号)
     */
    private String code;

    /**
     * 登录名，用户名
     */
    private String userName;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 呢称
     */
    private String nickname;

    /**
     * 快速查询
     */
    private String quickQuery;

    /**
     * 简拼
     */
    private String simpleSpelling;

    /**
     * 岗位(职位)
     */
    private String duty;

    /**
     * 职称、职位
     */
    private String title;

    /**
     * 性别
     */
    private String gender;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 身份证号码
     */
    private String idcard;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 公司主键
     */
    private String companyId;

    /**
     * 公司编号
     */
    private String companyCode;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 部门主键
     */
    private String departmentId;

    /**
     * 部门编号
     */
    private String departmentCode;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 分支机构主键
     */
    private String subCompanyId;

    /**
     * 分支机构名称
     */
    private String subCompanyName;

    /**
     * 子部门主键
     */
    private String subDepartmentId;

    /**
     * 子部门名称
     */
    private String subDepartmentName;

    /**
     * 工作组主键
     */
    private String workgroupId;

    /**
     * 工作组名称
     */
    private String workgroupName;

    /**
     * 省主键
     */
    private Long provinceId;

    /**
     * 省
     */
    private String province;

    /**
     * 市主键
     */
    private Long cityId;

    /**
     * 市
     */
    private String city;

    /**
     * 县区主键
     */
    private Long districtId;

    /**
     * 县
     */
    private String district;

    /**
     * 家庭住址
     */
    private String homeAddress;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否超级管理员
     */
    private Short isAdministrator;

    /**
     * 工作行业
     */
    private String workCategory;

    /**
     * 安全级别
     */
    private Short securityLevel;

    /**
     * 语言
     */
    private String lang;

    /**
     * 系统样式选择
     */
    private String theme;

    /**
     * 积分
     */
    private Long score;

    /**
     * 粉丝数量
     */
    private Long fans;

    /**
     * 用户来源
     */
    private String userFrom;

    /**
     * 主管主键
     */
    private String managerId;

    /**
     * 上级主管审核状态
     */
    private String managerAuditStatus;

    /**
     * 上级主管审核日期
     */
    private Date managerAuditDate;

    /**
     * 排序码
     */
    private Long sortCode;

    /**
     * 是否员工
     */
    private Short isStaff;

    /**
     * 是否显示：0不显示，1显示
     */
    private Short isVisible;

    /**
     * 有效标志：0无效，1有效
     */
    private Short enabled;

    /**
     * 删除标志：0未删除，1删除
     */
    private Short deletionStateCode;

    /**
     * 审核状态
     */
    private String auditStatus;

    /**
     * 创建日期
     */
    private Date createOn;

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
    private Date modifiedOn;

    /**
     * 修改用户主键
     */
    private String modifiedUserId;

    /**
     * 修改用户
     */
    private String modifiedBy;

    /**
     * 主管姓名
     */
    private String manager;

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
     * 编号(工号)
     * @return CODE 编号(工号)
     */
    public String getCode() {
        return code;
    }

    /**
     * 编号(工号)
     * @param code 编号(工号)
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 登录名，用户名
     * @return USER_NAME 登录名，用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 登录名，用户名
     * @param userName 登录名，用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 姓名
     * @return REAL_NAME 姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 姓名
     * @param realName 姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 呢称
     * @return NICKNAME 呢称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 呢称
     * @param nickname 呢称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 快速查询
     * @return QUICK_QUERY 快速查询
     */
    public String getQuickQuery() {
        return quickQuery;
    }

    /**
     * 快速查询
     * @param quickQuery 快速查询
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
     * 岗位(职位)
     * @return DUTY 岗位(职位)
     */
    public String getDuty() {
        return duty;
    }

    /**
     * 岗位(职位)
     * @param duty 岗位(职位)
     */
    public void setDuty(String duty) {
        this.duty = duty;
    }

    /**
     * 职称、职位
     * @return TITLE 职称、职位
     */
    public String getTitle() {
        return title;
    }

    /**
     * 职称、职位
     * @param title 职称、职位
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 性别
     * @return GENDER 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 性别
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 个性签名
     * @return SIGNATURE 个性签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 个性签名
     * @param signature 个性签名
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 身份证号码
     * @return IDCARD 身份证号码
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 身份证号码
     * @param idcard 身份证号码
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 出生日期
     * @return BIRTHDAY 出生日期
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 出生日期
     * @param birthday 出生日期
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 公司主键
     * @return COMPANY_ID 公司主键
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 公司主键
     * @param companyId 公司主键
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 公司编号
     * @return COMPANY_CODE 公司编号
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 公司编号
     * @param companyCode 公司编号
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 公司名称
     * @return COMPANY_NAME 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 公司名称
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 部门主键
     * @return DEPARTMENT_ID 部门主键
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 部门主键
     * @param departmentId 部门主键
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 部门编号
     * @return DEPARTMENT_CODE 部门编号
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * 部门编号
     * @param departmentCode 部门编号
     */
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    /**
     * 部门名称
     * @return DEPARTMENT_NAME 部门名称
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 部门名称
     * @param departmentName 部门名称
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * 分支机构主键
     * @return SUB_COMPANY_ID 分支机构主键
     */
    public String getSubCompanyId() {
        return subCompanyId;
    }

    /**
     * 分支机构主键
     * @param subCompanyId 分支机构主键
     */
    public void setSubCompanyId(String subCompanyId) {
        this.subCompanyId = subCompanyId;
    }

    /**
     * 分支机构名称
     * @return SUB_COMPANY_NAME 分支机构名称
     */
    public String getSubCompanyName() {
        return subCompanyName;
    }

    /**
     * 分支机构名称
     * @param subCompanyName 分支机构名称
     */
    public void setSubCompanyName(String subCompanyName) {
        this.subCompanyName = subCompanyName;
    }

    /**
     * 子部门主键
     * @return SUB_DEPARTMENT_ID 子部门主键
     */
    public String getSubDepartmentId() {
        return subDepartmentId;
    }

    /**
     * 子部门主键
     * @param subDepartmentId 子部门主键
     */
    public void setSubDepartmentId(String subDepartmentId) {
        this.subDepartmentId = subDepartmentId;
    }

    /**
     * 子部门名称
     * @return SUB_DEPARTMENT_NAME 子部门名称
     */
    public String getSubDepartmentName() {
        return subDepartmentName;
    }

    /**
     * 子部门名称
     * @param subDepartmentName 子部门名称
     */
    public void setSubDepartmentName(String subDepartmentName) {
        this.subDepartmentName = subDepartmentName;
    }

    /**
     * 工作组主键
     * @return WORKGROUP_ID 工作组主键
     */
    public String getWorkgroupId() {
        return workgroupId;
    }

    /**
     * 工作组主键
     * @param workgroupId 工作组主键
     */
    public void setWorkgroupId(String workgroupId) {
        this.workgroupId = workgroupId;
    }

    /**
     * 工作组名称
     * @return WORKGROUP_NAME 工作组名称
     */
    public String getWorkgroupName() {
        return workgroupName;
    }

    /**
     * 工作组名称
     * @param workgroupName 工作组名称
     */
    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * 省主键
     * @return PROVINCE_ID 省主键
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * 省主键
     * @param provinceId 省主键
     */
    public void setProvinceId(Long provinceId) {
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
    public Long getCityId() {
        return cityId;
    }

    /**
     * 市主键
     * @param cityId 市主键
     */
    public void setCityId(Long cityId) {
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
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * 县区主键
     * @param districtId 县区主键
     */
    public void setDistrictId(Long districtId) {
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
     * 家庭住址
     * @return HOME_ADDRESS 家庭住址
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * 家庭住址
     * @param homeAddress 家庭住址
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
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
     * 是否超级管理员
     * @return IS_ADMINISTRATOR 是否超级管理员
     */
    public Short getIsAdministrator() {
        return isAdministrator;
    }

    /**
     * 是否超级管理员
     * @param isAdministrator 是否超级管理员
     */
    public void setIsAdministrator(Short isAdministrator) {
        this.isAdministrator = isAdministrator;
    }

    /**
     * 工作行业
     * @return WORK_CATEGORY 工作行业
     */
    public String getWorkCategory() {
        return workCategory;
    }

    /**
     * 工作行业
     * @param workCategory 工作行业
     */
    public void setWorkCategory(String workCategory) {
        this.workCategory = workCategory;
    }

    /**
     * 安全级别
     * @return SECURITY_LEVEL 安全级别
     */
    public Short getSecurityLevel() {
        return securityLevel;
    }

    /**
     * 安全级别
     * @param securityLevel 安全级别
     */
    public void setSecurityLevel(Short securityLevel) {
        this.securityLevel = securityLevel;
    }

    /**
     * 语言
     * @return LANG 语言
     */
    public String getLang() {
        return lang;
    }

    /**
     * 语言
     * @param lang 语言
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 系统样式选择
     * @return THEME 系统样式选择
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 系统样式选择
     * @param theme 系统样式选择
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * 积分
     * @return SCORE 积分
     */
    public Long getScore() {
        return score;
    }

    /**
     * 积分
     * @param score 积分
     */
    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * 粉丝数量
     * @return FANS 粉丝数量
     */
    public Long getFans() {
        return fans;
    }

    /**
     * 粉丝数量
     * @param fans 粉丝数量
     */
    public void setFans(Long fans) {
        this.fans = fans;
    }

    /**
     * 用户来源
     * @return USER_FROM 用户来源
     */
    public String getUserFrom() {
        return userFrom;
    }

    /**
     * 用户来源
     * @param userFrom 用户来源
     */
    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    /**
     * 主管主键
     * @return MANAGER_ID 主管主键
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * 主管主键
     * @param managerId 主管主键
     */
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    /**
     * 上级主管审核状态
     * @return MANAGER_AUDIT_STATUS 上级主管审核状态
     */
    public String getManagerAuditStatus() {
        return managerAuditStatus;
    }

    /**
     * 上级主管审核状态
     * @param managerAuditStatus 上级主管审核状态
     */
    public void setManagerAuditStatus(String managerAuditStatus) {
        this.managerAuditStatus = managerAuditStatus;
    }

    /**
     * 上级主管审核日期
     * @return MANAGER_AUDIT_DATE 上级主管审核日期
     */
    public Date getManagerAuditDate() {
        return managerAuditDate;
    }

    /**
     * 上级主管审核日期
     * @param managerAuditDate 上级主管审核日期
     */
    public void setManagerAuditDate(Date managerAuditDate) {
        this.managerAuditDate = managerAuditDate;
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
     * 是否员工
     * @return IS_STAFF 是否员工
     */
    public Short getIsStaff() {
        return isStaff;
    }

    /**
     * 是否员工
     * @param isStaff 是否员工
     */
    public void setIsStaff(Short isStaff) {
        this.isStaff = isStaff;
    }

    /**
     * 是否显示：0不显示，1显示
     * @return IS_VISIBLE 是否显示：0不显示，1显示
     */
    public Short getIsVisible() {
        return isVisible;
    }

    /**
     * 是否显示：0不显示，1显示
     * @param isVisible 是否显示：0不显示，1显示
     */
    public void setIsVisible(Short isVisible) {
        this.isVisible = isVisible;
    }

    /**
     * 有效标志：0无效，1有效
     * @return ENABLED 有效标志：0无效，1有效
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * 有效标志：0无效，1有效
     * @param enabled 有效标志：0无效，1有效
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    /**
     * 删除标志：0未删除，1删除
     * @return DELETION_STATE_CODE 删除标志：0未删除，1删除
     */
    public Short getDeletionStateCode() {
        return deletionStateCode;
    }

    /**
     * 删除标志：0未删除，1删除
     * @param deletionStateCode 删除标志：0未删除，1删除
     */
    public void setDeletionStateCode(Short deletionStateCode) {
        this.deletionStateCode = deletionStateCode;
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

    /**
     * 创建日期
     * @return CREATE_ON 创建日期
     */
    public Date getCreateOn() {
        return createOn;
    }

    /**
     * 创建日期
     * @param createOn 创建日期
     */
    public void setCreateOn(Date createOn) {
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
    public Date getModifiedOn() {
        return modifiedOn;
    }

    /**
     * 修改日期
     * @param modifiedOn 修改日期
     */
    public void setModifiedOn(Date modifiedOn) {
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
     * 主管姓名
     * @return MANAGER 主管姓名
     */
    public String getManager() {
        return manager;
    }

    /**
     * 主管姓名
     * @param manager 主管姓名
     */
    public void setManager(String manager) {
        this.manager = manager;
    }
}