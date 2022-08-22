package com.pekopeko.HashTable;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/8/2214:08
 * @Description <p>哈希表类</p>
 */
public class HashTable {
    private StudentLinkedList[] studentLinkedList;
    private int size;

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
        studentLinkedList = new StudentLinkedList[size];
        for (int i = 0; i < size; i++) {
            studentLinkedList[i] = new StudentLinkedList();
        }
    }

    public void add(StudentNode node) {
        int index = hash(node.stuNo);
        studentLinkedList[index].add(node);
    }

    private int hash(int no) {
        return no % size;
    }
}
