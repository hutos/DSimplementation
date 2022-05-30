package com.pekopeko.LinkList.singlelinkedlist;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/279:20
 * @Description <p>结点类型</p>
 */
public class Node {
    // 数据域
    public Object data;

    // 指针域
    public Node next;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "" + data + " ";
    }
}
