package com.sto.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable{
    private String id;

    private String orderId;

    private String billCode;

    private String siteId;

    private String siteCode;

    private String siteName;

    private String recSiteId;

    private String recSiteCode;

    private String recSiteName;

    private String assignSiteId;

    private String assignSiteCode;

    private String assignSiteName;

    private String orderSource;

    private String orderSourceCode;

    private Date orderDate;

    private Date assignDate;

    private Date recDate;

    private Date cancelDate;

    private String sendName;

    private String sendPhone;

    private String sendPostcode;

    private String sendAddress;

    private String sendProvId;

    private String sendProv;

    private String sendCityId;

    private String sendCity;

    private String sendAreaId;

    private String sendArea;

    private String sendTownId;

    private String sendTown;

    private String recPostcode;

    private String recAddress;

    private String recName;

    private String recPhone;

    private String recMobile;

    private String recProvId;

    private String recProv;

    private String recCityId;

    private String recCity;

    private String recAreaId;

    private String recArea;

    private String recTownId;

    private String recTown;

    private String recManCode;

    private String recMan;

    private String assignManCode;

    private String assignMan;

    private Integer pieces;

    private String goodsType;

    private BigDecimal weight;

    private BigDecimal volumeWeight;

    private String fastProductType;

    private String datoubi;

    private Short status;

    private String cancelCause;

    private Long sourceVersion;

    private String sourceId;

    private String sourceBizid;

    private String sourceCustomerCode;

    private BigDecimal storePrice;

    private BigDecimal goodsValue;

    private Short isCod;

    private BigDecimal goodsPayment;

    private BigDecimal toPayment;

    private BigDecimal returnBillFee;

    private BigDecimal tranFee;

    private BigDecimal otherFee;

    private String returnBillCode;

    private Long blStorePrice;

    private Short blReturnBill;

    private Short blRetuBillSign;

    private Date signDate;

    private Short blSign;

    private String dispMan;

    private String dispManCode;

    private Short blBack;

    private Short messageType;

    private Short sendBlMessage;

    private Short receiveBlMessage;

    private String sendSmsTemplate;

    private String receiveSmsTemplate;

    private String remark;

    private Short deletionStateCode;

    private Date createOn;

    private String createUserId;

    private String createBy;

    private String createIp;

    private Date modifiedOn;

    private String modifiedUserId;

    private String modifiedBy;

    private String modifiedIp;

    private Date syncTime;

    private Date fetchStartDate;

    private Date fetchEndDate;

    private String goodsName;

    private String productType;

    private String baiduLatitude;

    private String assignCenterId;

    private String assignCenterCode;

    private String assignCenterName;

    private String payType;

    private String createCompanyId;

    private String createCompany;

    private String modifiedCompanyId;

    private String modifiedCompany;

    private String boxCode;

    private String gaodeLatitude;

    private String gaodeLongitude;

    private String customerMessage;

    private String openId;

    private Short sourceStatus;

    private String assignManPhone;

    private String sendMobile;

    private String wutongAssignSiteId;

    private String wutongAssignSiteCode;

    private String wutongAssignSiteName;

    private String allotType;

    private String printCode;

    private String sendEmail;

    private String recEmail;

    private String baiduLongitude;

    private String jiBao;

    private String jiBaoCode;

    private String idCard;

    private String monthCustomer;

    private String parentOrderId;

    private String printBillImageId;

    private String pickupImageId;

    private String goodsImageId;

    private String payStatus;

    private Date takeOrderDate;

    private String takeOrderStatus;

    private Date pickupGoodsDate;

    private Date bindBillCodeDate;

    private String sendCompanyName;

    private String recCompanyName;

    private String sendUserAddressId;

    private String recUserAddressId;

    private Long printCount;

    private String pickupType;

    private Short commentLevel;

    private BigDecimal realFee;

    private Short scheduleStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getRecSiteId() {
        return recSiteId;
    }

    public void setRecSiteId(String recSiteId) {
        this.recSiteId = recSiteId == null ? null : recSiteId.trim();
    }

    public String getRecSiteCode() {
        return recSiteCode;
    }

    public void setRecSiteCode(String recSiteCode) {
        this.recSiteCode = recSiteCode == null ? null : recSiteCode.trim();
    }

    public String getRecSiteName() {
        return recSiteName;
    }

    public void setRecSiteName(String recSiteName) {
        this.recSiteName = recSiteName == null ? null : recSiteName.trim();
    }

    public String getAssignSiteId() {
        return assignSiteId;
    }

    public void setAssignSiteId(String assignSiteId) {
        this.assignSiteId = assignSiteId == null ? null : assignSiteId.trim();
    }

    public String getAssignSiteCode() {
        return assignSiteCode;
    }

    public void setAssignSiteCode(String assignSiteCode) {
        this.assignSiteCode = assignSiteCode == null ? null : assignSiteCode.trim();
    }

    public String getAssignSiteName() {
        return assignSiteName;
    }

    public void setAssignSiteName(String assignSiteName) {
        this.assignSiteName = assignSiteName == null ? null : assignSiteName.trim();
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public String getOrderSourceCode() {
        return orderSourceCode;
    }

    public void setOrderSourceCode(String orderSourceCode) {
        this.orderSourceCode = orderSourceCode == null ? null : orderSourceCode.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName == null ? null : sendName.trim();
    }

    public String getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone == null ? null : sendPhone.trim();
    }

    public String getSendPostcode() {
        return sendPostcode;
    }

    public void setSendPostcode(String sendPostcode) {
        this.sendPostcode = sendPostcode == null ? null : sendPostcode.trim();
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress == null ? null : sendAddress.trim();
    }

    public String getSendProvId() {
        return sendProvId;
    }

    public void setSendProvId(String sendProvId) {
        this.sendProvId = sendProvId == null ? null : sendProvId.trim();
    }

    public String getSendProv() {
        return sendProv;
    }

    public void setSendProv(String sendProv) {
        this.sendProv = sendProv == null ? null : sendProv.trim();
    }

    public String getSendCityId() {
        return sendCityId;
    }

    public void setSendCityId(String sendCityId) {
        this.sendCityId = sendCityId == null ? null : sendCityId.trim();
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity == null ? null : sendCity.trim();
    }

    public String getSendAreaId() {
        return sendAreaId;
    }

    public void setSendAreaId(String sendAreaId) {
        this.sendAreaId = sendAreaId == null ? null : sendAreaId.trim();
    }

    public String getSendArea() {
        return sendArea;
    }

    public void setSendArea(String sendArea) {
        this.sendArea = sendArea == null ? null : sendArea.trim();
    }

    public String getSendTownId() {
        return sendTownId;
    }

    public void setSendTownId(String sendTownId) {
        this.sendTownId = sendTownId == null ? null : sendTownId.trim();
    }

    public String getSendTown() {
        return sendTown;
    }

    public void setSendTown(String sendTown) {
        this.sendTown = sendTown == null ? null : sendTown.trim();
    }

    public String getRecPostcode() {
        return recPostcode;
    }

    public void setRecPostcode(String recPostcode) {
        this.recPostcode = recPostcode == null ? null : recPostcode.trim();
    }

    public String getRecAddress() {
        return recAddress;
    }

    public void setRecAddress(String recAddress) {
        this.recAddress = recAddress == null ? null : recAddress.trim();
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName == null ? null : recName.trim();
    }

    public String getRecPhone() {
        return recPhone;
    }

    public void setRecPhone(String recPhone) {
        this.recPhone = recPhone == null ? null : recPhone.trim();
    }

    public String getRecMobile() {
        return recMobile;
    }

    public void setRecMobile(String recMobile) {
        this.recMobile = recMobile == null ? null : recMobile.trim();
    }

    public String getRecProvId() {
        return recProvId;
    }

    public void setRecProvId(String recProvId) {
        this.recProvId = recProvId == null ? null : recProvId.trim();
    }

    public String getRecProv() {
        return recProv;
    }

    public void setRecProv(String recProv) {
        this.recProv = recProv == null ? null : recProv.trim();
    }

    public String getRecCityId() {
        return recCityId;
    }

    public void setRecCityId(String recCityId) {
        this.recCityId = recCityId == null ? null : recCityId.trim();
    }

    public String getRecCity() {
        return recCity;
    }

    public void setRecCity(String recCity) {
        this.recCity = recCity == null ? null : recCity.trim();
    }

    public String getRecAreaId() {
        return recAreaId;
    }

    public void setRecAreaId(String recAreaId) {
        this.recAreaId = recAreaId == null ? null : recAreaId.trim();
    }

    public String getRecArea() {
        return recArea;
    }

    public void setRecArea(String recArea) {
        this.recArea = recArea == null ? null : recArea.trim();
    }

    public String getRecTownId() {
        return recTownId;
    }

    public void setRecTownId(String recTownId) {
        this.recTownId = recTownId == null ? null : recTownId.trim();
    }

    public String getRecTown() {
        return recTown;
    }

    public void setRecTown(String recTown) {
        this.recTown = recTown == null ? null : recTown.trim();
    }

    public String getRecManCode() {
        return recManCode;
    }

    public void setRecManCode(String recManCode) {
        this.recManCode = recManCode == null ? null : recManCode.trim();
    }

    public String getRecMan() {
        return recMan;
    }

    public void setRecMan(String recMan) {
        this.recMan = recMan == null ? null : recMan.trim();
    }

    public String getAssignManCode() {
        return assignManCode;
    }

    public void setAssignManCode(String assignManCode) {
        this.assignManCode = assignManCode == null ? null : assignManCode.trim();
    }

    public String getAssignMan() {
        return assignMan;
    }

    public void setAssignMan(String assignMan) {
        this.assignMan = assignMan == null ? null : assignMan.trim();
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolumeWeight() {
        return volumeWeight;
    }

    public void setVolumeWeight(BigDecimal volumeWeight) {
        this.volumeWeight = volumeWeight;
    }

    public String getFastProductType() {
        return fastProductType;
    }

    public void setFastProductType(String fastProductType) {
        this.fastProductType = fastProductType == null ? null : fastProductType.trim();
    }

    public String getDatoubi() {
        return datoubi;
    }

    public void setDatoubi(String datoubi) {
        this.datoubi = datoubi == null ? null : datoubi.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCancelCause() {
        return cancelCause;
    }

    public void setCancelCause(String cancelCause) {
        this.cancelCause = cancelCause == null ? null : cancelCause.trim();
    }

    public Long getSourceVersion() {
        return sourceVersion;
    }

    public void setSourceVersion(Long sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public String getSourceBizid() {
        return sourceBizid;
    }

    public void setSourceBizid(String sourceBizid) {
        this.sourceBizid = sourceBizid == null ? null : sourceBizid.trim();
    }

    public String getSourceCustomerCode() {
        return sourceCustomerCode;
    }

    public void setSourceCustomerCode(String sourceCustomerCode) {
        this.sourceCustomerCode = sourceCustomerCode == null ? null : sourceCustomerCode.trim();
    }

    public BigDecimal getStorePrice() {
        return storePrice;
    }

    public void setStorePrice(BigDecimal storePrice) {
        this.storePrice = storePrice;
    }

    public BigDecimal getGoodsValue() {
        return goodsValue;
    }

    public void setGoodsValue(BigDecimal goodsValue) {
        this.goodsValue = goodsValue;
    }

    public Short getIsCod() {
        return isCod;
    }

    public void setIsCod(Short isCod) {
        this.isCod = isCod;
    }

    public BigDecimal getGoodsPayment() {
        return goodsPayment;
    }

    public void setGoodsPayment(BigDecimal goodsPayment) {
        this.goodsPayment = goodsPayment;
    }

    public BigDecimal getToPayment() {
        return toPayment;
    }

    public void setToPayment(BigDecimal toPayment) {
        this.toPayment = toPayment;
    }

    public BigDecimal getReturnBillFee() {
        return returnBillFee;
    }

    public void setReturnBillFee(BigDecimal returnBillFee) {
        this.returnBillFee = returnBillFee;
    }

    public BigDecimal getTranFee() {
        return tranFee;
    }

    public void setTranFee(BigDecimal tranFee) {
        this.tranFee = tranFee;
    }

    public BigDecimal getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(BigDecimal otherFee) {
        this.otherFee = otherFee;
    }

    public String getReturnBillCode() {
        return returnBillCode;
    }

    public void setReturnBillCode(String returnBillCode) {
        this.returnBillCode = returnBillCode == null ? null : returnBillCode.trim();
    }

    public Long getBlStorePrice() {
        return blStorePrice;
    }

    public void setBlStorePrice(Long blStorePrice) {
        this.blStorePrice = blStorePrice;
    }

    public Short getBlReturnBill() {
        return blReturnBill;
    }

    public void setBlReturnBill(Short blReturnBill) {
        this.blReturnBill = blReturnBill;
    }

    public Short getBlRetuBillSign() {
        return blRetuBillSign;
    }

    public void setBlRetuBillSign(Short blRetuBillSign) {
        this.blRetuBillSign = blRetuBillSign;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Short getBlSign() {
        return blSign;
    }

    public void setBlSign(Short blSign) {
        this.blSign = blSign;
    }

    public String getDispMan() {
        return dispMan;
    }

    public void setDispMan(String dispMan) {
        this.dispMan = dispMan == null ? null : dispMan.trim();
    }

    public String getDispManCode() {
        return dispManCode;
    }

    public void setDispManCode(String dispManCode) {
        this.dispManCode = dispManCode == null ? null : dispManCode.trim();
    }

    public Short getBlBack() {
        return blBack;
    }

    public void setBlBack(Short blBack) {
        this.blBack = blBack;
    }

    public Short getMessageType() {
        return messageType;
    }

    public void setMessageType(Short messageType) {
        this.messageType = messageType;
    }

    public Short getSendBlMessage() {
        return sendBlMessage;
    }

    public void setSendBlMessage(Short sendBlMessage) {
        this.sendBlMessage = sendBlMessage;
    }

    public Short getReceiveBlMessage() {
        return receiveBlMessage;
    }

    public void setReceiveBlMessage(Short receiveBlMessage) {
        this.receiveBlMessage = receiveBlMessage;
    }

    public String getSendSmsTemplate() {
        return sendSmsTemplate;
    }

    public void setSendSmsTemplate(String sendSmsTemplate) {
        this.sendSmsTemplate = sendSmsTemplate == null ? null : sendSmsTemplate.trim();
    }

    public String getReceiveSmsTemplate() {
        return receiveSmsTemplate;
    }

    public void setReceiveSmsTemplate(String receiveSmsTemplate) {
        this.receiveSmsTemplate = receiveSmsTemplate == null ? null : receiveSmsTemplate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getDeletionStateCode() {
        return deletionStateCode;
    }

    public void setDeletionStateCode(Short deletionStateCode) {
        this.deletionStateCode = deletionStateCode;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
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

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
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

    public String getModifiedIp() {
        return modifiedIp;
    }

    public void setModifiedIp(String modifiedIp) {
        this.modifiedIp = modifiedIp == null ? null : modifiedIp.trim();
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public Date getFetchStartDate() {
        return fetchStartDate;
    }

    public void setFetchStartDate(Date fetchStartDate) {
        this.fetchStartDate = fetchStartDate;
    }

    public Date getFetchEndDate() {
        return fetchEndDate;
    }

    public void setFetchEndDate(Date fetchEndDate) {
        this.fetchEndDate = fetchEndDate;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getBaiduLatitude() {
        return baiduLatitude;
    }

    public void setBaiduLatitude(String baiduLatitude) {
        this.baiduLatitude = baiduLatitude == null ? null : baiduLatitude.trim();
    }

    public String getAssignCenterId() {
        return assignCenterId;
    }

    public void setAssignCenterId(String assignCenterId) {
        this.assignCenterId = assignCenterId == null ? null : assignCenterId.trim();
    }

    public String getAssignCenterCode() {
        return assignCenterCode;
    }

    public void setAssignCenterCode(String assignCenterCode) {
        this.assignCenterCode = assignCenterCode == null ? null : assignCenterCode.trim();
    }

    public String getAssignCenterName() {
        return assignCenterName;
    }

    public void setAssignCenterName(String assignCenterName) {
        this.assignCenterName = assignCenterName == null ? null : assignCenterName.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getCreateCompanyId() {
        return createCompanyId;
    }

    public void setCreateCompanyId(String createCompanyId) {
        this.createCompanyId = createCompanyId == null ? null : createCompanyId.trim();
    }

    public String getCreateCompany() {
        return createCompany;
    }

    public void setCreateCompany(String createCompany) {
        this.createCompany = createCompany == null ? null : createCompany.trim();
    }

    public String getModifiedCompanyId() {
        return modifiedCompanyId;
    }

    public void setModifiedCompanyId(String modifiedCompanyId) {
        this.modifiedCompanyId = modifiedCompanyId == null ? null : modifiedCompanyId.trim();
    }

    public String getModifiedCompany() {
        return modifiedCompany;
    }

    public void setModifiedCompany(String modifiedCompany) {
        this.modifiedCompany = modifiedCompany == null ? null : modifiedCompany.trim();
    }

    public String getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(String boxCode) {
        this.boxCode = boxCode == null ? null : boxCode.trim();
    }

    public String getGaodeLatitude() {
        return gaodeLatitude;
    }

    public void setGaodeLatitude(String gaodeLatitude) {
        this.gaodeLatitude = gaodeLatitude == null ? null : gaodeLatitude.trim();
    }

    public String getGaodeLongitude() {
        return gaodeLongitude;
    }

    public void setGaodeLongitude(String gaodeLongitude) {
        this.gaodeLongitude = gaodeLongitude == null ? null : gaodeLongitude.trim();
    }

    public String getCustomerMessage() {
        return customerMessage;
    }

    public void setCustomerMessage(String customerMessage) {
        this.customerMessage = customerMessage == null ? null : customerMessage.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Short getSourceStatus() {
        return sourceStatus;
    }

    public void setSourceStatus(Short sourceStatus) {
        this.sourceStatus = sourceStatus;
    }

    public String getAssignManPhone() {
        return assignManPhone;
    }

    public void setAssignManPhone(String assignManPhone) {
        this.assignManPhone = assignManPhone == null ? null : assignManPhone.trim();
    }

    public String getSendMobile() {
        return sendMobile;
    }

    public void setSendMobile(String sendMobile) {
        this.sendMobile = sendMobile == null ? null : sendMobile.trim();
    }

    public String getWutongAssignSiteId() {
        return wutongAssignSiteId;
    }

    public void setWutongAssignSiteId(String wutongAssignSiteId) {
        this.wutongAssignSiteId = wutongAssignSiteId == null ? null : wutongAssignSiteId.trim();
    }

    public String getWutongAssignSiteCode() {
        return wutongAssignSiteCode;
    }

    public void setWutongAssignSiteCode(String wutongAssignSiteCode) {
        this.wutongAssignSiteCode = wutongAssignSiteCode == null ? null : wutongAssignSiteCode.trim();
    }

    public String getWutongAssignSiteName() {
        return wutongAssignSiteName;
    }

    public void setWutongAssignSiteName(String wutongAssignSiteName) {
        this.wutongAssignSiteName = wutongAssignSiteName == null ? null : wutongAssignSiteName.trim();
    }

    public String getAllotType() {
        return allotType;
    }

    public void setAllotType(String allotType) {
        this.allotType = allotType == null ? null : allotType.trim();
    }

    public String getPrintCode() {
        return printCode;
    }

    public void setPrintCode(String printCode) {
        this.printCode = printCode == null ? null : printCode.trim();
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail == null ? null : sendEmail.trim();
    }

    public String getRecEmail() {
        return recEmail;
    }

    public void setRecEmail(String recEmail) {
        this.recEmail = recEmail == null ? null : recEmail.trim();
    }

    public String getBaiduLongitude() {
        return baiduLongitude;
    }

    public void setBaiduLongitude(String baiduLongitude) {
        this.baiduLongitude = baiduLongitude == null ? null : baiduLongitude.trim();
    }

    public String getJiBao() {
        return jiBao;
    }

    public void setJiBao(String jiBao) {
        this.jiBao = jiBao == null ? null : jiBao.trim();
    }

    public String getJiBaoCode() {
        return jiBaoCode;
    }

    public void setJiBaoCode(String jiBaoCode) {
        this.jiBaoCode = jiBaoCode == null ? null : jiBaoCode.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getMonthCustomer() {
        return monthCustomer;
    }

    public void setMonthCustomer(String monthCustomer) {
        this.monthCustomer = monthCustomer == null ? null : monthCustomer.trim();
    }

    public String getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId == null ? null : parentOrderId.trim();
    }

    public String getPrintBillImageId() {
        return printBillImageId;
    }

    public void setPrintBillImageId(String printBillImageId) {
        this.printBillImageId = printBillImageId == null ? null : printBillImageId.trim();
    }

    public String getPickupImageId() {
        return pickupImageId;
    }

    public void setPickupImageId(String pickupImageId) {
        this.pickupImageId = pickupImageId == null ? null : pickupImageId.trim();
    }

    public String getGoodsImageId() {
        return goodsImageId;
    }

    public void setGoodsImageId(String goodsImageId) {
        this.goodsImageId = goodsImageId == null ? null : goodsImageId.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public Date getTakeOrderDate() {
        return takeOrderDate;
    }

    public void setTakeOrderDate(Date takeOrderDate) {
        this.takeOrderDate = takeOrderDate;
    }

    public String getTakeOrderStatus() {
        return takeOrderStatus;
    }

    public void setTakeOrderStatus(String takeOrderStatus) {
        this.takeOrderStatus = takeOrderStatus == null ? null : takeOrderStatus.trim();
    }

    public Date getPickupGoodsDate() {
        return pickupGoodsDate;
    }

    public void setPickupGoodsDate(Date pickupGoodsDate) {
        this.pickupGoodsDate = pickupGoodsDate;
    }

    public Date getBindBillCodeDate() {
        return bindBillCodeDate;
    }

    public void setBindBillCodeDate(Date bindBillCodeDate) {
        this.bindBillCodeDate = bindBillCodeDate;
    }

    public String getSendCompanyName() {
        return sendCompanyName;
    }

    public void setSendCompanyName(String sendCompanyName) {
        this.sendCompanyName = sendCompanyName == null ? null : sendCompanyName.trim();
    }

    public String getRecCompanyName() {
        return recCompanyName;
    }

    public void setRecCompanyName(String recCompanyName) {
        this.recCompanyName = recCompanyName == null ? null : recCompanyName.trim();
    }

    public String getSendUserAddressId() {
        return sendUserAddressId;
    }

    public void setSendUserAddressId(String sendUserAddressId) {
        this.sendUserAddressId = sendUserAddressId == null ? null : sendUserAddressId.trim();
    }

    public String getRecUserAddressId() {
        return recUserAddressId;
    }

    public void setRecUserAddressId(String recUserAddressId) {
        this.recUserAddressId = recUserAddressId == null ? null : recUserAddressId.trim();
    }

    public Long getPrintCount() {
        return printCount;
    }

    public void setPrintCount(Long printCount) {
        this.printCount = printCount;
    }

    public String getPickupType() {
        return pickupType;
    }

    public void setPickupType(String pickupType) {
        this.pickupType = pickupType == null ? null : pickupType.trim();
    }

    public Short getCommentLevel() {
        return commentLevel;
    }

    public void setCommentLevel(Short commentLevel) {
        this.commentLevel = commentLevel;
    }

    public BigDecimal getRealFee() {
        return realFee;
    }

    public void setRealFee(BigDecimal realFee) {
        this.realFee = realFee;
    }

    public Short getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(Short scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", orderId='" + orderId + '\'' +
                ", billCode='" + billCode + '\'' +
                ", siteId='" + siteId + '\'' +
                ", siteCode='" + siteCode + '\'' +
                ", siteName='" + siteName + '\'' +
                ", recSiteId='" + recSiteId + '\'' +
                ", recSiteCode='" + recSiteCode + '\'' +
                ", recSiteName='" + recSiteName + '\'' +
                ", assignSiteId='" + assignSiteId + '\'' +
                ", assignSiteCode='" + assignSiteCode + '\'' +
                ", assignSiteName='" + assignSiteName + '\'' +
                ", orderSource='" + orderSource + '\'' +
                ", orderSourceCode='" + orderSourceCode + '\'' +
                ", orderDate=" + orderDate +
                ", assignDate=" + assignDate +
                ", recDate=" + recDate +
                ", cancelDate=" + cancelDate +
                ", sendName='" + sendName + '\'' +
                ", sendPhone='" + sendPhone + '\'' +
                ", sendPostcode='" + sendPostcode + '\'' +
                ", sendAddress='" + sendAddress + '\'' +
                ", sendProvId='" + sendProvId + '\'' +
                ", sendProv='" + sendProv + '\'' +
                ", sendCityId='" + sendCityId + '\'' +
                ", sendCity='" + sendCity + '\'' +
                ", sendAreaId='" + sendAreaId + '\'' +
                ", sendArea='" + sendArea + '\'' +
                ", sendTownId='" + sendTownId + '\'' +
                ", sendTown='" + sendTown + '\'' +
                ", recPostcode='" + recPostcode + '\'' +
                ", recAddress='" + recAddress + '\'' +
                ", recName='" + recName + '\'' +
                ", recPhone='" + recPhone + '\'' +
                ", recMobile='" + recMobile + '\'' +
                ", recProvId='" + recProvId + '\'' +
                ", recProv='" + recProv + '\'' +
                ", recCityId='" + recCityId + '\'' +
                ", recCity='" + recCity + '\'' +
                ", recAreaId='" + recAreaId + '\'' +
                ", recArea='" + recArea + '\'' +
                ", recTownId='" + recTownId + '\'' +
                ", recTown='" + recTown + '\'' +
                ", recManCode='" + recManCode + '\'' +
                ", recMan='" + recMan + '\'' +
                ", assignManCode='" + assignManCode + '\'' +
                ", assignMan='" + assignMan + '\'' +
                ", pieces=" + pieces +
                ", goodsType='" + goodsType + '\'' +
                ", weight=" + weight +
                ", volumeWeight=" + volumeWeight +
                ", fastProductType='" + fastProductType + '\'' +
                ", datoubi='" + datoubi + '\'' +
                ", status=" + status +
                ", cancelCause='" + cancelCause + '\'' +
                ", sourceVersion=" + sourceVersion +
                ", sourceId='" + sourceId + '\'' +
                ", sourceBizid='" + sourceBizid + '\'' +
                ", sourceCustomerCode='" + sourceCustomerCode + '\'' +
                ", storePrice=" + storePrice +
                ", goodsValue=" + goodsValue +
                ", isCod=" + isCod +
                ", goodsPayment=" + goodsPayment +
                ", toPayment=" + toPayment +
                ", returnBillFee=" + returnBillFee +
                ", tranFee=" + tranFee +
                ", otherFee=" + otherFee +
                ", returnBillCode='" + returnBillCode + '\'' +
                ", blStorePrice=" + blStorePrice +
                ", blReturnBill=" + blReturnBill +
                ", blRetuBillSign=" + blRetuBillSign +
                ", signDate=" + signDate +
                ", blSign=" + blSign +
                ", dispMan='" + dispMan + '\'' +
                ", dispManCode='" + dispManCode + '\'' +
                ", blBack=" + blBack +
                ", messageType=" + messageType +
                ", sendBlMessage=" + sendBlMessage +
                ", receiveBlMessage=" + receiveBlMessage +
                ", sendSmsTemplate='" + sendSmsTemplate + '\'' +
                ", receiveSmsTemplate='" + receiveSmsTemplate + '\'' +
                ", remark='" + remark + '\'' +
                ", deletionStateCode=" + deletionStateCode +
                ", createOn=" + createOn +
                ", createUserId='" + createUserId + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createIp='" + createIp + '\'' +
                ", modifiedOn=" + modifiedOn +
                ", modifiedUserId='" + modifiedUserId + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedIp='" + modifiedIp + '\'' +
                ", syncTime=" + syncTime +
                ", fetchStartDate=" + fetchStartDate +
                ", fetchEndDate=" + fetchEndDate +
                ", goodsName='" + goodsName + '\'' +
                ", productType='" + productType + '\'' +
                ", baiduLatitude='" + baiduLatitude + '\'' +
                ", assignCenterId='" + assignCenterId + '\'' +
                ", assignCenterCode='" + assignCenterCode + '\'' +
                ", assignCenterName='" + assignCenterName + '\'' +
                ", payType='" + payType + '\'' +
                ", createCompanyId='" + createCompanyId + '\'' +
                ", createCompany='" + createCompany + '\'' +
                ", modifiedCompanyId='" + modifiedCompanyId + '\'' +
                ", modifiedCompany='" + modifiedCompany + '\'' +
                ", boxCode='" + boxCode + '\'' +
                ", gaodeLatitude='" + gaodeLatitude + '\'' +
                ", gaodeLongitude='" + gaodeLongitude + '\'' +
                ", customerMessage='" + customerMessage + '\'' +
                ", openId='" + openId + '\'' +
                ", sourceStatus=" + sourceStatus +
                ", assignManPhone='" + assignManPhone + '\'' +
                ", sendMobile='" + sendMobile + '\'' +
                ", wutongAssignSiteId='" + wutongAssignSiteId + '\'' +
                ", wutongAssignSiteCode='" + wutongAssignSiteCode + '\'' +
                ", wutongAssignSiteName='" + wutongAssignSiteName + '\'' +
                ", allotType='" + allotType + '\'' +
                ", printCode='" + printCode + '\'' +
                ", sendEmail='" + sendEmail + '\'' +
                ", recEmail='" + recEmail + '\'' +
                ", baiduLongitude='" + baiduLongitude + '\'' +
                ", jiBao='" + jiBao + '\'' +
                ", jiBaoCode='" + jiBaoCode + '\'' +
                ", idCard='" + idCard + '\'' +
                ", monthCustomer='" + monthCustomer + '\'' +
                ", parentOrderId='" + parentOrderId + '\'' +
                ", printBillImageId='" + printBillImageId + '\'' +
                ", pickupImageId='" + pickupImageId + '\'' +
                ", goodsImageId='" + goodsImageId + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", takeOrderDate=" + takeOrderDate +
                ", takeOrderStatus='" + takeOrderStatus + '\'' +
                ", pickupGoodsDate=" + pickupGoodsDate +
                ", bindBillCodeDate=" + bindBillCodeDate +
                ", sendCompanyName='" + sendCompanyName + '\'' +
                ", recCompanyName='" + recCompanyName + '\'' +
                ", sendUserAddressId='" + sendUserAddressId + '\'' +
                ", recUserAddressId='" + recUserAddressId + '\'' +
                ", printCount=" + printCount +
                ", pickupType='" + pickupType + '\'' +
                ", commentLevel=" + commentLevel +
                ", realFee=" + realFee +
                ", scheduleStatus=" + scheduleStatus +
                '}';
    }
}