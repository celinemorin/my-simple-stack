package deqo.cmor.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void setValue() throws Exception {
        Item item = new Item(10);
        item.setValue(5);
        assertEquals("Item doit valoir 5\n", 5, item.getValue());
    }

    @Test
    public void getValue() throws Exception {
        Item item = new Item(10);
        assertEquals("Item doit valoir 10\n", 10, item.getValue());
    }

}