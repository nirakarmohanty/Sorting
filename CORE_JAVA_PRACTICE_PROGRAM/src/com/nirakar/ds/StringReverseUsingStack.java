package com.nirakar.ds;

public class StringReverseUsingStack extends Stack{
	

	public StringReverseUsingStack(int size) {
		super(size);
		
	}

	public static void main(String[] args) {
		StringReverseUsingStack strRev= new StringReverseUsingStack(5);
		strRev.push(1);
		strRev.push(2);
		strRev.push(3);
		strRev.push(4);
		strRev.push(5);
		String str="";
		for(int i=0;i<5;i++){
			int stackVar = strRev.pop();
			str = str+stackVar;
		}
		System.out.println(str);
	}

}
