package com.nirakar.string.operation;

import java.util.StringTokenizer;

public class StringOperation {

	public static void main(String[] args) {
		replaceSpecialCharacterToEmpty("www.space%20.com");

	}

	/**
	 * Replace %20 with ' '. E.g. input: www.space%20.com output: www.space .com
	 */
	private static void replaceSpecialCharacterToEmpty(String str) {
		StringTokenizer strToken = new StringTokenizer(str, ".");
		StringBuffer sbr = new StringBuffer();
		while (strToken.hasMoreTokens()) {
			String strTk = strToken.nextToken();
			if (strTk.contentEquals("%20"))
				sbr.append(strTk.replaceAll("%20", ""));
			else
				sbr.append(strTk);
		}
		System.out.println(sbr.toString());
	}

}
