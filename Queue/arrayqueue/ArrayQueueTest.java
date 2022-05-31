package com.pekopeko.Queue.arrayqueue;

/**
 * @author lustras
 * @version 1.0
 * @File com.
 * @CreateDate 2022/5/3115:00
 * @Description <p></p>
 */
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        System.out.println("打印队列");
        arrayQueue.display();
        System.out.println("==========我是分割线==========");
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(7);
        arrayQueue.enqueue(8);
        arrayQueue.dequeue();
        arrayQueue.enqueue(9);
        arrayQueue.display();
        System.out.println(arrayQueue.isFull());
        System.out.println("==========我是分割线==========");
        System.out.println("队列长度为：" + arrayQueue.length());
    }
}
