package com.sto.entity;

import java.io.Serializable;


/**
 * @param <T>
 * @author lion king
 */
    public class BaseResult<T> implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // 操作是否成功
    public boolean Status = false;

    // 返回值
    public String ResultValue = "";

    // 返回状态代码
    public String StatusCode = "UnknownError";

    // 返回消息内容
    public String StatusMessage = "未知错误";
    // 调试信息返回，例如只有在内网才能返回调试信息
    // public string Trace = "所有的调试信息在这里返回，就牛b了";

    /// 查询分页数据时返回记录条数用
    public int RecordCount = 0;


    public T Data;

    @Override
    public String toString() {
        return "BaseResult{" +
                "Status=" + Status +
                ", ResultValue='" + ResultValue + '\'' +
                ", StatusCode='" + StatusCode + '\'' +
                ", StatusMessage='" + StatusMessage + '\'' +
                ", RecordCount=" + RecordCount +
                ", Data=" + Data +
                '}';
    }
}




