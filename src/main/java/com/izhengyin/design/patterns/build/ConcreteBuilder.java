package com.izhengyin.design.patterns.build;

/**
 * Created by zhengyin on 2017/8/16 下午2:56.
 * Email  <zhengyin.name@gmail.com> .
 * ConcreteBuilder (具体的构建者)
 *   负责构建者的API的具体实现
 */
public class ConcreteBuilder implements Builder {
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m3() {
        System.out.println("m3");
    }
}
