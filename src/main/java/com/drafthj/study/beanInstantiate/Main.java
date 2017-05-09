package com.drafthj.study.beanInstantiate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huojia02 on 17/5/9.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        ExampleBean exampleBean = (ExampleBean) applicationContext.getBean("exampleBean1");
        System.out.println(exampleBean.getId());
    }
}
