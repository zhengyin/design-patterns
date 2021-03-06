package com.izhengyin.design.patterns.uml.java_list_uml;

/**
 * Created by zhengyin on 2017/8/4 下午3:44.
 * Email  <zhengyin.name@gmail.com> .
 */
public interface Collection extends Iterator{
    public boolean add(Object o);
    public Iterator iterator();
    public boolean contains(Object o);
    public int size();
    public void clear();
}
