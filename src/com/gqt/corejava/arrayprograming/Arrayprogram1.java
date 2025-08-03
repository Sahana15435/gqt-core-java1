package com.gqt.corejava.arrayprograming;

public class Arrayprogram1 {

}

class ArraySum
{
	public static int find_sum(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {100,20,80,50,80,150};
int ans=find_sum(arr);
System.out.println(ans);
	}
}
