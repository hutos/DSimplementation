package com.pekopeko.Stack.arraystack;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/319:19
 * @Description <p>数组栈测试类</p>
 */
public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(6);
        System.out.println("入栈：");
        arrayStack.push(1);
        arrayStack.push("momo");
        arrayStack.push(3);
        arrayStack.push("shamiko");
        arrayStack.push(5);
        arrayStack.push("jzj");
        arrayStack.display();
        System.out.println("==========我是分割线==========");
        System.out.println("弹栈：");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        arrayStack.push("ushio");
        arrayStack.display();
    }
}
