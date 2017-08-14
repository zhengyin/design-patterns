package com.izhengyin.design.patterns.factorymethod.goods.goods;

import com.izhengyin.design.patterns.factorymethod.goods.framework.Product;

/**
 * Created by zhengyin on 2017/8/12 下午5:54.
 * Email  <zhengyin.name@gmail.com> .
 */
public class GoodsProduct implements Product{

    private String name;

    public GoodsProduct(String name){
        this.name = name;
    }

    @Override
    public String use() {
        return "use "+name;
    }
}
