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

        StaticMethodExampleBean staticBean1 = (StaticMethodExampleBean) applicationContext.getBean("staticMethodExampleBean");
        staticBean1.setTest("hello world");
        StaticMethodExampleBean staticBean2 = (StaticMethodExampleBean) applicationContext.getBean("staticMethodExampleBean");

        System.out.println(staticBean1.getTest());
        System.out.println(staticBean2.getTest());

        InstanceMethodExampleBean instanceBean1 = (InstanceMethodExampleBean) applicationContext.getBean("instanceMethod");
        InstanceMethodExampleBean2 instanceBean2 = (InstanceMethodExampleBean2) applicationContext.getBean("instanceMethod2");
        instanceBean1.setName("i am created by instance method factory");
        System.out.println(instanceBean1.getName());
        System.out.println(instanceBean2.getName());
    }
}
