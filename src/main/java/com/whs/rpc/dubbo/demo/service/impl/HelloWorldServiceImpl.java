package com.whs.rpc.dubbo.demo.service.impl;

import com.whs.rpc.dubbo.demo.service.intf.IHelloWorldService;

/**
 * 服务的实现
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年3月30日 上午11:26:03
 */
public class HelloWorldServiceImpl implements IHelloWorldService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

}
