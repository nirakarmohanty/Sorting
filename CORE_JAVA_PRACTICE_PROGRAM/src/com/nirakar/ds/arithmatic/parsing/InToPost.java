package com.nirakar.ds.arithmatic.parsing;

public class InToPost {
	private StackParser stack;
	private String in;
	private String outPut="";

	public InToPost(String input) {
		in = input;
		int size = input.length();
		stack = new StackParser(size);
	}

	public String doTrans() {

		for (int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);
			switch (ch) {
			case '+':
			case '-':
				gotOperator(ch, 1);
				break;
			case '*':
			case '/':
				gotOperator(ch, 2);
				break;
			case '(':
				stack.push(ch);
				break;
			case ')':
				gotParenthesis(ch);
				break;
			default:
				outPut = outPut + ch;
			}
		}
		while (!stack.isEmpty()) {
			outPut = outPut + stack.pop();
		}
		return outPut;
	}

	private void gotParenthesis(char ch) {

		while (!stack.isEmpty()) {
			char chx = stack.pop();
			if (chx == '(')
				break;
			else {
				outPut = outPut + chx;
			}// end of Else
		} // End of While loop

	}

	private void gotOperator(char ch, int i) {
		while (!stack.isEmpty()) {
			char opTop = stack.pop();
			if (opTop == '(') {
				stack.push(opTop);
				break;
			} else {
				int prec2;
				if (opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				if (prec2 < i){
					stack.push(opTop);
					break;
				}
				else
					outPut = outPut + opTop;
			}
		}// End of While
		stack.push(ch);
	}

}
