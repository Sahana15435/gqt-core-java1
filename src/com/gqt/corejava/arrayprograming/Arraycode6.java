package com.gqt.corejava.arrayprograming;
import java.util.Scanner;
class Arrayoperation3{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
void createArray() {
	System.out.println("enter school count:");
	int scl=sc.nextInt();
	arr=new String[scl][][];
	for (int i=0;i<arr.length;i++) {
	System.out.println("enter the number of classes inside the school no"+(i+1));	
	arr[i]=new String[sc.nextInt()][];
	for(int j=0;j<arr[i].length;j++) {
		System.out.println("enter the number of student inside class no."+(j+1));
		
		arr[i][j]=new String[sc.nextInt()];
	}
	}
	System.out.println("Array created");
	System.out.println("-----------");
}
void collectdata() {
	for(int i=0;i<arr.length;i++) {
		System.out.println("inside School no."+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside class no."+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("the name of the student no."+(k+1));
			}
		}
	}
	System.out.println("Data collected");
	System.out.println("---------");}

void displayData() {
for(int i=0;i<arr.length;i++) {
	System.out.println("Inside school no:"+(i+1));
	for (int j=0;j<arr[i].length;j++) {
		System.out.println("inside class no:"+(j+1));
		for (int k=0;k<arr[i][j].length;k++) {
			System.out.println(" the name of the student no:"+(i+1)+"of school"+(j+1)+"is"+arr[i][j][k]);
		}
	}
	}

System.out.println("---------");
}
}
public class Arraycode6{
	public static void main(String[]args) {
		Arrayoperations2 ao=new Arrayoperations2();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}
}



	




		
	
	
	

	