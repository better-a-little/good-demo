package com.zc.array;

public class ArrayBeforeK {
	
	private static void getArrayBeforeK(int[] arr, int k, String location){
		
		for(int a : arr){
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("----------------------");
		
		int min = 0, max = 0;
		
		System.out.println("arr.length:" + arr.length);
		
		if(location.equals("min")){
			for(int i=0; i<arr.length; i++){
				if(arr[i] == k){
					min = i;
					break;
				}
			}
			for(int i=0; i<=min; i++){
				System.out.print(arr[i] + " ");
			}
		}
		
		if(location.equals("max")){
			for(int i=0; i<arr.length; i++){
				if(arr[i] == k){
					max = arr[i];
				}
			}
			
			System.out.println("max:" + max);
			
			for(int i=0; i<=max; i++){
				System.out.print(arr[i] + " ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{1,3,5,3};
//		getArrayBeforeK(arr, 3, "min");
		getArrayBeforeK(arr, 3, "max");
	}

}
