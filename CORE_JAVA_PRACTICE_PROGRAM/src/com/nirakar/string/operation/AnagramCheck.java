/**
 * This class is a good example of finding out the Anagram words 
 * in a paragraph.
 * INPUT - "plates stop staple pots meat not pot team eitx is anagram to xite stop";
 * OUTPUT - {opst=[pots, stop], aemt=[team, meat], aelpst=[staple, plates], eitx=[xite, eitx]}
 */
package com.nirakar.string.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author NIRAKAR
 * 
 */
public class AnagramCheck {

	/**
	 * @param args
	 */
	public static Map<String, List<String>> map = new HashMap<String, List<String>>();

	public static void main(String[] args) {
		String str = "plates stop staple pots meat not pot team eitx is anagram to xite stop";
		List<String> list = prepareListOfWords(str);
		findOutAnagram(list);
		System.out.println("\n");
		System.out.println(map);

	}

	private static void findOutAnagram(List<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			// Find the Character Array
			char[] charArrayI = list.get(i).toCharArray();
			// Sort the character Array
			Arrays.sort(charArrayI);

			// Iterate the Array
			for (int j = 0; j < list.size() - 1; j++) {
				boolean isAnagram = false;
				// don't compare the Word with itself
				if (i != j) {
					// Find the Character Array
					char[] charArrayJ = list.get(j).toCharArray();
					// Sort the Array
					Arrays.sort(charArrayJ);
					if (charArrayI.length == charArrayJ.length) {
						isAnagram = compareArrayOfCharacters(charArrayI,
								charArrayJ);

						if (isAnagram) {
							// Prepare the Ket which is used to in Map
							String str =String.valueOf(charArrayI, 0, charArrayI.length);
							//String str = prepareKeyForHashMap(charArrayI);
							if (map.containsKey(str)) {
								List<String> lt = map.get(str);
								lt.add(list.get(j));
								map.put(str, lt);

							}// end of If block
							else {
								List<String> lt = new ArrayList<String>();
								lt.add(list.get(j));
								map.put(str, lt);
							}
						}// End of IsAnagram If block
					}
				}// End of i!=j If block
			}// End of Inner For Loop
		}// End of Outer For Loop

	}// End of Method

	/*private static String prepareKeyForHashMap(char[] charArrayI) {
		String str = "";
		for (int i = 0; i < charArrayI.length; i++) {
			str += charArrayI[i];
		}
		//System.out.println(str);
		return str;
	}*/

	private static boolean compareArrayOfCharacters(char[] charArrayI,
			char[] charArrayJ) {
		boolean isAnagram = false;
		for (int i = 0; i < charArrayI.length - 1 && i < charArrayJ.length - 1; i++) {
			if (charArrayI[i] == charArrayJ[i]) {
				isAnagram = true;
			}
		}

		return isAnagram;
	}

	private static List<String> prepareListOfWords(String str) {
		List<String> list = new ArrayList<String>();
		StringTokenizer strToken = new StringTokenizer(str);
		while (strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.print(token + " ");
			list.add(token);
		}
		return list;
	}

}
