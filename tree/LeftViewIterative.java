package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewIterative {
	Node root;

	private void printLeftView() {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {

			int count = queue.size();
			for (int i = 0; i < count; i++) {
				Node tempNode = queue.poll();
				if (i == 0) {
					System.out.print(tempNode.data + " ");
				}
				/* Enqueue left child */
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}
				/* Enqueue right child */
				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
			}
		}

	}

	// Driver Code
	public static void main(String args[]) {
		// Create the following Binary Tree
		//       1
		//      / \
		//     2   3
		//    / \
		//   4   5
		LeftViewIterative tree_level = new LeftViewIterative();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Left View of binary tree is - ");
		tree_level.printLeftView();
	}
}
