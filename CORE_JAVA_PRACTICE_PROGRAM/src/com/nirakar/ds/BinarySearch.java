package com.nirakar.ds;

/** This class is Used to find the Number 
 * Its called as Binary search . 
 * @author NIRAKAR
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[100];
		generateNumber1To100(array);
		
		int searchKey = 24;
		int result = findNumber(array, searchKey);
		System.out.println(result);
	}

	private static void generateNumber1To100(int[] array) {

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			array[i] = i + 1;
		}
	}

	private static int findNumber(int[] array, int searchKey) {

		int lowerBound = 1;
		int higherBound = array.length;
		int countTheLooping = 0;
		while (true) {
			++countTheLooping;
			System.out.println("Lower Bound --" + lowerBound
					+ " : Higher Bound --" + higherBound
					+ " : And Count in Looping" + countTheLooping);
			int occurance = (lowerBound + higherBound) / 2;

			if (array[occurance] == searchKey)
				return array[occurance];

			else {
				if (searchKey < array[occurance])

					higherBound = occurance - 1;
				else
					lowerBound = occurance + 1;
			}
		}
	}

}
