package com.pekopeko.Stack.sharestack;

/**
 * @author lustras
 * @version 1.0
 * @File com.
 * @CreateDate 2022/5/3111:08
 * @Description <p></p>
 */
public interface IShareStack {
    /**
     * 一号栈入栈
     * @param o 数据
     */
    public void push1(Object o);

    /**
     * 一号栈出栈
     */
    public Object pop1();

    /**
     * 二号栈入栈
     * @param o 数据
     */
    public void push2(Object o);

    /**
     * 二号栈出栈
     */
    public Object pop2();

    /**
     * 打印一号共享栈
     */
    public void display1();

    /**
     * 打印二号共享栈
     */
    public void display2();

    /**
     * 判断一号栈是否为空
     */
    public boolean isEmpty1();

    /**
     * 判断二号栈是否为空
     */
    public boolean isEmpty2();
}
