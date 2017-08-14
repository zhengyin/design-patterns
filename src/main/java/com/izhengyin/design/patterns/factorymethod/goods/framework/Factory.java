package com.izhengyin.design.patterns.factorymethod.goods.framework;

import java.util.Properties;

/**
 * Created by zhengyin on 2017/8/12 下午5:50.
 * Email  <zhengyin.name@gmail.com> .
 */
public abstract class Factory {
    public Product create(String name){
        Product product = createProduct(name);
        registerProduct(product);
        return product;
    }
    public abstract Product createProduct(String name);
    public abstract void registerProduct(Product product);
}
