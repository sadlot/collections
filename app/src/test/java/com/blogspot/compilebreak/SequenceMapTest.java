package com.blogspot.compilebreak;

import java.util.LinkedHashMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class SequenceMapTest {

    @Test
    void shouldGetFirstLastMap() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);

        assertEquals(1, map.firstEntry().getValue());
        assertEquals(3, map.lastEntry().getValue());
    }

    @Test
    void shouldPullFirstLastMap() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);

        assertEquals(1, map.pollFirstEntry().getValue());
        assertEquals(3, map.pollLastEntry().getValue());
        assertEquals("{2=2}", map.toString());
    }

    @Test
    void shouldReverseLinkedHashMap() {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);

        assertEquals("{3=3, 2=2, 1=1}", map.reversed().toString());
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
    void shouldThrowExceptionWhenTryToAddFIrstElementToTreeMap() {

        TreeMap<String, Integer> set = new TreeMap<String, Integer>();
        assertThrows(UnsupportedOperationException.class, () -> set.putFirst("1", 1));
    }

    @Test
    void shouldGetKeysAndReverseOrder() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);

        assertEquals("[3, 2, 1]", map.sequencedKeySet().reversed().toString());
    }
}
