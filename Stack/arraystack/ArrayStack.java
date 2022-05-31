package com.pekopeko.Stack.arraystack;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/319:08
 * @Description <p>数组栈</p>
 */
public class ArrayStack implements IArrayStack{
    int cur;
    Object[] list;

    public ArrayStack(int maxsize) {
        list = new Object[maxsize];
        cur = 0;
    }

    @Override
    public void push(Object o) {
        // 如果栈底指针的位置大于了list数组的长度，栈满
        try {
            if (cur >= list.length){
                throw new IndexOutOfBoundsException();
            }
        }catch (IndexOutOfBoundsException ie){
            ie.printStackTrace();
            return;
        }
        list[cur] = o;
        cur++;
    }

    @Override
    public Object pop() {
        // 判断栈是否为空
        if (isEmpty()){
            System.out.println("栈空");
            return null;
        }
        Object obj = list[--cur];
        return obj;
    }

    @Override
    public void display() {
        // 此处不应该是打印整个数组，而是打印到栈顶为止
        for (int i = 0; i < cur; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        // 当cur=0的位置也没有元素的时候，栈空
        if (cur == 0){
            return true;
        }else {
            return false;
        }
    }

}
