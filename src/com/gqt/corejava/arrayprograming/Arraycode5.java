package com.gqt.corejava.arrayprograming;
import java.util.Scanner;
class Arrayoperations2{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
void createArray() {
	System.out.println("enter school count:");
	int scl=sc.nextInt();
	System.out.println("enter class count in each school:");
	int cls=sc.nextInt();
	System.out.println("enter student count in each school:");
	int stu=sc.nextInt();
	
	
	arr=new String[scl][cls][stu];
	System.out.println("Arrray is created");
	System.out.println("-----------");
}
	
void collectData() {
	for (int i=0;i<arr.length;i++) {
		System.out.println("Inside school no:"+(i+1));
		for (int j=0;j<arr[i].length;j++) {
			System.out.println(" the name of the class no:"+(j+1));
			for (int k=0;k<arr[j].length;k++) {
	System.out.println(" the name of the student no:"+(k+1)+"is="+arr[i][j][k]);
				
			arr[i][j][k]=sc.next();
		}
		}
	System.out.println("Data collected");
	System.out.println("---------");}
}
void displayData() {
for(int i=0;i<arr.length;i++) {
	System.out.println("Inside class no:"+(i+1));
	for (int j=0;j<arr[i].length;j++) {
		System.out.println(" the name of the class no:"+(j+1));
		for (int k=0;k<arr[j].length;k++) {
			System.out.println(" the name of the student no:"+(k+1));
		
	}
}
System.out.println("---------");
}
}
public class Arraycode5{
	public static void main(String[]args) {
		System.out.println("hey there");
		Arrayoperations2 ao=new Arrayoperations2();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}
}
}


	




		
	
	
	

	