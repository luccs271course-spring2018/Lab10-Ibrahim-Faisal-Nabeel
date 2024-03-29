package edu.luc.cs271.linkedstack;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedStack {

    private IStack<String> fixture;

    @Before
    public void setUp() {
        fixture = new LinkedStack<>();
    }

    @After
    public void tearDown() {
        fixture = null;
    }

    @Test
    public void testInitial() {
        assertTrue(fixture.isEmpty());
        try {
            fixture.pop();
            fail("java.util.NoSuchElementException expected");
        } catch (final NoSuchElementException ex) {
            // exception occurred => all good
        }
    }

    @Test
    public void testAfterPush() {
        final String value = "hello";
        fixture.push(value);
        assertFalse(fixture.isEmpty());
        assertEquals(value, fixture.peek());
    }

    @Test
    public void testPushThenPop() {
        final String value = "hello";
        fixture.push(value);
        final String result = fixture.pop();
        assertEquals(value, result);
        assertTrue(fixture.isEmpty());
    }

    @Test
    public void testPush2ThenPop2() {
        final String value1 = "hello";
        final String value2 = "world";
        fixture.push(value1);
        fixture.push(value2);
        final String result2 = fixture.pop();
        final String result1 = fixture.pop();
        assertEquals(value1, result1);
        assertEquals(value2, result2);
        assertTrue(fixture.isEmpty());
    }

    @Test
    public void testAsListEmpty() {
        assertEquals(0, fixture.asList().size());
    }

    @Test
    public void testAsListNonempty() {
        final String value1 = "hello";
        final String value2 = "world";
        fixture.push(value1);
        fixture.push(value2);
        final List<String> list = fixture.asList();
        assertEquals(2, list.size());
        assertEquals(Arrays.asList(value2, value1), list);
        final List<String> list2 = fixture.asList();
        assertEquals(2, list2.size());
    }
    @Test
    public void testAsFifoListEmpty() {
        assertEquals(0, fixture.asFifoList().size());
    }

    @Test
    public void testAsFifoListNonempty() {
        final String value1 = "hello";
        final String value2 = "world";
        fixture.push(value1);
        fixture.push(value2);
        final List<String> list = fixture.asFifoList();
        assertEquals(2, list.size());
        assertEquals(Arrays.asList(value1, value2), list);
        final List<String> list2 = fixture.asFifoList();
        assertEquals(2, list2.size());
    }
}