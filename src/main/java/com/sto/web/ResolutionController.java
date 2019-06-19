package com.sto.web;

import com.sto.mapper.one.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 机器分单-人工智能
 */
@Controller
@RequestMapping("/resolution")
public class ResolutionController {
    @Autowired
    private OrderMapper orderMapper;

    @RequestMapping("/search")
    public String searchBaseUserExpress(@PathVariable String companyId, @RequestParam(name = "key" , defaultValue = "") String key){


        return null;
    }


}
