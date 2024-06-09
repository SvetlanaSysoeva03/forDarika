package ru.vsu.cs.course1;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedList {
    ListNode head;

    public LinkedList() {
        this.head = null;
    }



    public void add(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public LinkedList addAllArr(int[] values) {
        for (int value : values) {
            add(value);
        }
        return this;
    }

    public void addToEnd(LinkedList list2) {
        if(this.head == null) { // Если первый список пуст, возвращаем второй
            this.head = list2.head;
        } else { // Если первый список не пуст, проходим по нему до последнего узла
            ListNode temp = this.head;
            while(temp.next != null) {
                temp = temp.next;
            }
            // Добавляем голову второго списка в качестве следующего узла
            temp.next = list2.head;
        }
    }
    public static int[] toAr(LinkedList list) {
        ListNode current = list.head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        int[] array = new int[size];
        current = list.head;
        int index = 0;
        while (current != null) {
            array[index] = current.value;
            index++;
            current = current.next;
        }

        return array;
    }
}
