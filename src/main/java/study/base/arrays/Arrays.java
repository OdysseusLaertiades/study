package study.base.arrays;

import static java.lang.String.format;

/**
 * Implement sort algorithms and binary search that return idx of element or -1 if element is not found
 */

public class Arrays {

    public static void quickSort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        quickSortMethod(arr, low, high);
    }

    private static void quickSortMethod(int[] arr, int low, int high) {
        int average = (high + low) / 2;
        int mainNumb = arr[average];
        int minIdx = low;
        int maxIdx = high;

        while (minIdx <= maxIdx) {
            while (mainNumb > arr[minIdx]) {
                minIdx++;
            }
            while (mainNumb < arr[maxIdx]) {
                maxIdx--;
            }
            if (minIdx <= maxIdx) {
                int tmp = arr[minIdx];
                arr[minIdx] = arr[maxIdx];
                arr[maxIdx] = tmp;

                minIdx++;
                maxIdx--;
            }
        }
        if (high > minIdx) {
            quickSortMethod(arr, minIdx, high);
        }
        if (low < maxIdx) {
            quickSortMethod(arr, low, maxIdx);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;

            for (; j >= 0; j--) {
                if (value < arr[j]) {
                    arr[j + 1] = arr[j];
                } else break;
            }
            arr[j + 1] = value;
        }
    }

    public static void mergeSort(int[] arr) {sortedMerge(arr, 0, arr.length - 1);}

    private static void sortedMerge(int[] arr, int low, int high) {
        if (high <= low)
            return;
        int average = (low + high) / 2;

        sortedMerge(arr, low, average);
        sortedMerge(arr, average + 1, high);

        int[] arrNew = java.util.Arrays.copyOf(arr, arr.length);
        int firstIdx = low;
        int secondIdx = average + 1;

        for (int i = low; i <= high; i++) {
            if (firstIdx > average) {
                arr[i] = arrNew[secondIdx++];
            } else if (secondIdx > high) {
                arr[i] = arrNew[firstIdx++];
            } else if (arrNew[secondIdx] < arrNew[firstIdx]) {
                arr[i] = arrNew[secondIdx++];
            } else {
                arr[i] = arrNew[firstIdx++];
            }
        }
    }

    public static int binarySearch(int[] sortedArray, int findMe) {
        int high = sortedArray.length;
        if (!checkSorting(sortedArray) && high > 0) {
            return binarySearchMethod(sortedArray, 0, high, findMe);
        } else return -1;
    }

    private static boolean checkSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int binarySearchMethod(int[] arr, int low, int high, int find) {
        int average = (low + high) / 2;
        while (low <= high) {
            if (arr[average] < find) {
                low = average + 1;
            } else if (arr[average] == find) {
                return average;
            } else {
                high = average - 1;
            }
            average = (low + high) / 2;
        }
        if (low > high) {
            System.out.println(format("Number %d is not found", find));
        }
        return -1;
    }
}
