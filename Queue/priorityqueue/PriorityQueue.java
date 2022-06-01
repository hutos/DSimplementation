package com.pekopeko.Queue.priorityqueue;

import com.pekopeko.Queue.arrayqueue.IArrayQueue;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/6/110:21
 * @Description <p>优先队列</p>
 */
public class PriorityQueue implements IArrayQueue {
    private Object[] list;

    private int maxsize;

    // 有效元素大小(数组有效长度)
    private int elems;

    public PriorityQueue(int maxsize) {
        this.list = new Object[maxsize];
        this.maxsize = maxsize;
        elems = 0;
    }

    @Override
    public void enqueue(Object o) {
        // 有效长度大于maxsize，数组已满
        if (elems > maxsize){
            throw new IndexOutOfBoundsException("数组已满");
        }

        int i;
        // 比较有效长度的内容中的值和新增的值大小，找到新增值位置并记录
        for (i = 0; i < elems; i++) {
            if ((int) o < (int) list[i]) {
                break;
            }
        }

        // 从后往前找，直到找到i位置，然后把包括i位置后的元素全部右移
        for (int j = elems; j > i; j--) {
            list[j] = list[j - 1];
        }
        list[i] = o;
        elems++;
    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        for (int i = 0; i < elems; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
