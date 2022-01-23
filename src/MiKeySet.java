import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.AbstractMap.SimpleEntry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MiKeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        Set<String> actualKeys = map.keySet();
        assertEquals(2, actualKeys.size());
        assertTrue(actualKeys.contains("one"));
        assertTrue(actualKeys.contains("two"));
        assertFalse(actualKeys.contains(1));
        assertFalse(actualKeys.contains(2));
        System.out.println(actualKeys.toString());

        Set<Map.Entry<String, Integer>> actualMap = map.entrySet();
        assertEquals(2, actualMap.size());
        assertTrue(actualMap.contains(new SimpleEntry<>("one", 1)));
        assertTrue(actualMap.contains(new SimpleEntry<>("two", 2)));
        System.out.println(actualMap.toString());

        Collection<Integer> actualValues = map.values();
        assertEquals(2, actualValues.size());
        assertTrue(actualValues.contains(1));
        assertTrue(actualValues.contains(2));
        assertFalse(actualValues.contains("one"));
        assertFalse(actualValues.contains("two"));
        System.out.println(actualValues.toString());
    }
}
