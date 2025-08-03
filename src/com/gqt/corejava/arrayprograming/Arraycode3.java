package com.gqt.corejava.arrayprograming;
import java.util.Scanner;
class movieoperation{
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
Scanner scanner = new Scanner(System.in);
void creatArray() {
	System.out.print("enter language count :");
	int lan=scanner.nextInt();
	System.out.print("enter category count in each language :");
	int cat=scanner.nextInt();
	System.out.print("enter movie count in each category :");
	int mov=scanner.nextInt();
	arr=new long[lan][cat][mov];
	System.out.println("Array is created");
	System.out.println("--------");
	System.out.println("enter the profit made in the financial year 2034-2024:");
	prev_profit=scanner.nextLong();
	System.out.println("----------");
}
 void collectRevenueData() {
for (int i = 0; i<arr.length; i++) {
	            System.out.println("indise language no :" + (i + 1));
	            for (int j = 0;j<arr.length; j++) {
	                System.out.println("inside category no:"+(j+1));
	                for (int k=0;k<arr[i][j].length;k++) {
	                	System.out.println("enter the revenue of movie no:"+(k+1));
	                	arr[i][j][k]=scanner.nextLong();
	                	sum_revenue+=arr[i][j][k];}
	            }
}
	        System.out.println("data collected and calculated");
	        System.out.println("--------");
 }
  void displayData() {
	  for (int i = 0; i<arr.length; i++) {
          System.out.println("indise language no :" + (i + 1));
          for (int j = 0;j<arr[i].length; j++) {
              System.out.println("inside category no:"+(j+1));
              for (int k=0;k<arr[i][j].length;k++) {
              	System.out.println(" the revenue of movie no:"+(k+1)+"is="+arr[i][j][k]);
              }
          }
	  }
	  System.out.println("------------------");
      System.out.println("over a revenue:"+sum_revenue);
      System.out.println("------------------");
      if(sum_revenue>investment) {
      long profit=(sum_revenue-investment);
      System.out.println("the profit made by hemanth is ="+profit);
      if(profit>prev_profit) {
    	  System.out.println("hemanth has made more profit than previous year");
      }
      else {
    	  System.out.println("hemanth has not made profit than previous  year");
      }
      }
  else {
	  System.out.println("the loss in cured by hemanth is "+(investment-sum_revenue));
  }
}
}
public class Arraycode3 {

	    public static void main(String[] args) {
	       movieoperation mo=new movieoperation();
	       mo.creatArray();
	       mo.collectRevenueData();
	       mo.displayData();
	    }
	}

