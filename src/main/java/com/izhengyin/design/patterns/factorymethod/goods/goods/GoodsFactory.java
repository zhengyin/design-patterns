package com.izhengyin.design.patterns.factorymethod.goods.goods;

import com.izhengyin.design.patterns.factorymethod.goods.framework.Factory;
import com.izhengyin.design.patterns.factorymethod.goods.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengyin on 2017/8/12 下午5:53.
 * Email  <zhengyin.name@gmail.com> .
 */
public class GoodsFactory extends Factory{

    private List<Product> products = new ArrayList<>();


    @Override
    public Product createProduct(String name) {
        return new GoodsProduct(name);
    }

    @Override
    public void registerProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }
}
