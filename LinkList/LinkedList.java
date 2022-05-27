package com.pekopeko.LinkList;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/2710:23
 * @Description <p>带头结点的链表</p>
 */
public class LinkedList implements ILinkedList{
    // 头结点
    private Node head;

    public LinkedList() {
        this.head = new Node();
    }

    /**
     * 清空
     */
    @Override
    public void clear() {
        head.data = null;
        head.next = null;
    }

    /**
     * 获取链表长度
     */
    @Override
    public int length() {
        Node p = head;
        int len = 0;
        while (p.next != null){
            p = p.next;
            len ++;
        }
        return len;
    }

    /**
     * 判断是否为空
     */
    @Override
    public boolean isEmpty() {
        return head.next == null;
    }

    /**
     * 获取指定元素
     * @param i 第i个位置
     */
    @Override
    public Object get(int i) {
        Node p = head;
        int index = 0;
        // 不存在
        if (index > i || p == null){
            System.out.println("不存在");
        }
        // 存在
        while (i > index && p != null){
            p = p.next;
            index ++;
        }
        return p.data;
    }

    /**
     * 头插法新增结点
     * @param o 结点
     */
    @Override
    public void add(Object o) {
        Node node = new Node(o);
        node.next = head.next;
        head.next = node;
    }

    @Override
    public void addTail(Object o) {

    }

    @Override
    public void insert(int index, Object o) {

    }

    @Override
    public int indxeOf(Object o) {
        return 0;
    }

    @Override
    public void display() {

    }
}
