package com.pekopeko.Queue.priorityqueue;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/6/110:53
 * @Description <p>优先队列测试类</p>
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(10);
        priorityQueue.enqueue(1);
        priorityQueue.enqueue(7);
        priorityQueue.enqueue(9);
        priorityQueue.enqueue(2);
        priorityQueue.enqueue(8);
        priorityQueue.enqueue(6);
        System.out.println("打印优先队列");
        priorityQueue.display();
    }
}
