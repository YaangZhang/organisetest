package com.sto.order.web;

import com.alibaba.fastjson.JSON;
import com.sto.order.entity.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2019-6-19 16:03:58
 */
@RestController
@RequestMapping("/api")
public class OrderController {
    /**
     * "{"AppKey":"stoprint","Content":"eyJCYWlkdUx","Func":"sto.order.add","RequestType":"json","Signature":"ac2c8945e22ba45482c7d7ab4d7d5d3e","TimeSpan":"2019-06-19 15:13:07","UserInfo":"{\"Code\":\"2155990087\",\"CompanyCode\":\"2155\"}","Version":"1.0"}"
     * @param requestStr
     * @return
     */
    @RequestMapping("/order")
    public String  processRequest(String requestStr){
        if (requestStr == null ) {
            return null;
        }
        RequestEntity entity = JSON.parseObject(requestStr, RequestEntity.class);
        System.out.println("entity :"+entity.toString());
        String result = null;
        switch (entity.getFunc()){
            case "sto.order.add":
                result = add(entity);
                break;
            case "sto.order.batchadd":
                //ExceptionlessClient.Default.CreateLog(entity.FastToJson(), Exceptionless.Logging.LogLevel.Info).AddTags("sto.order.batchadd").Submit();
//                result = BatchAdd(entity);
                break;
            case "sto.order.cancel":
//                result = Cancel(entity);
                break;
            case "sto.order.return":
//                result = Return(entity);
                break;
            //case "sto.order.returnnew":
            //    result = ReturnNew(entity);
            //    break;
            case "sto.order.bindbillcode":
//                result = BindBillCode(entity);
                break;
            case "sto.order.remind":
//                result = Remind(entity);
                break;
            case "sto.order.urge":
//                result = Urge(entity);
                break;
            default:
                result = "无效方法";
                break;
        }


        return requestStr;
    }

    private String add(RequestEntity entity){

        return "abc";
    }

}
