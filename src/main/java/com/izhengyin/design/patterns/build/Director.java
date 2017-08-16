package com.izhengyin.design.patterns.build;

/**
 * Created by zhengyin on 2017/8/16 下午2:59.
 * Email  <zhengyin.name@gmail.com> .
 * Director (监工）
 *  负责使用 builder 接口做具体的事
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){
        builder.m1();
        builder.m2();
        builder.m3();
    }
}
