package com.pekopeko.Queue.linkedqueue;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3117:16
 * @Description <p>链式队列</p>
 */
public interface ILinkedQueue {
    /**
     * 入队
     * @param o 入队数据
     */
    public void enqueue(Object o);

    /**
     * 出队
     */
    public Object dequeue();

    /**
     * 判空
     */
    public boolean isEmpty();

    /**
     * 清空
     */
    public void clear();

    /**
     * 打印队列
     */
    public void display();
}
