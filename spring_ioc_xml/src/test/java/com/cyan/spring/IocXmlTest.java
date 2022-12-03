package com.cyan.spring;

import com.cyan.spring.pojo.Clazz;
import com.cyan.spring.pojo.Person;
import com.cyan.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocXmlTest {
    /**
     * 获取bean的三种方式
     * 1.通过bean id获取
     * 2.通过bean类型获取，最常用
     * 注意：
     * 根据类型获取bean时，要求ioc容器中有且只有一个类型匹配的bean
     * 若一个类型匹配的bean，会抛出 NoSuchBeanDefinitionException
     * 若有多个类型匹配的bean，会抛出 NoUniqueBeanDefinitionException
     * 3.根据id和类型
     */
    @Test
    public void testIoc() {
        //获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        //第一种
//        Student studentOne = (Student) ioc.getBean("studentOne");
//        System.out.println(studentOne);
        //第二种（最常用）
//        Student student = ioc.getBean(Student.class);
//        System.out.println(student);

        //根据类型实现的接口获取bean
        Person person = ioc.getBean(Person.class);
        System.out.println(person);

        //第三种
//        Student studentOne = ioc.getBean("studentOne", Student.class);
//        System.out.println(studentOne);


    }

    //setter注入
    @Test
    public void testDI() {
        //获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
//        Student student = ioc.getBean("studentTwo", Student.class);
//        System.out.println(student);

        Student student = ioc.getBean("studentFive", Student.class);
        System.out.println(student);

//        Clazz clazz = ioc.getBean("clazz", Clazz.class);
//        System.out.println(clazz);
    }
}
