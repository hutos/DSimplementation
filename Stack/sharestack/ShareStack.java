package com.pekopeko.Stack.sharestack;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3111:00
 * @Description <p>共享栈</p>
 */
public class ShareStack implements IShareStack {
    Object[] list;
    int[] top = new int[2];

    public ShareStack(int maxsize){
        list = new Object[maxsize];
        top[0] = -1;
        top[1] = list.length;
    }


    @Override
    public void push1(Object o) {
        // 如果栈未满，就进栈
        if (top[0] + 1 != top[1]){
            list[++top[0]] = o;
        }
    }

    @Override
    public Object pop1() {
        // 如果栈未空，就能出栈
        if (isEmpty1()){
            System.out.println("栈已空");
            return false;
        }
        Object o = list[top[0]--];
        return o;
    }

    @Override
    public void push2(Object o) {
        // 如果栈未满，就进栈
        if (top[1] - 1 != top[0]){
            list[--top[1]] = o;
        }
    }

    @Override
    public Object pop2() {
        // 如果栈未空，就能出栈
        if (isEmpty2()){
            System.out.println("栈已空");
            return false;
        }
        Object o = list[top[1]++];
        return o;
    }

    @Override
    public void display1() {
        for (int i = 0; i <= top[0]; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void display2() {
        for (int i = list.length - 1; i >= top[1]; i--) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty1() {
        if (top[0] == -1) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean isEmpty2() {
        if (top[1] == list.length) {
            return true;
        }else {
            return false;
        }
    }
}
