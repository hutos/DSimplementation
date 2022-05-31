package com.pekopeko.Queue.arrayqueue;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3114:27
 * @Description <p>循环队列</p>
 */
public class ArrayQueue implements IArrayQueue{
    private Object[] list;
    private int head;// 队头
    private int tail;// 队尾
    private int maxsize;

    public ArrayQueue(int maxsize){
        list = new Object[maxsize];
        head = 0;
        tail = 0;
        this.maxsize = maxsize;
    }

    /**
     * 入队
     */
    @Override
    public void enqueue(Object o){
        if ((tail+1)%maxsize == head){
            throw new IndexOutOfBoundsException("队列已满");
        }
        list[tail] = o;
        tail = (tail+1)%maxsize;
    }

    /**
     * 出队
     */
    @Override
    public Object dequeue() {
        // 队列非空，即可出队
        if (head == tail){
            throw new NullPointerException("队列为空");
        }
        Object o = list[head];
        head = (head + 1)%maxsize;
        return o;
    }

    /**
     * 队列长度
     */
    @Override
    public int length() {
        int p = head;
        int size = 0;
        while (p%maxsize != tail) {
            size++;
            p=(p+1)%maxsize;
        }
        return size;
    }

    /**
     * 队列是否为空
     */
    @Override
    public boolean isEmpty() {
        if (head == tail){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 队列是否已满
     */
    @Override
    public boolean isFull() {
        if ((tail+1)%maxsize == head){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 打印队列
     */
    @Override
    public void display() {
        int p = head;
        while (p%maxsize != tail){
            System.out.print(list[p] + " ");
            p=(p+1)%maxsize;
        }
        System.out.println();
    }
}
