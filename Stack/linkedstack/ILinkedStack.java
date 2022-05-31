package com.pekopeko.Stack.linkedstack;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3110:20
 * @Description <p>链栈接口</p>
 */
public interface ILinkedStack {
    /**
     * 入栈
     * @param o 数据
     */
    public void push(Object o);

    /**
     * 出栈
     */
    public Object pop();

    /**
     * 打印链栈
     */
    public void display();

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty();

    /**
     * 清空栈
     */
    public void clear();
}
