package com.izhengyin.design.patterns.uml.java_list_uml;

/**
 * Created by zhengyin on 2017/8/4 下午3:45.
 * Email  <zhengyin.name@gmail.com> .
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
    public void remove();
}
