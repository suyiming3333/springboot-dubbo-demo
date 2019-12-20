package com.sym.dubbo.orderserviceboot.serviceImpl;


import com.sym.dubbo.memberservicei.MemberServiceI;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: MemberServiceStub
 * @Package com.sym.dubbo.orderserviceboot.serviceImpl
 * @Description: TODO
 * @date 2019/12/19 23:08
 */
public class MemberServiceStub implements MemberServiceI {


    private final MemberServiceI memberService;

    public MemberServiceStub(MemberServiceI memberService) {
        this.memberService = memberService;
    }

    @Override
    public String getUserNameById(int id) {
        System.out.println("本地存根参数检查");
        if(id==10086){
            return memberService.getUserNameById(id);
        }
        return "参数不足，调用失败";
    }
}
