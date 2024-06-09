package ru.vsu.cs.course1;

public class Task {
    public static LinkedList elMaS(int[] arr) {
        LinkedList list = new LinkedList();
        list.addAllArr(arr);
        return list;
    }


    public static LinkedList result(LinkedList list) {
        LinkedList result = new LinkedList();
        LinkedList negativ = new LinkedList();
        LinkedList zero = new LinkedList();
        LinkedList positiv = new LinkedList();

        ListNode current = list.head;
        while (current != null) {
            if (current.value < 0) {
                negativ.add(current.value);
            }
            if (current.value == 0) {
                zero.add(current.value);
            }
            if (current.value > 0) {
                positiv.add(current.value);
            }
            current = current.next;

        }
        result.addToEnd(negativ);
        result.addToEnd(zero);
        result.addToEnd(positiv);
        return result;

    }




    public static int[] toMas1(LinkedList list) {
        return LinkedList.toAr(list);

    }

}



