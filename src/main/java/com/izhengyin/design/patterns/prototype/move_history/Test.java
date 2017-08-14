package com.izhengyin.design.patterns.prototype.move_history;

import com.izhengyin.design.patterns.prototype.move_history.framework.DotProduct;
import com.izhengyin.design.patterns.prototype.move_history.framework.HistoryManager;

/**
 * Created by zhengyin on 2017/8/14 下午4:32.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {
    public static void main(String[] args){
        HistoryManager actionManager = new HistoryManager();
        DotProduct dot = new Dot(1,1);
        dot = actionManager.ctrls(dot);
        dot.move(3,3);
        dot = actionManager.ctrls(dot);
        dot.move(10,10);
        dot = actionManager.ctrls(dot);
        dot.move(11,11);
        dot = actionManager.ctrls(dot);
        actionManager.history();
        System.out.println(actionManager.ctrlz());
        System.out.println(actionManager.ctrlz());
        System.out.println(actionManager.ctrlz());
        //System.out.println(actionManager.ctrlz());
    }
}
