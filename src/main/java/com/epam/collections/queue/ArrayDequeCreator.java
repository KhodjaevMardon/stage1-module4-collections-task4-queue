package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> resultDequeue = new ArrayDeque<>();
        if (firstQueue.isEmpty()) {
            throw new IllegalArgumentException("first queue is empty");
        }
        if (secondQueue.isEmpty()) {
            throw new IllegalArgumentException("second queue is empty");
        }

        // driver code jala
        resultDequeue.addLast(firstQueue.poll());
        resultDequeue.addLast(firstQueue.poll());
        resultDequeue.addLast(secondQueue.poll());
        resultDequeue.addLast(secondQueue.poll());

        while (!(firstQueue.isEmpty() && secondQueue.isEmpty())) {
            if (!firstQueue.isEmpty()) {
                firstQueue.add(resultDequeue.pollFirst());
                resultDequeue.addLast(firstQueue.poll());
                resultDequeue.addLast(firstQueue.poll());
            }
            if (!secondQueue.isEmpty()) {
                firstQueue.add(resultDequeue.pollFirst());
                resultDequeue.addLast(secondQueue.poll());
                resultDequeue.addLast(secondQueue.poll());
            }
        }

        return resultDequeue;
    }
}
