package com.gqt.pattern;
import java.util.Scanner;
public class Array1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
			System.out.print("enter the student count:");
			int n=sc.nextInt();
			int arr[]=new int[n];
			//collecting and the string marks of n students
			for(int i=0;i<arr.length;i++)
			{
				System.out.print("enter the marks of student no:"+(i+1));
				arr[i]=sc.nextInt();
			}
			System.out.print("-------------");
			//display marks stored inside the array 
			for(int i=0;i<arr.length;i++)
{
	System.out.print("the marks of student no:"+(i+1) +" is="+arr[i]);
}
}
}
	
