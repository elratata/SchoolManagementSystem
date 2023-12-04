package org.tony.dto;

public class Utils {
    /**
     * Gets the length of an array of any non-primitive type upto null
     *
     * @param array array to check length
     * @param <T>   Type of the array (not primitive)
     * @return length of the array upto the first null value
     */
    public static <T> int getLength(T[] array) {
        int count = 0;
        for (T item : array) {
            if (item == null) {
                break;
            }
            count++;
        }
        return count;
    }

}
