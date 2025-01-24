package com.coding.test;

import org.junit.jupiter.api.Test;

import static com.coding.test.StringUtil.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilTests {

    @Test
    void shouldRemoveDuplicates() {
        assertDuplicatesMatch("AABBCCD112233", "ABCD123", "Should remove duplicate characters");
        assertDuplicatesMatch("ABCDDCBA", "ABCD", "Should remove non-consecutive duplicate characters");
        assertDuplicatesMatch("AaBbCcD112233", "AaBbCcD123", "Should keep different casing characters");
        assertDuplicatesMatch("ABC123", "ABC123", "Should return the same string when all characters are unique");
        assertDuplicatesMatch("", "", "Should return an empty string for an empty input");
        assertDuplicatesMatch("A", "A", "Should return the same single character for input with one character");
        assertDuplicatesMatch("!!@@##$$%%^^", "!@#$%^", "Should work with special characters");
        assertDuplicatesMatch("1122334455", "12345", "Should work with numeric characters");
    }

    @Test
    void shouldFailWhileRemovingDuplicates() {
        RuntimeException e = assertThrows(RuntimeException.class, () -> {
            assertDuplicatesMatch(null, "?", "Should fail when null input");
        });
        assertEquals("Input can't be null", e.getMessage());
    }

    private void assertDuplicatesMatch(String input, String expected, String message) {
        assertEquals(expected, removeAllDuplicates(input), message);
        assertEquals(expected, removeAllDuplicates2(input), message);
        assertEquals(expected, removeAllDuplicates3(input), message);
        assertEquals(expected, removeAllDuplicates4(input), message);
    }

}
