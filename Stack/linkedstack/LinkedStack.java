package com.pekopeko.Stack.linkedstack;

/**
 * @author lustras
 * @version 1.0
 * @File com.
 * @CreateDate 2022/5/3110:20
 * @Description <p>链栈</p>
 */
public class LinkedStack implements ILinkedStack{
    private Node head;

    public LinkedStack() {
        this.head = new Node();
    }

    // 因为链表的性质，需要用头插法才方便实现进栈
    @Override
    public void push(Object o) {
        Node node = new Node(o);
        node.next = head.next;
        head.next = node;
    }

    @Override
    public Object pop() {
        head.next = head.next.next;
        return head.next.data;
    }

    @Override
    public void display() {
        Node p = head;
        while (p.next != null){
            System.out.print(p.next.data + " ");
            p=p.next;
        }
        System.out.println();
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
        return;
    }

}
