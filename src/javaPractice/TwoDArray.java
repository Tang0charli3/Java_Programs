package javaPractice;

import java.util.Scanner;

public class TwoDArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array Size");
	int row=sc.nextInt();
	int col=sc.nextInt();
	//System.out.println("Enter the Array Size");
	int arr[][]=new int[row][col];
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.println(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
