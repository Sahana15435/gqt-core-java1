package com.gqt.pattern;

import java.util.Scanner;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the count: ");
		int n=sc.nextInt();
		int num=n;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print("* ");
			}
			n--;
			System.out.println();
		}
		sc.close();
	}

}
