package com.blogspot.compilebreak;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class SequenceSetTest {

    @Test
    void shouldGetFirstSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);

        assertEquals(1, set.getFirst());
        assertEquals(3, set.getLast());
    }

    @Test
    void shouldReverseLinkedHashSet() {

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);

        assertEquals("[3, 2, 1]", set.reversed().toString());
    }

    @Test
    void shouldReverseSortedSet() {

        SortedSet<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);

        assertEquals("[3, 2, 1]", set.reversed().toString());
    }

    @Test
    void shouldThrowExceptionWhenTryToAddFIrstElementToSortedSet() {

        SortedSet<Integer> set = new TreeSet<Integer>();
        assertThrows(UnsupportedOperationException.class, () -> set.addFirst(1));
    }

}
