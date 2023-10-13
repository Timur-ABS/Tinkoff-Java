package edu.hw1;

import org.jetbrains.annotations.NotNull;

public final class Task3 {
    private Task3() {

    }

    public static boolean isNestable(int @NotNull [] arr1, int[] arr2) {
        if (arr1.length == 0) {
            return true;
        }
        if (arr2.length == 0) {
            return false;
        }
        int[] arr1MinAndMax = findMinAndMax(arr1);
        int[] arr2MinAndMax = findMinAndMax(arr2);
        return arr1MinAndMax[0] > arr2MinAndMax[0] && arr1MinAndMax[1] < arr2MinAndMax[1];
    }

    private static int[] findMinAndMax(int @NotNull [] arr) {
        int[] result = {arr[0], arr[0]};
        for (int j : arr) {
            if (j > result[1]) {
                result[1] = j;
            }
            if (j < result[0]) {
                result[0] = j;
            }
        }
        return result;
    }
}
