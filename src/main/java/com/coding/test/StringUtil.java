package com.coding.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtil {

    /**
     * Returns the string stripping all the duplicate characters from the input string,
     * in the same order as the input. This implementation is case-sensitive
     *
     * <br>
     * Example:
     * <br>
     * AA -> A
     * <br>
     * AABBC -> ABC
     * <br>
     * Aa -> Aa
     *
     * @param input the string to remove duplicates
     * @return a string with no duplicates in the same order as input
     */
    static String removeAllDuplicates(String input) {
        if (input == null) throw new RuntimeException("Input can't be null");
        StringBuilder builder = new StringBuilder();
        Set<Character> usedCharacterCodes = new HashSet<>();
        for (char character : input.toCharArray()) {
            if (usedCharacterCodes.contains(character)) continue;
            builder.append(character);
            usedCharacterCodes.add(character);
        }
        return builder.toString();
    }

    static String removeAllDuplicates2(String input) {
        if (input == null) throw new RuntimeException("Input can't be null");
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char character : input.toCharArray()) {
            uniqueChars.add(character);
        }
        StringBuilder result = new StringBuilder();
        for (char character : uniqueChars) {
            result.append(character);
        }
        return result.toString();
    }

    static String removeAllDuplicates3(String input) {
        if (input == null) throw new RuntimeException("Input can't be null");
        StringBuilder builder = new StringBuilder();
        for (char character : input.toCharArray()) {
            if (builder.indexOf(String.valueOf(character)) == -1) {
                builder.append(character);
            }
        }
        return builder.toString();
    }

    static String removeAllDuplicates4(String input) {
        if (input == null) throw new RuntimeException("Input can't be null");
        StringBuilder builder = new StringBuilder();
        // Assuming ASCII characters. But can be changed to support UTF-8 at a memory cost
        boolean[] seen = new boolean[128];
        for (char character : input.toCharArray()) {
            if (!seen[character]) {
                builder.append(character);
                seen[character] = true;
            }
        }
        return builder.toString();
    }

}