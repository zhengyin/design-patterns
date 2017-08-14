package com.izhengyin.design.patterns.prototype.move_history.framework;

/**
 * Created by zhengyin on 2017/8/14 下午3:56.
 * Email  <zhengyin.name@gmail.com> .
 */
public interface DotProduct extends Cloneable{

    public void move(int x,int y);

    //clone
    public DotProduct createClone();
}
