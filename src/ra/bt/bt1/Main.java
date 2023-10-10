package ra.bt.bt1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();
        long start = System.currentTimeMillis();
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] > arr[j-1] ; j--) {
                swap(arr,j,j-1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);

        }
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int i, int i1) {
        arr[i] += arr[i1];
        arr[i1] = arr[i] - arr[i1];
        arr[i] -= arr[i1];
    }

    private static int[] getArr() {
        int arr[] = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }
}
