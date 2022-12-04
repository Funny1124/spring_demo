package com.cyan.spring.factory;

import com.cyan.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;


/*
    FactoryBean是一个接口，需要创建一个实现类
    其中有三个方法
        isSingleton：所提供的bean是否为单例
        getObject：通过返回一个对象交给ioc管理
        getObjectType：设置所提供的对象的类型
    当给FactoryBean的实现类配置为bean时，会将当前类中getObject所返回的对象交给ioc容器管理
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
