package Großübung2;

import java.util.ArrayDeque;

public class Calculator {

	public static void main(String[] args) {
		BinTree tree = new BinTree(new BinTree(new BinTree(new BinTree("3"), "+", new BinTree("4")), "*", new BinTree("12")), "/", new BinTree(new BinTree("8"), "-", new BinTree("5")));
		ArrayDeque<String> stack = new ArrayDeque<>();
		tree.postorder(stack);
		System.out.println(calc(stack)); // 28
		System.out.println(tree.calc()); // 28
	}
	
	public static String calc(ArrayDeque<String> stack) {
		String top = stack.pop();
		if (top.equals("+")) {
			String y = calc(stack);
			String x = calc(stack);
			return Integer.toString(Integer.parseInt(x) + Integer.parseInt(y));
		} else if (top.equals("-")) {
			String y = calc(stack);
			String x = calc(stack);
			return Integer.toString(Integer.parseInt(x) - Integer.parseInt(y));
		} else if (top.equals("*")) {
			String y = calc(stack);
			String x = calc(stack);
			return Integer.toString(Integer.parseInt(x) * Integer.parseInt(y));
		} else if (top.equals("/")) {
			String y = calc(stack);
			String x = calc(stack);
			return Integer.toString(Integer.parseInt(x) / Integer.parseInt(y));
		} else if (top.equals("%")) {
			String y = calc(stack);
			String x = calc(stack);
			return Integer.toString(Integer.parseInt(x) % Integer.parseInt(y));
		} else {
			return top;
		}
	}

}
