package com.pekopeko.LinkList.doublelinkedlist;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3015:36
 * @Description <p>双向链表测试类</p>
 */
public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        System.out.println("尾插法插入数据：");
        doubleLinkedList.addTail(1);
        doubleLinkedList.addTail(2);
        doubleLinkedList.addTail(3);
        doubleLinkedList.addTail(4);
        doubleLinkedList.addTail(5);
        doubleLinkedList.display();

        System.out.println("头插法插入数据：");
        doubleLinkedList.addHead(9);
        doubleLinkedList.addHead(11);
        doubleLinkedList.display();
        System.out.println("len为:" + doubleLinkedList.length());
        System.out.println(doubleLinkedList.get(3));
        System.out.println();
        System.out.println("往第二个位置插入数据后：");
        doubleLinkedList.insert(2,20);
        doubleLinkedList.display();

        System.out.println("头删法删除结点");
        doubleLinkedList.removeHead();
        doubleLinkedList.display();

        System.out.println("尾删法删除结点");
        doubleLinkedList.removeTail();
        doubleLinkedList.display();

        System.out.println("删除第2个位置的结点");
        doubleLinkedList.remove(2);
        doubleLinkedList.display();

        System.out.println("========我是分割线========");
        System.out.println(doubleLinkedList.isEmpty());
        doubleLinkedList.clear();
        System.out.println(doubleLinkedList.isEmpty());
    }
}
