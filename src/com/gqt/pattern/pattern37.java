/**
 * 
 */
package com.gqt.pattern;

import java.util.Scanner;

/**
 * # # # # # #
 * # - - - - #
 * # - - - - #
 * # - - - - #
 * # # # # # #
 *@author sahana
 *@category pattern
 *@description the java pattern 
 */
public class pattern37 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in)	;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
		
		if(i==0|| i==n||j==0||j==n) {
	System.out.print("# ");
	}
	else {
		System.out.print("- ");
	}
	}
}
	


