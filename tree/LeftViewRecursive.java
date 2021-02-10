package com.tree;

public class LeftViewRecursive {
	Node root;

	int maxLevel = 1;
	public void leftViewOfTree(Node node, int level) {
	    if(node == null) {
	      return;
	    }
	    
	    if(level >= maxLevel) {
	      System.out.print(node.data + " ");
	      maxLevel++;
	    }
	    
	    leftViewOfTree(node.left, level + 1);
	    leftViewOfTree(node.right, level + 1);
	}

	public static void main(String[] args) {

		LeftViewRecursive tree = new LeftViewRecursive();

		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(5);
		tree.root.left.right.right = new Node(11);
		tree.root.right.right = new Node(9);
		tree.root.right.right.left = new Node(4);
		
		tree.leftViewOfTree(tree.root, 1);
		System.out.println();
	}
}
