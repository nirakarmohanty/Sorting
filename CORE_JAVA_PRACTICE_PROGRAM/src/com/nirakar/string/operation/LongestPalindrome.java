package com.nirakar.string.operation;

public class LongestPalindrome {

	public static boolean isPallindrome(String str){
		return false;
	}
	public static String pallindrome(String str){
		char[] character = str.toCharArray();
		int length = character.length;
		String pallindromeString = null;
		for(int i=0;i<length-1;i++){
			int sliding=0;
			for(int j=1;j<length-1;j++){
				//findStringForPallindromCheck(i,j,str);
				pallindromeString= str.substring(i, sliding++);
				i=j;
				sliding=j;
				boolean isPallindrome=isPallindrome(pallindromeString);
				if(isPallindrome)
					break;
				
			}
		}
				
		return pallindromeString;
	}
	private static void findStringForPallindromCheck(int i, int j, String str) {
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(pallindrome("abcded"));
	}

}
