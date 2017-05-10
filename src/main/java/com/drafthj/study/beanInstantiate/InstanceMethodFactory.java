package com.drafthj.study.beanInstantiate;

/**
 * Created by huojia02 on 17/5/10.
 */
public class InstanceMethodFactory {

    public InstanceMethodExampleBean createInstance(){
        return new InstanceMethodExampleBean();
    }

    public InstanceMethodExampleBean2 createInstance2(){
        return new InstanceMethodExampleBean2();
    }
}
