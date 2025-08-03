package com.gqt.corejava.arrayprograming;
import java.util.Arrays;

public class Arrayprogram3 {


    static class ArrayRemoveDuplicates {
        public static int[] remove_duplicates(int[] arr) {
            Arrays.sort(arr);
            int writeIndex = 1;

            for (int readIndex = 1; readIndex < arr.length; readIndex++) {
                if (arr[readIndex] != arr[readIndex - 1]) {
                    arr[writeIndex] = arr[readIndex];
                    writeIndex++;
                }
            }

            return Arrays.copyOfRange(arr, 0, writeIndex);
        }

        public static void print_array(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {100, 20, 80, 50, 80, 150, 20, 100};

        System.out.println("Original array: ");
        ArrayRemoveDuplicates.print_array(arr);

        int[] uniqueArr = ArrayRemoveDuplicates.remove_duplicates(arr);

        System.out.println("Array after removing duplicates: ");
        ArrayRemoveDuplicates.print_array(uniqueArr);
    }
}