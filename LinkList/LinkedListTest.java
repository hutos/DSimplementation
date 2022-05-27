package com.pekopeko.LinkList;

/**
 * @author lustras
 * @version 1.0
 * @File com.
 * @CreateDate 2022/5/2711:40
 * @Description <p></p>
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("尾插法:");
        list.addTail(0);
        list.addTail(1);
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);
        list.display();

        System.out.println("判空：");
        if(list.isEmpty())
            System.out.println("\t链表为空。\n");
        else
            System.out.println("\t链表不为空。\n");

        System.out.println("输出长度：");
        System.out.println("\nlength: " + list.length());
    }
}
