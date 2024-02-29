package utils;

import business.Song;

public class ArrayUtils {
    /**
     * Get a slice of an array with offset
     *
     * @param array  Array to get the slice from
     * @param offset The start of the slice
     *               If the offset is outside the array, an empty array is returned.
     * @param length The length of the slice
     *               If the length is larger than the array, it is capped.
     * @return The array slice
     */
    public static Song[] copy(Song[] array, int offset, int length) {
        if (array == null) {
            return null;
        }
        if (offset > array.length) {
            return new Song[0];
        }
        if (offset + length > array.length) {
            length = array.length - offset;
        }

        Song[] result = new Song[length];
        for (int i = 0; i < length; i++) {
            result[i] = array[i + offset];
        }

        return result;
    }
}
