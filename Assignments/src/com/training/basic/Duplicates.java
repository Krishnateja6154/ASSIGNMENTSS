package com.training.basic;

public class Duplicates {

	public static void main(String[] args) {
		int[] arr= {10,20,30,20,30,10};
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
