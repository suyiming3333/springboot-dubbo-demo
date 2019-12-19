package com.sym.dubbo.orderserviceboot.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sym.dubbo.orderservicei.OrderServiceI;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: OrderServiceImpl
 * @Package com.sym.dubbo.orderserviceboot.serviceImpl
 * @Description: TODO
 * @date 2019/12/19 22:10
 */

@Service(version = "1.0.0")
public class OrderServiceImpl implements OrderServiceI {
    @Override
    public String getOrderInfo(String orderId) {
        return "version 1.0.0 order info:"+orderId;
    }
}
