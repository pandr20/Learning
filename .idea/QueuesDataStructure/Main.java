package QueuesDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    // First in first out

    // Queue = FIFO data structure.
    //         A collection designed for holding elements prior to processing
    //         Linear data structure

    //         add = enqueue, offer()
     //         remove = dequeue, poll()


    // Where are queues useful?

    // 1. Keyboard buffer (letters should appear on the screen in hte order they're pressed)
    // 2. Printer queue (printer jobs should be completed in order )
    // 3. Used in linkedlist, priorityqueues, breadth-first search


    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);
    }





    }



