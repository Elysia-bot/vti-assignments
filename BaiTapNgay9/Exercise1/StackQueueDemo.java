package BaiTapNgay9.Exercise1;

import java.util.*;

public class StackQueueDemo {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Nguyễn Văn Nam",
                "Nguyễn Văn Huyên",
                "Trần Văn Nam",
                "Nguyễn Văn A"
        );

        printByStack(names);
        printByQueue(names);
    }

    static void printByStack(List<String> list) {
        Stack<String> stack = new Stack<>();
        stack.addAll(list);
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }

    static void printByQueue(List<String> list) {
        Queue<String> queue = new LinkedList<>(list);
        while (!queue.isEmpty())
            System.out.println(queue.poll());
    }
}

