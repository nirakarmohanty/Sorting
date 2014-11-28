package com.nirakar.ds.arithmatic.parsing;

public class StackParser {
	
	public char[] theStack;
	int maxSize;
	int position;
	public StackParser(int size) {
        maxSize=size;
		theStack = new char[size];
		position=-1;
	}
	
	public void push(char c){
		theStack[++position]=c;
		--maxSize;
	}
	public char pop(){
		char c =theStack[position--];
		maxSize++;
		return c;
	}
	public char peek(){
		return theStack[position];
	}
	public boolean isEmpty(){
		return (position==-1);
	}
	public static void main(String args[]){
		StackParser s = new StackParser(3);
		s.push('a');
		s.push('b');
		s.push('c');
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		//System.out.println(s.peek());
	}
}
