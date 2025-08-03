package com.gqt.pattern;
import java.util.Scanner;

class ArrayOperations{
	int arr[];
	Scanner sc=new Scanner(System.in);
	void creatArray() {
	System.out.print("enter the student count:");
	int n=sc.nextInt();
	int arr[]=new int[n];
System.out.print("Array created");
System.out.print("---------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter marks of studen no:"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.print("Data stored in to the Array");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.print("the marks of student no:"+(i+1)+"is="+arr[i]);
		}
	}
}
public class Array2{
 public static void main(String args[]) {
	 ArrayOperations ao =new ArrayOperations();
		ao.creatArray();
		ao.collectData();
		ao.displayData();
		
	}
}
