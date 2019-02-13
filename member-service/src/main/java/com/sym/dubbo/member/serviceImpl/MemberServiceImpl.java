package com.sym.dubbo.member.serviceImpl;

import com.sym.dubbo.memberservicei.MemberServiceI;

public class MemberServiceImpl implements MemberServiceI {
    @Override
    public String getUserNameById(int id) {
        System.out.println("收到订单服务的id:"+id);
        return "suyiming from dubbo-member-service"+"收到订单服务的id:"+id;
    }
}
