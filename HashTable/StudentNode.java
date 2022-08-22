package com.pekopeko.HashTable;

import lombok.Data;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/8/2213:59
 * @Description <p>链表结点</p>
 */
@Data
public class StudentNode {
    public int stuNo;
    public String stuName;
    public StudentNode next;

    public StudentNode(int stuNo, String stuName) {
        this.stuNo = stuNo;
        this.stuName = stuName;
    }

    public StudentNode() {
    }

    public String toString(){
        return "此学生的学号为[" + stuNo +"],名字是" + stuName;
    }
}
