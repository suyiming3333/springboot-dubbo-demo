package com.sym.dubbo.memberserviceboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sym.dubbo.memberservicei.MemberServiceI;
import com.sym.dubbo.orderservicei.OrderServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: MemberController
 * @Package com.sym.dubbo.memberserviceboot.controller
 * @Description: TODO
 * @date 2019/12/19 21:35
 */
@RestController
class MemberController {

    @Autowired
    private MemberServiceI memberService;

    @Reference(check = false,version = "1.0.0")
    private OrderServiceI orderService;

    @RequestMapping("/testMember")
    public String index(){
        return memberService.getUserNameById(10086);
    }

    @RequestMapping("/getOrderInfo")
    public String getOrderInfo(){
        return orderService.getOrderInfo("10010");
    }
}
