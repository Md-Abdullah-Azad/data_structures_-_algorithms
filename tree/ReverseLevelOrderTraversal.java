package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {

	Node root;

	private void printReverseLevelOrder() {

		Stack<Node> S = new Stack<Node>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while (!queue.isEmpty()) {

			Node tempNode = queue.peek();
			queue.remove();
			S.push(tempNode);

			/* Enqueue left child */
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			/* Enqueue right child */
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}

		while (S.empty() == false) {
			Node tempNode = S.peek();
			System.out.print(tempNode.data + " ");
			S.pop();
		}
	}

	// Driver Code
	public static void main(String args[]) {
		// Create the following Binary Tree
		// 1
		// / \
		// 2 3
		// / \
		// 4 5
		ReverseLevelOrderTraversal tree_level = new ReverseLevelOrderTraversal();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Reverse Level order traversal of binary tree is - ");
		tree_level.printReverseLevelOrder();
	}

}
