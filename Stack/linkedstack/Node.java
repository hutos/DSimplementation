package com.pekopeko.Stack.linkedstack;

/**
 * @author lustras
 * @version 1.0
 * @File com.
 * @CreateDate 2022/5/3110:17
 * @Description <p></p>
 */
public class Node {
    public Object data;
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
        return data + " ";
    }
}
