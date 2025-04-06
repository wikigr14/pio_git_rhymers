package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

    @Test
    public void testPushAndTop() {
        IntLinkedList list = new IntLinkedList();
        final int testValue = 42;
        list.push(testValue);

        int result = list.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        boolean result = list.isEmpty();
        Assert.assertTrue(result);

        list.push(1);
        result = list.isEmpty();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        boolean result = list.isFull();
        Assert.assertFalse(result);

        list.push(1);
        result = list.isFull();
        Assert.assertFalse(result);
    }

    @Test
    public void testTopWhenEmpty() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_VALUE = -1;

        int result = list.top();
        Assert.assertEquals(EMPTY_VALUE, result);
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_VALUE = -1;

        int result = list.pop();
        Assert.assertEquals(EMPTY_VALUE, result);

        int testValue = 99;
        list.push(testValue);

        result = list.pop();
        Assert.assertEquals(testValue, result);

        result = list.pop();
        Assert.assertEquals(EMPTY_VALUE, result);
    }

    @Test
    public void testPushMultipleAndPopOrder() {
        IntLinkedList list = new IntLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);

        Assert.assertEquals(3, list.pop());
        Assert.assertEquals(2, list.pop());
        Assert.assertEquals(1, list.pop());
        Assert.assertEquals(-1, list.pop());
    }
}
