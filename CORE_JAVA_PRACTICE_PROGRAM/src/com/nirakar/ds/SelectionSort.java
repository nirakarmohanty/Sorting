package com.nirakar.ds;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = new int[] { 77, 99, 44, 55,22};//, 22, 28, 11, 0, 66, 33 };
		print(array);
		System.out.println("\n");
		selectionSort(array);
		print(array);
	}

	private static void selectionSort(int[] array) {
		int out=0;
		for(int i=0;i<array.length-1;i++){
			int temp =array[i];
			for(int j=i+1;j<array.length-1;j++){

				if(temp>array[j]){
					temp=array[j];
				    out =j;
			
				//System.out.println(temp +" : "+j);
			
				int tempVar = array[i];
				array[i] = temp;
				array[out] = tempVar;
				}
			}
			System.out.println("==========" + i +"==============");
			System.out.println("\n");
			print(array);
			System.out.println("\n");
		}
		
	}

	private static void print(int[] array) {
		for (int i = 0; i < array.length - 1; i++)
			System.out.print(array[i]+"\t");

	}

	

}
