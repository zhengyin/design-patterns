package com.izhengyin.design.patterns.uml.java_list_uml;

/**
 * Created by zhengyin on 2017/8/4 下午4:01.
 * Email  <zhengyin.name@gmail.com> .
 */
public abstract class  AbstractList extends  AbstractCollection implements List{
    @Override
    public boolean hasNext() {
        return super.hasNext();
    }

    @Override
    public boolean add(Object o) {
        return super.add(o);
    }

    @Override
    public Object next() {
        return super.next();
    }

    @Override
    public Iterator iterator() {
        return super.iterator();
    }

    @Override
    public void remove() {
        super.remove();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public void clear() {
        super.clear();
    }
}
