package com.coding.test;

import java.util.HashSet;
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

}