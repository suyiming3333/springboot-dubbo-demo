package com.sym.dubbo.orderservice.controller;

import com.sym.dubbo.memberservicei.MemberServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private MemberServiceI memberService;

    @RequestMapping("/helloDubbo")
    public String helloDubbo(){
        return memberService.getUserNameById(10086);
    }
}
