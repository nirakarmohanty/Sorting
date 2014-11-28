package com.nirakar.ds.arithmatic.parsing;

public class InfixApp {

	public static void main(String[] args) {
		String input,output;
		input="(a-b)+(c))/d-e";//"A*(B+C)-D/(E+F)";//"2+3*4";
		InToPost intoPost = new InToPost(input);
		output=intoPost.doTrans();
		System.out.print(output);

	}

}
