package com.gqt.corejava.arrayprograming;



public class Arrayprogram2 {
 static class ArrayCopy {
        public static void copy_array(int[] src, int[] dest) {
            if (src.length != dest.length) {
                System.out.println("Source and destination arrays must be of the same length.");
                return;
            }

            for (int i = 0; i < src.length; i++) {
                dest[i] = src[i];
            }

            System.out.println("Elements copied successfully.");
        }

        public static void print_array(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] src = {100, 20, 80, 50, 80, 150};
        int[] dest = new int[src.length];

        System.out.println("Source array: ");
        ArrayCopy.print_array(src);

        ArrayCopy.copy_array(src, dest);

        System.out.println("Destination array after copying: ");
        ArrayCopy.print_array(dest);
    }
}