package com.sym.dubbo.memberserviceboot.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sym.dubbo.memberservicei.MemberServiceI;

@Service
public class MemberServiceImpl implements MemberServiceI {
    @Override
    public String getUserNameById(int id) {
        System.out.println("收到订单服务的id:"+id);
        return "suyiming from dubbo-member-service"+"收到订单服务的id:"+id;
    }
}
