package com.pekopeko.Queue.linkedqueue;

import com.pekopeko.LinkList.singlelinkedlist.Node;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3117:14
 * @Description <p>链式队列</p>
 */
public class LinkedQueue implements ILinkedQueue{
    private Node head;

    public LinkedQueue(){
        head = new Node();
    }

    @Override
    public void enqueue(Object o) {
        Node p = head;
        while (p.next != null){
            p = p.next;
        }
        Node node = new Node(o);
        p.next = node;
    }

    @Override
    public Object dequeue() {
        if (head.next == null){
            throw new NullPointerException("队列为空，不能出队");
        }
        Object o = head.next.data;
        head.next = head.next.next;
        return o;
    }

    @Override
    public boolean isEmpty() {
        if (head.next == null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void clear() {
        head.next = null;
    }

    @Override
    public void display() {
        Node p = head.next;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }
}
