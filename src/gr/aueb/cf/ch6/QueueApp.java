package gr.aueb.cf.ch6;

import java.util.Arrays;

public class QueueApp {

    static int[] queue = new int[50];
    static int top = -1;

    public static void main(String[] args) {

    }

    public static void enQueue(int val) {
        if(!isFull()) {
            queue[++top] = val;
        }else {
            System.out.println("Stack Queue is Full");
        }
    }

    public static int deQueue(){
        int num = 0;

        if (!isEmpty()) {
            num = queue[0];
            queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
            top--;
            return num;
        }else {
            throw new RuntimeException("Queue is Empty");
        }
    }

    public static boolean isFull() {
        return (top == queue.length - 1);
    }

    public static boolean isEmpty() {
        return (top == -1);
    }
}
