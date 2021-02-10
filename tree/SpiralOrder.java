package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralOrder {

	Node root;

	private void printSpiralOrder() {
		
		Stack<Node> S1 = new Stack<Node>();
		Stack<Node> S2 = new Stack<Node>();
		S1.push(root);
		
		while(!S1.isEmpty() || !S2.isEmpty()) {
			
			while(!S1.isEmpty()) {
				Node node = S1.pop();
				System.out.print(node.data + " ");
				
				if(node.left != null) {
					S2.push(node.left);
				}
				if(node.right != null) {
					S2.push(node.right);
				}
			}
			System.out.println();
			while(!S2.isEmpty()) {
				Node node = S2.pop();
				System.out.print(node.data + " ");
				
				if(node.right != null) {
					S1.push(node.right);
				}
				if(node.left != null) {
					S1.push(node.left);
				}
			}
			System.out.println();
		}
		
	}

	// Driver Code
	public static void main(String args[]) {
		SpiralOrder tree_level = new SpiralOrder();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);
		tree_level.root.right.left = new Node(6);
		tree_level.root.right.right = new Node(7);

		System.out.println("Spiral order traversal of binary tree is - ");
		tree_level.printSpiralOrder();
	}
}
