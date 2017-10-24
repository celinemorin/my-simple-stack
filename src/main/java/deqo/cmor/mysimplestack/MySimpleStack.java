package deqo.cmor.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack implements SimpleStack {

    public ArrayList <Item> stack = new ArrayList<Item>();
    private int size = 0;

    public boolean isEmpty() {
        return (size == 0);
    }

    public int getSize() {
        return (size);
    }

    public void push(Item item) {
        stack.add(item);
        size++;
    }

    public Item peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        return (stack.get(size - 1));
    }

    public Item pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        Item item = stack.remove(size - 1);
        size--;
        return (item);
    }

}
