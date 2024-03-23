import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;
public class BSTMapTest {

    @Test
    public void testPutAndGet() {
        BSTMap<Integer, String> bstMap = new BSTMap<>();
        bstMap.put(5, "five");
        bstMap.put(3, "three");
        bstMap.put(8, "eight");

        assertEquals("five", bstMap.get(5));
        assertEquals("three", bstMap.get(3));
        assertEquals("eight", bstMap.get(8));

        // Test overwriting existing key-value pair
        bstMap.put(5, "updatedFive");
        assertEquals("updatedFive", bstMap.get(5));
    }

    @Test
    public void testContainsKey() {
        BSTMap<Integer, String> bstMap = new BSTMap<>();
        bstMap.put(5, "five");
        bstMap.put(3, "three");
        bstMap.put(8, "eight");

        assertTrue(bstMap.containsKey(5));
        assertFalse(bstMap.containsKey(2));
    }

    @Test
    public void testSize() {
        BSTMap<Integer, String> bstMap = new BSTMap<>();
        bstMap.put(5, "five");
        bstMap.put(3, "three");
        bstMap.put(8, "eight");

        assertEquals(3, bstMap.size());

        // Test size after overwriting existing key-value pair
        bstMap.put(5, "updatedFive");
        assertEquals(3, bstMap.size());

        // Test size after adding a new key-value pair
        bstMap.put(2, "two");
        assertEquals(4, bstMap.size());
    }

    @Test
    public void testKeySet() {
        BSTMap<Integer, String> bstMap = new BSTMap<>();
        bstMap.put(5, "five");
        bstMap.put(3, "three");
        bstMap.put(8, "eight");

        assertEquals(Set.of(3, 5, 8), bstMap.keySet());

        // Test keySet after overwriting existing key-value pair
        bstMap.put(5, "updatedFive");
        assertEquals(Set.of(3, 5, 8), bstMap.keySet());

        // Test keySet after adding a new key-value pair
        bstMap.put(2, "two");
        assertEquals(Set.of(2, 3, 5, 8), bstMap.keySet());
    }

    // Add more tests for edge cases and corner cases as needed
}
