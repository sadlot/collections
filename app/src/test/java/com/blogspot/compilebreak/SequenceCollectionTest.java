package com.blogspot.compilebreak;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class SequenceCollectionTest {

    @Test
    void shouldGetFirstLast() {
        List<Integer> test = List.of(1, 2, 3, 4, 5);

        assertEquals(1, test.getFirst());
        assertEquals(5, test.getLast());
    }

    @Test
    void shouldRemoveFirst() {
        List<Integer> test = new ArrayList(List.of(1, 2, 3, 4, 5));
        test.removeFirst();

        assertEquals("[2, 3, 4, 5]", test.toString());
    }

    @Test
    void shouldRemoveLast() {
        List<Integer> test = new ArrayList(List.of(1, 2, 3, 4, 5));
        test.removeLast();

        assertEquals("[1, 2, 3, 4]", test.toString());
    }

    @Test
    void shouldReturnExceptionWhenSequencedListEmpty() {
        List<Integer> test = List.of();

        assertThrows(NoSuchElementException.class, () -> test.getFirst());
    }

    @Test
    void shouldReverseList() {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        assertEquals("[6, 5, 4, 3, 2, 1]", list.reversed().toString());
    }
}
