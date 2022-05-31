package com.pekopeko.Stack.sharestack;


/**
 * @author lustras
 * @version 1.0
 * @File com.
 * @CreateDate 2022/5/3111:07
 * @Description <p></p>
 */
public class ShareStackTest {
    public static void main(String[] args) {
        ShareStack shareStack = new ShareStack(20);
        shareStack.push1(1);
        shareStack.push1(2);
        shareStack.push1(3);
        shareStack.push1(4);
        shareStack.push1(5);
        System.out.println("打印一号栈的元素：");
        shareStack.display1();
        shareStack.push2(20);
        shareStack.push2(19);
        shareStack.push2(18);
        shareStack.push2(17);
        shareStack.push2(16);
        System.out.println("打印二号栈的元素：");
        shareStack.display2();

        System.out.println("==========我是分割线==========");
        shareStack.pop1();
        shareStack.display1();
        System.out.println("==========我是分割线==========");
        shareStack.pop2();
        shareStack.display2();

    }
}
