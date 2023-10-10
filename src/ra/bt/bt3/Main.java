package ra.bt.bt3;

import ra.bt.bt2.Student;

import java.util.Arrays;

public class Main {
     static String[] strings = {"banana", "apple", "orange", "grape", "pear"};

    public static void main(String[] args) {
        bubbleSort();
        selectionSort();
        insertSort();
        System.out.println(Arrays.toString(strings));
    }
    public static void bubbleSort() {
        for (int i = 1; i < strings.length; i++) {
            for (int j = 0; j < strings.length - i; j++) {
                if (strings[j].compareToIgnoreCase(strings[j+1]) > 0) {
                    swap(strings,j,j+1);
                }
            }
        }
    }

    public static void selectionSort() {
        for (int i = 0; i < strings.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[minIndex].compareToIgnoreCase(strings[j]) > 0) {
                    minIndex = j;
                }
            }
            swap(strings, minIndex, i);

        }
    }


    public static void insertSort() {
        for (int i = 1; i < strings.length; i++) {
            for (int j = i; j > 0 && strings[j].compareToIgnoreCase(strings[j-1])> 0 ; j--) {
                swap(strings,j,j-1);
            }
        }
    }


    public static void swap(String[] strings, int a, int b) {
        String temp = strings[a];
        strings[a] = strings[b];
        strings[b] = temp;
    }
}
