package com.nirakar.ds;

public class InsertionSort {

	
	public static void main(String[] args) {
		int[] intArray = initializeArray(100000);//new int[]{4,8,7,2,1,5,6,9};
		System.out.println("Input Array");
		printArray(intArray);
		System.out.println("\n");
		insertionSort(intArray);
		System.out.println("Output Array");
		printArray(intArray);
	}

	private static void printArray(int[] intArray) {
		for(int i=0;i<intArray.length-1;i++){
			System.out.print(intArray[i]+" , ");
		}
			
		
	}

	private static void insertionSort(int[] intArray) {
		
		for(int i=1;i<intArray.length-1;i++){ 
			for(int j=i;j>0;j--){
				if(intArray[j]<intArray[j-1]){
					int temp = intArray[j];
					intArray[j] = intArray[j-1];
					intArray[j-1] = temp;
				}
				}//end of inner loop
			}//end of outer loop 
		}
	private static int[] initializeArray(int size){
		int[] inputArray = new int[size];
		for(int i=0;i<size-1;i++){
			Double d = Math.random()*size;
			inputArray[i] = d.intValue();
		}
		return inputArray;
	}
}
