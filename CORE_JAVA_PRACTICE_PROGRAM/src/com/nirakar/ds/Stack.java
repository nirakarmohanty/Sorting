package com.nirakar.ds;

/**
 * This is a class of Stack implementation of Integer Array . 1. Push method
 * enters to the Stack Array. 2. Pop method is used to retrieve the top
 * elements. 3. Peek method is used to retrieve always top most element.
 * 
 * @author NIRAKAR
 * 
 */
public class Stack {

	int[] stackArray;
	int count = -1;
	int sizeOfArray = 0;

	/**
	 * Constructor used to initialize the array size
	 * 
	 * @param size
	 */
	public Stack(int size) {
		stackArray = new int[size];
		sizeOfArray = size;
	}

	/**
	 * Returned the size of the array
	 * 
	 * @return
	 */
	public int size() {
		return stackArray.length;
	}

	/**
	 * Check the array is empty or not
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (sizeOfArray > count - 1)
			return true;
		else
			return false;
	}

	/**
	 * Push the entry to the array
	 * 
	 * @param i
	 */
	public void push(int i) {
		stackArray[++count] = i;
	}

	/**
	 * Retrieve the array element and delete that
	 * 
	 * @return
	 */
	public int pop() {
		int i = 0;
		i = stackArray[count];
		stackArray[count] = 0;
		count--;
		return i;
	}

	/**
	 * Look up the top element
	 * 
	 * @return
	 */
	public int peek() {
		int i = 0;
		i = stackArray[i];
		return i;

	}

	public static void main(String[] args) {

		Stack s = new Stack(3);
		s.push(1);
		s.push(2);
		s.push(3);
		// System.out.println(s.count+" "+s.sizeOfArray + s.isEmpty());
		if (s.isEmpty()) {
			s.push(4);
		}
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek());

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		// System.out.println(s.pop());
	}

}
