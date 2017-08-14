package com.izhengyin.design.patterns.factorymethod.goods;

import com.izhengyin.design.patterns.factorymethod.goods.framework.Factory;
import com.izhengyin.design.patterns.factorymethod.goods.framework.Product;
import com.izhengyin.design.patterns.factorymethod.goods.goods.GoodsFactory;

/**
 * Created by zhengyin on 2017/8/12 下午5:57.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    public static void main(String[] args){
        GoodsFactory goodsFactory = new GoodsFactory();
        Product product1 = goodsFactory.create("三星手机");
        Product product2 = goodsFactory.create("苹果手机");
        Product product3 = goodsFactory.create("华为手机");
        System.out.println(product1.use());
        System.out.println(product2.use());
        System.out.println(product3.use());
    }
}
