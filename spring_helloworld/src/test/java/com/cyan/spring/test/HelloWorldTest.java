package com.cyan.spring.test;

import com.cyan.spring.pojo.HelloWork;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void test(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWork helloworld = (HelloWork) ioc.getBean("helloworld");
        helloworld.sayHello();
    }
}
