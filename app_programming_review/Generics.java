package kr.ac.sejong.Java1;

import java.util.Stack;

public class App {
	public static void main(String[] args) {
		//Generics
		Stack<Circle> stack = new Stack<Circle>();
		stack.push(new Circle(3,4,5));
		stack.push(new Circle(4,5,6));
		System.out.println(stack.pop().getArea());
	}
}
