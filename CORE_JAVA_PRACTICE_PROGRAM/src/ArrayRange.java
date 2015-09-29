import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given a sorted array with some sequenced numbers and some non-sequenced
 * numbers. Write an algorithm that takes this array as an input and returns a
 * list of {start, end} of all consecutive numbers. Consecutive numbers have
 * difference of 1 only.
 * E.g. of array:[4, 5, 6, 7, 8, 9, 12, 15, 16, 17, 18, 20,22, 23, 24, 27]
 * 
 * @author nmohanty
 * 
 */
public class ArrayRange {

	public List<HashMap<Integer,Integer>> getArrayRange(int[] intArray) {
		/*int[] intArray = new int[] { 4, 5, 6, 7, 8, 9, 12, 15, 16, 17, 18, 20,22, 23, 24, 27 };*/
		int size = intArray.length;
			
		List<HashMap<Integer,Integer>> list = new  ArrayList<HashMap<Integer,Integer>>();
		for (int index = 0; index < size - 1; index++) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int index2 = index + 1;
			if (intArray[index2] - intArray[index] == 1) {
				map.put(intArray[index], intArray[index2]);
				list.add(map);
			}
			
		}
		System.out.println(list);
		return list;
	}
	

	public static void main (String args[]){
		int[] intArray = new int[] { 4, 5, 6, 7, 8, 9, 12, 15, 16, 17, 18, 20,22, 23, 24, 27 };
		ArrayRange arrayRange = new ArrayRange();
		arrayRange.getArrayRange(intArray);
		
	}
}