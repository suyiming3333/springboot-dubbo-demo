package com.sym.dubbo.orderserviceboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sym.dubbo.memberservicei.MemberServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

//    @Autowired
    @Reference(check = false)
    private MemberServiceI memberService;

    @RequestMapping("/helloDubbo")
    public String helloDubbo(){
        return memberService.getUserNameById(10086);
    }
}
