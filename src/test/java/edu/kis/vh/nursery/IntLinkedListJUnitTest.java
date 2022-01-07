package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListJUnitTest {

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        int expectedValue = 5;

        list.push(expectedValue);
        Assert.assertFalse(list.isEmpty());
        int result = list.top();
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        int expectedValue = 5;
        int value = 10;

        list.push(value);
        list.push(expectedValue);
        Assert.assertFalse(list.isEmpty());
        int result = list.top();
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        int value = 5;
        int expectedValue = 10;

        list.push(expectedValue);
        list.push(value);
        Assert.assertFalse(list.isEmpty());
        list.pop();
        int result = list.pop();
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(expectedValue, result);
    }
}
