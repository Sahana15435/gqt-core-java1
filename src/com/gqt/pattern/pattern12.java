package com.gqt.pattern;
import java.util.Scanner;
public class pattern12 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of units");
	int n=sc.nextInt();
	int count=25;
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
		System.out.print(count-- +" ");
	}
		System.out.println();
}

}
}