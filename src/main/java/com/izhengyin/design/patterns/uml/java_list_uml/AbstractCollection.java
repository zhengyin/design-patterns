package com.izhengyin.design.patterns.uml.java_list_uml;

/**
 * Created by zhengyin on 2017/8/4 下午3:59.
 * Email  <zhengyin.name@gmail.com> .
 */
public abstract class  AbstractCollection implements Collection{
    public boolean hasNext() {
        return false;
    }

    public boolean add(Object o) {
        return false;
    }

    public Object next() {
        return null;
    }

    public Iterator iterator() {
        return null;
    }

    public void remove() {

    }

    public boolean contains(Object o) {
        return false;
    }

    public int size() {
        return 0;
    }

    public void clear() {

    }
}
