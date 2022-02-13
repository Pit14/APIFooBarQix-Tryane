package com.thomas.edgar.foobarqix;

import java.util.HashMap;

/**
 * Final class containing the methods to compute the FooBarQix
 */
public final class FooBarQix {

    /**
     * Here you initialize the HashMap.
     * You can put as many pairs as you want, and you can change the values of the numbers and the messages to be printed
     *
     * @return the HashMap of pairs
     */
    public static HashMap<Integer, String> initializePairs() {
        HashMap<Integer, String> pairs = new HashMap<>();
        pairs.put(3, "Foo");
        pairs.put(5, "Bar");
        pairs.put(7, "Qix");
        return pairs;
    }

    /**
     * If the number is divisible by any number in the pairs hashmap, write the corresponding hashmap string instead of the number
     * For each digit that are in the hashmap, add the corresponding string in the digits order.
     * Each 0 is replaced by char “*“.
     *
     * @param s The input string that should be numerical
     * @return The string result
     */
    public static String compute(String s) {

        if (!isNumeric(s)) return "Error, the input isn't a number or is too big.";

        long input = Long.parseLong(s); // We convert the input string into an int
        HashMap<Integer, String> pairs = initializePairs();
        StringBuilder result = new StringBuilder();

        // Checking the divisibility

        for (var pair : pairs.entrySet()) { // We loop on the HashMap contents
            if (isDivisibleBy(input, pair.getKey())) { // We check if the input is divisible by any of the "key" in the hashmap
                result.append(pair.getValue()); // If it is, we add the word to the string
            }
        }

        // Checking if specifics numbers are contained in the input

        String result2 = String.valueOf(input);

        for (var pair : pairs.entrySet()) { // We loop on the HashMap
            result2 = result2.replace(String.valueOf(pair.getKey()), pair.getValue());
        }

        result2 = result2.replaceAll("[1-9]+", "").replace('0', '*'); // For the step 2, to count the zeros

        result.append(result2);

        // Special cases

        if (result.length() == 0) { // If nothing has been added to the result, we just display the original number
            result = new StringBuilder(s);
        } else if (result.toString().matches("[*]+")) { // If the result contains only *, we should leave the other numbers
            return s.replace('0', '*');
        }

        return result.toString();
    }

    /**
     * Check if an input is divisible by a divider
     *
     * @param input
     * @param divider
     * @return True is divisible, false otherwise
     */
    public static boolean isDivisibleBy(long input, int divider) {
        if (divider == 0) {
            return false;
        }
        return input % divider == 0;
    }

    /**
     * Check if a String is a number
     *
     * @param s The String to check
     * @return True if it is, false if it isn't or is out of Long range
     */
    public static boolean isNumeric(String s) {
        if (s == null) {
            return false;
        }
        try {
            Long.parseLong(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
