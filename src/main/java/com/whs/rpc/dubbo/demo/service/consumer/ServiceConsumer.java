package com.whs.rpc.dubbo.demo.service.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.whs.rpc.dubbo.demo.service.intf.IHelloWorldService;

public class ServiceConsumer {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        IHelloWorldService demoService = (IHelloWorldService) context.getBean("helloworldService");
        String hello = demoService.sayHello("haiswang");
        System.out.println(hello);
        context.close();
    }

}
