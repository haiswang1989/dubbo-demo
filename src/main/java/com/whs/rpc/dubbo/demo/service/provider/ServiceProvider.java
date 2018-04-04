package com.whs.rpc.dubbo.demo.service.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月4日 上午11:17:28
 */
public class ServiceProvider {

    public static void main(String[] args) throws IOException {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        
        System.in.read();
        
        context.close();
    }

}
