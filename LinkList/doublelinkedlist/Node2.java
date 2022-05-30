package com.pekopeko.LinkList.doublelinkedlist;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3014:33
 * @Description <p>双向循环链表结点</p>
 */
public class Node2 {
    // 数据域
    public Object data;
    // 指针域
    public Node2 prev;
    public Node2 next;

    public Node2() {
    }

    public Node2(Object data) {
        this.data = data;
    }

    public Node2(Object data, Node2 prev, Node2 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    @Override
    public String toString() {
        return  "" + data + " ";
    }
}
