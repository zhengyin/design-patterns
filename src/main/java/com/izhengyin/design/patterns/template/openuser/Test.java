package com.izhengyin.design.patterns.template.openuser;

/**
 * Created by zhengyin on 2017/8/11 下午5:41.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {
    public static void main(String[] args){
        OpenUser openWeibo = new OpenWeibo();
        System.out.println(openWeibo.getUserInfo());
        OpenUser openWeixin = new OpenWeixin();
        System.out.println(openWeixin.getUserInfo());
    }
}
