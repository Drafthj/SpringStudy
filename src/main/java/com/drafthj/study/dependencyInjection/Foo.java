package com.drafthj.study.dependencyInjection;

/**
 * Created by huojia02 on 17/5/10.
 */
public class Foo {
    private Bar bar;
    private Baz baz;

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public Baz getBaz() {
        return baz;
    }

    public void setBaz(Baz baz) {
        this.baz = baz;
    }
}
