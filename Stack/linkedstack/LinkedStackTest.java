package com.pekopeko.Stack.linkedstack;

/**
 * @author lustras
 * @version 1.0
 * @File com.
 * @CreateDate 2022/5/3110:34
 * @Description <p>链栈测试类</p>
 */
public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push("jzj");
        linkedStack.push("emilia");
        linkedStack.push("shamiko");
        linkedStack.push("suzy");
        linkedStack.push("momo");
        System.out.println("打印链栈：");
        linkedStack.display();
        System.out.println("==========我是分割线==========");
        linkedStack.pop();
        linkedStack.pop();
        System.out.println("弹栈之后打印链栈：");
        linkedStack.display();
        System.out.println("==========我是分割线==========");
        System.out.println("判断栈是否为空");
        System.out.println(linkedStack.isEmpty());
        System.out.println("==========我是分割线==========");
        linkedStack.clear();
        System.out.println("清空后判断栈是否为空");
        System.out.println(linkedStack.isEmpty());
    }

}
