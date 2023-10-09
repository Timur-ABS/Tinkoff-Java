package edu.hw1;

public final class Task3 {
    public static boolean isNestable(int[] arr1, int[] arr2) {
        if(arr1.length == 0){
            return true;
        }
        if (arr2.length == 0) {
            return false;
        }
        int[] arr1MinAndMax = findMinAndMax(arr1), arr2MinAndMax = findMinAndMax(arr2);
        if (arr1MinAndMax[0] > arr2MinAndMax[0] && arr1MinAndMax[1] < arr2MinAndMax[1]) {
            return true;
        }
        return false;
    }

    public static int[] findMinAndMax(int[] arr) {
        int[] result = {arr[0], arr[0]};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result[1]) {
                result[1] = arr[i];
            }
            if (arr[i] < result[0]) {
                result[0] = arr[i];
            }
        }
        return result;
    }
}
