package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.MyQueue;

/**
 * Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
 */
public class MyQueueTest {
    
    static MyQueue myQueue;

    @BeforeAll
    final static void setUp() {
        myQueue = new MyQueue();
    }

    private void testMyQueuePushOperations() {
        myQueue.push(1);
        myQueue.push(2);
    }

    private void testMyQueueOnlyContainsTwo() {
        final int expectedQueuePeekValue = 2;
        assertEquals(expectedQueuePeekValue, myQueue.peek());
    }

    @Test
    final void testMyQueuePeekOperation() {
        testMyQueuePushOperations();
        final int expectedQueuePeekValue = 1;
        assertEquals(expectedQueuePeekValue, myQueue.peek());
    }

    @Test
    final void testMyQueueReturnsTopElementOne() {
        testMyQueuePushOperations();
        final int expectedQueuePeekValue = 1;
        assertEquals(expectedQueuePeekValue, myQueue.pop());
        testMyQueueOnlyContainsTwo();
    }

    @Test
    final void testMyQueueNotEmptyReturnsFalse() {
        myQueue.push(1);
        myQueue.push(2);
        assertFalse(myQueue.empty());
    }

    @Test
    final void testMyQueueEmptyReturnsTrue() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        assertTrue(myQueue.empty());
    }

    @AfterAll
    final static void tearDown() {
        myQueue = null;
    }
}
