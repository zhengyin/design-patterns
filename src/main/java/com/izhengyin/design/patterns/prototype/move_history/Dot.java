package com.izhengyin.design.patterns.prototype.move_history;

import com.alibaba.fastjson.JSON;
import com.izhengyin.design.patterns.prototype.move_history.framework.DotProduct;

/**
 * Created by zhengyin on 2017/8/14 下午3:52.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Dot implements DotProduct {

    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int _x , int _y){
        this.x += _x;
        this.y += _y;
    }



    @Override
    public DotProduct createClone() {
        try{
            return (DotProduct)this.clone();
        }catch (CloneNotSupportedException e){

        }
        return null;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
