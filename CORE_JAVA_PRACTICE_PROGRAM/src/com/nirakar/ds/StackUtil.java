package com.nirakar.ds;

/**
 * This is a class which one takes any type of Variable . Implementation of
 * Object class , All data types are sub class of Object Class
 * 
 * @author NIRAKAR
 * 
 */
public class StackUtil {
	int stackSize = 0;
	Object[] obj = null;
	int stackCount = -1;

	public StackUtil(int size) {
		stackSize = size;
		obj = new Object[size];
		// stackCount=+stackCount;
	}

	public void push(Object o) {
		obj[++stackCount] = o;
	}

	public Object pop() {
		Object returnedObject = obj[stackCount];
		obj[stackCount] = null;
		stackCount--;
		return returnedObject;
	}

	public static void main(String[] args) {

		StackUtil s = new StackUtil(3);
		s.push("Nirakar");
		s.push("Bapi");
		s.push("Linga");

		/*
		 * System.out.println(s.peek()); System.out.println(s.peek());
		 * System.out.println(s.peek());
		 */
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}
}
