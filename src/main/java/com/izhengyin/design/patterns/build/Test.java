package com.izhengyin.design.patterns.build;

/**
 * Created by zhengyin on 2017/8/16 下午3:00.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    public static void main(String[] args){
        Director director = new Director(new ConcreteBuilder());
        director.construct();
    }
}
