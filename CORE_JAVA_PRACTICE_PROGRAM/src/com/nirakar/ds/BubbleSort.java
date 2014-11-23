package com.nirakar.ds;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[] { 77, 99, 44, 55, 22, 28, 11, 0, 66, 33 };
		print(array);
		System.out.println("\n");
		bubbleSort(array);
		print(array);
	}

	private static void print(int[] array) {
		for (int i = 0; i < array.length - 1; i++)
			System.out.print(array[i]+"\t");

	}

	private static void bubbleSort(int[] array) {

		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1; j++) {
				if (i != j && array[i] < array[j])
				// swap(array[i], array[j]);
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
