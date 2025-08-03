package com.gqt.pattern;

import java.util.Scanner;

public class pattern26 {
 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the rows: ");
	        int n = scanner.nextInt();
	        int space=n-1;
            int k=0;
	        for (int i = 1; i <=n; i++) 
	        {
	        for (int j = 1; j <=space; j++) 
	                System.out.print(" ");
	            for (int j=1;j<=i;j++) {
	            	System.out.print(j+" ");
	            	k=j;
	            }
	            for (int j = 1; j <=i-1; j++) 
	                System.out.print((k+j)+" ");
	            space--;
	            k=0;
	            System.out.println();
	        }

	        scanner.close();
	    }
	}