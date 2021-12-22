package Groﬂ¸bung2;

import java.util.ArrayDeque;

public class BinTree {

	private Node root;

	public BinTree() { }

	public BinTree(String content) {
		this.root = new Node(content);
	}

	public BinTree(BinTree left, String content, BinTree right) {
		root = new Node(content);
		if (left != null) {
			root.setLeft(left.root);
		}
		if (right != null) {
			root.setRight(right.root);
		}
	}

	private BinTree(Node root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public String getValue() {
		if (isEmpty()) {
			return null; // error
		}
		return root.getContent();
	}

	public BinTree getLeft() {
		if (isEmpty()) {
			return null; // error
		}
		return new BinTree(root.getLeft());
	}

	public void setLeft(BinTree tree) {
		if (isEmpty()) {
			return; // error
		}
		root.setLeft(tree.root);
	}

	public BinTree getRight() {
		if (this.isEmpty()) {
			return null; // error
		}
		return new BinTree(root.getRight());
	}

	public void setRight(BinTree tree) {
		if (this.isEmpty()) {
			return; // error
		}
		this.root.setRight(tree.root);
	}

	public void inorder() {
		if (!isEmpty()) {
			getLeft().inorder();
			System.out.print(getValue());
			getRight().inorder();
		}
	}

	public void preorder() {
		if (!isEmpty()) {
			System.out.print(getValue());
			getLeft().preorder();
			getRight().preorder();
		}
	}

	public void postorder() {
		if (!isEmpty()) {
			getLeft().postorder();
			getRight().postorder();
			System.out.print(getValue());
		}
	}

	public void postorder(ArrayDeque<String> stack) {
		if (!isEmpty()) {
			getLeft().postorder(stack);
			getRight().postorder(stack);
			stack.push(getValue());
		}
	}
	
	public String calc() {
		//TODO implement this
		/*
		 * Hinweis: Pr√ºfen Sie zun√§chst, ob der Wert des aktuellen Knotens einem Operator entspricht.
		 */
		return null;
	}

}
