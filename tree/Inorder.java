package com.tree;

import java.util.Stack;

public class Inorder {

	Node root;

	Inorder() {
		root = null;
	}

	void printInorder(Node node) {

		if (node == null) {
			return;
		}

		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}

	void printInorderRecursive() {
		printInorder(root);
	}

	void inorder() {
		
		if (root == null)
			return;

		Node curr = root;
		Stack<Node> s = new Stack<Node>();
		while (curr != null || s.size() > 0) {
			
			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.data + " ");
			curr = curr.right;
		}

	}

	public static void main(String[] args) {

		Inorder tree = new Inorder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorderRecursive();
		System.out.println();
		tree.inorder();
	}
}
