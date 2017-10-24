package deqo.cmor.mysimplestack;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class MySimpleStackTest {

    @Test
    public void testPeekAndEmpty() throws Exception {
        MySimpleStack stack = new MySimpleStack();
        assertEquals("La stack doit être vide\n", true, stack.isEmpty());
        stack.push(new Item(4));
        Item item = stack.peek();
        assertEquals("L'item doit être 4\n", 4, item.getValue());
        assertEquals("La stack doit être non vide\n", false, stack.isEmpty());
    }

    @Test
    public void testPopAndGetSize() throws Exception {
        MySimpleStack stack = new MySimpleStack();
        stack.push(new Item(7));
        assertEquals("La taille doit être 1\n", 1, stack.getSize());
        Item item = stack.pop();
        assertEquals("L'item doit être 7\n", 7, item.getValue());
        assertEquals("La taille doit être 0\n", 0, stack.getSize());
    }

    @Test(expected=EmptyStackException.class)
    public void popShouldThrowException() {
        MySimpleStack stack = new MySimpleStack();
        stack.pop();
    }

    @Test(expected=EmptyStackException.class)
    public void peekShouldThrowException() {
        MySimpleStack stack = new MySimpleStack();
        stack.peek();
    }

}