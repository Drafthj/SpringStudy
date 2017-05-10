package com.drafthj.study.beanInstantiate;

/**
 * Created by huojia02 on 17/5/10.
 */
public class StaticMethodFactory {
    public static StaticMethodExampleBean createBean(){
        StaticMethodExampleBean bean = new StaticMethodExampleBean();
        bean.setTest("i create by static method");
        return bean;
    }
}
