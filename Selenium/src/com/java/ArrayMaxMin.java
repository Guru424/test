package com.java;

public class ArrayMaxMin {
public static void main(String[] args) {
	
	int arr[]={12,34,11,200,54,17,1};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++){
		if(arr[i]> max){
			max=arr[i];			
		}	
		
		if(arr[i]< min){
			min=arr[i];
		}
	}
	System.out.println(max);
	System.out.println(min);
}
}
