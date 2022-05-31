package com.pekopeko.Queue.arrayqueue;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3114:28
 * @Description <p>循环队列接口</p>
 */
public interface IArrayQueue {
    /**
     * 入队
     */
    public void enqueue(Object o);

    /**
     * 出队
     */
    public Object dequeue();

    /**
     * 队列长度
     */
    public int length();

    /**
     * 队列是否为空
     */
    public boolean isEmpty();

    /**
     * 队列是否已满
     */
    public boolean isFull();

    /**
     * 打印队列
     */
    public void display();
}
