package com.drafthj.study.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huojia02 on 17/5/10.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di.xml");
        ExampleBean exampleBean = (ExampleBean) applicationContext.getBean("exampleBean");
        System.out.println(exampleBean);
    }
}
