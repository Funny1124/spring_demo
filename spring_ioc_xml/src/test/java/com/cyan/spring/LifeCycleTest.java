package com.cyan.spring;

import com.cyan.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {
    /*
     *bean的生命周期
     *1、实例化
     *2、依赖注入
     *3、初始化。需要通过bean的init-Method 属性指定初始化的方法
     *4、销毁。需要通过bean的destroy-Method 属性指定销毁的方法
     *
     * 注意：
     * 若bean的作用域为单例时，生命周期的前三个步骤会在获取IOC容器时执行
     * 若bean的作用域为多例时，生命周期的前三个步骤会在获取bean时执行
     */
    @Test
    public void testLifeCycle() {
//       ConfigurableApplicationContext 是ApplicationContext的子接口，扩展了刷新和关闭ioc的方法
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }
}
