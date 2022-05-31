package com.pekopeko.Queue.linkedqueue;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3117:22
 * @Description <p>链式队列测试类</p>
 */
public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        linkedQueue.enqueue(4);
        linkedQueue.enqueue(5);
        linkedQueue.display();
        System.out.println("==========我是分割线==========");
        System.out.println("出队");
        linkedQueue.dequeue();
        linkedQueue.display();
    }
}
