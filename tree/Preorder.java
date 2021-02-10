package com.tree;

import java.util.Stack;

public class Preorder {

	Node root;

	Preorder() {
		root = null;
	}

	void printPreorder(Node node) {

		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}

	void printPreorderRecursive() {
		printPreorder(root);
	}

	void preorder() {

		if (root == null)
			return;

		Node curr = root;
		Stack<Node> s = new Stack<Node>();
		s.push(curr);

		while (s.size() > 0) {

			curr = s.pop();
			System.out.print(curr.data + " ");

			if (curr.right != null) {
				s.push(curr.right);
			}
			if (curr.left != null) {
				s.push(curr.left);
			}
		}

	}

	public static void main(String[] args) {

		Preorder tree = new Preorder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("\nPreorder traversal of binary tree is ");
		tree.printPreorderRecursive();
		System.out.println();
		tree.preorder();
	}
}
