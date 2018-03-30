package com.whs.rpc.dubbo.demo.service.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceProvider {

    public static void main(String[] args) throws IOException {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        // press any key to exit
        System.in.read();
        context.close();
    }

}
