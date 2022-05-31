package com.pekopeko.LinkList.doublelinkedlist;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3014:46
 * @Description <p>双向循环链表</p>
 */
public class DoubleLinkedList implements IDoubleLinkList{
    // 头结点
    private Node2 head;

    // 构造初始化一个空的（只含头结点）双向链表
    public DoubleLinkedList() {
        // 双向链表的头尾都指向自己
        this.head = new Node2();
        head.prev = head;
        head.next = head;
    }

    /**
     * 清空
     * @description 清空实际上就是让头结点的prev和tail都指向自己
     */
    @Override
    public void clear() {
        head.prev = head;
        head.next = head;
    }

    /**
     * 判空
     *  @description 头结点的next域不指向自己
     */
    @Override
    public boolean isEmpty() {
        if (head.next != head){
            return false;
        }
        return true;
    }

    /**
     * 插入结点
     * @param o 插入的数据
     */
    @Override
    public void insert(int index, Object o) {
        int i = 0;
        if (index <= i){
            System.out.println("超出范围");
        }
        // 让一个新指针指向头结点（在第index个位置插入的话，需要找到index-1的位置）
        Node2 p = head;
        while (i != index-1 && p != null){
            i++;
            p = p.next;
        }
        // 找到插入的前一个位置。创建结点
        Node2 node = new Node2(o);
        // prev域指向p,next域指向p.next
        node.prev = p;
        node.next = p.next;
        p.next = node;
        p.next.prev = node;
    }

    /**
     * 头插
     * @param o 数据域的值
     */
    @Override
    public void addHead(Object o) {
        Node2 node = new Node2(o);
        // 新结点的next域指向头结点的next域
        node.next = head.next;
        // 头结点的next域的prev指向node
        head.next.prev = node;
        // 头结点的next域指向新结点
        head.next = node;
        // 新节点的prev域指向头结点
        node.prev = head.prev.next;
    }

    /**
     * 尾插（第一个结点是尾插）
     * @param o 数据域的值
     */
    @Override
    public void addTail(Object o) {
        Node2 node = new Node2(o);
        // 新建指针指向头指针的prev域
        node.prev = head.prev;
        // 新建结点的next域指向head
        node.next = head.prev.next;
        // 尾指针的next域指向node
        node.prev.next = node;
        // 头结点的prev域指向node
        head.prev = node;
    }

    /**
     * 头删
     */
    @Override
    public void removeHead() {
        // 删除结点的下一个结点的指针域指向头结点
        head.next.next.prev = head;
        // 头指针的next域指向下一个结点
        head.next = head.next.next;
    }

    /**
     * 尾删
     */
    @Override
    public void removeTail() {
        // 找到尾结点之前的结点
        Node2 goal = head.prev.prev;
        goal.next = head;
        head.prev = goal;
    }

    /**
     * 根据下标删除结点
     * @param index 索引下标
     */
    @Override
    public void remove(int index) {
        int i = 0;
        Node2 p = head;
        if (index <= 0){
            System.out.println("超出范围");
        }
        // 找前一个位置
        while (i != index-1 && p != null){
            i++;
            p = p.next;
        }
        p.next.next.prev = p;
        p.next = p.next.next;
    }

    /**
     * 获取第index个位置的值
     * @param index 索引下标
     */
    @Override
    public Object get(int index) {
        int i = 0;
        Node2 p = head;

        // 检查index是否超限
        try {
            if (i > index || index == 0){
                throw new IndexOutOfBoundsException();
            }else if (p == null){
                throw new NullPointerException();
            }
            // 存在
            while (index > i && p != null){
                p = p.next;
                i++;
            }
            // 找完一遍都不存在
            if (p.data == null){
                throw new IndexOutOfBoundsException();
            }
        } catch (NullPointerException ne){
            ne.printStackTrace();
            System.out.println("空链表");
        } catch (IndexOutOfBoundsException ie){
            ie.printStackTrace();
            System.out.println("索引超出范围或者不存在");
        }
        return p.data;
    }

    /**
     * 打印链表
     */
    @Override
    public void display() {
        // 用一个指针指向头结点
        Node2 p = head.next;
        while (p != head){
            System.out.print(p.data + " ");
            p=p.next;
        }
        System.out.println("\n");
    }

    @Override
    public int length() {
        int len = 0;
        Node2 p = head;
        if (p.next == head){
            return 0;
        }
        while (p.next != head){
            len++;
            p=p.next;
        }
        return len;
    }
}
