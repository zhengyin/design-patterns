package com.izhengyin.design.patterns.adapter;

import com.izhengyin.design.patterns.adapter.clas.Restful;
import com.izhengyin.design.patterns.adapter.clas.UserApi;
import com.izhengyin.design.patterns.adapter.obj.DataApi;

/**
 * Created by zhengyin on 2017/8/5 上午11:04.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {
    public static void main(String[] args){
        test1();
        test2();
    }
    private static void test1(){
        Restful restful = new UserApi();
        System.out.println(restful.get());
        System.out.println(restful.post());
        System.out.println(restful.put());
        System.out.println(restful.delete());
    }

    private static void test2(){
        com.izhengyin.design.patterns.adapter.obj.Restful restful = new DataApi();
        System.out.println(restful.get());
        System.out.println(restful.post());
        System.out.println(restful.put());
        System.out.println(restful.delete());
    }
}
