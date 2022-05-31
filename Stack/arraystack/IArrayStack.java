package com.pekopeko.Stack.arraystack;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/319:10
 * @Description <p>数组栈接口</p>
 */
public interface IArrayStack {
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
     * 打印数组栈
     */
    public void display();

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty();

}
