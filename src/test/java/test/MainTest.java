package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void shouldAddNumbers() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void shouldConcatenateStrings() {
        assertEquals("abc", "a" + "b" + "c");
    }
}
