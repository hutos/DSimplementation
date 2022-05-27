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

    /**
     * 尾插法新增结点
     * @param o 数据
     */
    @Override
    public void addTail(Object o) {
        Node node = new Node(o);
        Node p = head;
        // 遍历到链表的最后一个结点
        while (p.next != null){
            p = p.next;
        }
        node.next = null;
        p.next = node;
    }

    /**
     * 在index位置插入结点（中）
     * @param index 第i个位置
     * @param o 数据
     */
    @Override
    public void insert(int index, Object o) {
        int i = 0;
        Node p = head;

        // 检索index是否超出范围
        if (index <= i || p == null){
            System.out.println("超出范围");
            return;
        }

        // 找到位置
        while (i != index){
            p=p.next;
            i++;
        }
        Node node = new Node(o);
        node.next = p.next;
        p.next = node;
    }

    @Override
    public void remove(int index) {
        int i = 0;
        Node p = head;
        if (index < 0 || p == null || index > this.length()){
            System.out.println("超出范围");
            return;
        }
        // 找位置，单链表删除需要知道删除结点的前一个结点的指针
        while ((i+1) != index){
            p=p.next;
            i++;
        }
        // 结点是否在链表的尾部
        if (p.next.next == null){
            p.next = null;
            return;
        }else {
            p.next=p.next.next;
        }

    }

    /**
     * 查找对应元素下标
     *
     * @param o 数据
     */
    @Override
    public int indexOf(Object o) {
        int index = 1;
        Node p = head.next;
        while (p.data != o || p.next != null){
            p=p.next;
            index ++;
        }
        return index;
    }

    @Override
    public void display() {
        Node p = head.next;
        while (p != null) {
            System.out.print(p.toString());
            p = p.next;
        }
        System.out.println("\n");
    }
}
