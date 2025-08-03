package com.gqt.pattern;
import java.util.Scanner;
public class pattern16 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of units");
int n=sc.nextInt();
int count=1;
for(int i=1; i<=n; i++) {
for(int j=1; j<=i; j++) {
System.out.print(j+" ");
}
System.out.println();
}

}
}