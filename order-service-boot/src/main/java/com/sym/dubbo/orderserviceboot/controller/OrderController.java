package com.sym.dubbo.orderserviceboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;
import com.sym.dubbo.memberservicei.MemberServiceI;
import com.sym.dubbo.orderserviceboot.serviceImpl.MemberServiceStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    //不检查服务提供者，设置超时时间为2000毫秒
    //(默认取consumer的配置，如果没有配置默认是1000ms)
    //本地存根配置(先执行本地存根，在通过代理对象执行远程调用)
    //url = "dubbo://127.0.0.1:20880/com.sym.dubbo.memberservicei.MemberServiceI",指定url 绕过注册中心直连
    //loadbalance:random（默认）、roundrobin权重轮训、leaseactive最少活跃调用树、consistenhash一致性hash
    @Reference(loadbalance = "roundrobin",check = false,timeout = 5000,stub = "com.sym.dubbo.orderserviceboot.serviceImpl.MemberServiceStub")
    private MemberServiceI memberService;

    @RequestMapping("/helloDubbo")
    public String helloDubbo(){
        return memberService.getUserNameById(10086);
    }
}
