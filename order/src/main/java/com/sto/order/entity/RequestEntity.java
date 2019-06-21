package com.sto.order.entity;

import java.io.Serializable;

/**
 * 获取订单请求实体
 * @param <T>
 * @author lion king
 */
public class RequestEntity<T> implements Serializable {
    /// 请求格式（json还是xml）为了解析方便
    public String RequestType;
    /// 请求方式名称
    public String Func;
    /// 业务数据（需要加密，UTF-8编码）
    /// SecretUtil.EncodeBase64("UTF-8", JsonConvert.SerializeObject(业务实体));
    public String Content ;
    /// 接口账号
    public String AppKey ;
    /// 请求接口时间
    public String TimeSpan ;
    /// 加密验证信息
    /// System.Web.HttpUtility.UrlEncode(SecretUtil.md5(AppKey+请求时间戳+加密的业务参数+AppSecret))
    public String Signature;
    /// 接口版本号
    public String Version ;

    @Override
    public String toString() {
        return "RequestEntity{" + "RequestType='" + RequestType + '\'' + ", Func='" + Func + '\'' + ", Content='" + Content + '\'' + ", AppKey='" + AppKey + '\'' + ", TimeSpan='" + TimeSpan + '\'' + ", Signature='" + Signature + '\'' + ", Version='" + Version + '\'' + ", UserInfo='" + UserInfo + '\'' + '}';
    }

    public String getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(String userInfo) {
        UserInfo = userInfo;
    }

    /// 用户信息
    public String UserInfo ;

    public String getRequestType() {
        return RequestType;
    }

    public void setRequestType(String requestType) {
        RequestType = requestType;
    }

    public String getFunc() {
        return Func;
    }

    public void setFunc(String func) {
        Func = func;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getAppKey() {
        return AppKey;
    }

    public void setAppKey(String appKey) {
        AppKey = appKey;
    }

    public String getTimeSpan() {
        return TimeSpan;
    }

    public void setTimeSpan(String timeSpan) {
        TimeSpan = timeSpan;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }



}