package com.drafthj.study.dependencyInjection;

import java.beans.ConstructorProperties;

/**
 * Created by huojia02 on 17/5/10.
 */
public class ExampleBean {
    private int years;

    private String ultimateAnswer;

    private Bar bar;

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    @ConstructorProperties({"y","u"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "years=" + years +
                ", ultimateAnswer='" + ultimateAnswer + '\'' +
                '}';
    }
}
