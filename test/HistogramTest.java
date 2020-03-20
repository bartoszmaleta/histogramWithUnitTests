import com.company.Histogram;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HistogramTest {

    @org.junit.jupiter.api.Test
    void getHistogram() {
        Histogram result = new Histogram();

        assertNotNull(result.getHistogram());
    }

    @org.junit.jupiter.api.Test
    void testCreateHistogramNotEquals() {
        // retrieve object from create Histogram
        Histogram result = new Histogram();
        result.createHistogram("Ala ma kota");

        // build own expected result
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 4);
        expected.put('l', 1);

        assertNotEquals(result.getHistogram(), expected);

    }

    @org.junit.jupiter.api.Test
    void testCreateHistogramEquals() {
        // retrieve object from create Histogram
        Histogram result = new Histogram();
        result.createHistogram("Ala ma kota");

        // build own expected result
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 4);
        expected.put('l', 1);
        expected.put('t', 1);
        expected.put('m', 1);
        expected.put('o', 1);
        expected.put('k', 1);
        // does not require order!

        assertEquals(result.getHistogram(), expected);
    }

    @org.junit.jupiter.api.Test
    void testCreateHistogramContain() {
        // retrieve object from create Histogram
        Histogram result = new Histogram();
        result.createHistogram("codeschool");

        assertTrue(result.getHistogram().containsKey('d'));
    }

    @org.junit.jupiter.api.Test
    void testCreateHistogramNotContain() {
        // retrieve object from create Histogram
        Histogram result = new Histogram();
        result.createHistogram("codeschool");

        assertFalse(result.getHistogram().containsKey('x'));
    }

    @Test
    void testToString() {
        Histogram result = new Histogram();
        result.createHistogram("aabbcc");

        String expected = "a : 2\nb : 2\nc : 2\n";
        assertEquals(result.toString(), expected);

    }
}