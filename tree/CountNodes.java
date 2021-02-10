package com.tree;

public class CountNodes {
	
	Node root;
	public CountNodes() {
		this.root = null;
	}
	
	public void InsertUsingRecursion(int data) {
		root = insert(root, data);
	}
	
	public Node insert(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}else {
			if(data > root.data){
				root.right = insert(root.right, data);
			}else {
				root.left = insert(root.left, data);
			}
		}
		return root;
	}
	
	public void CountTotalNodes() {
		System.out.println("Total Nodes " + CountNodetUsingRecursion(root));
	}

	public int CountNodetUsingRecursion(Node root) {
		if(root == null) {
			return 0;
		}
		return 1 + CountNodetUsingRecursion(root.left) + CountNodetUsingRecursion(root.right);
	}
	
	public void CountLeafNodes() {
		System.out.println("Total Leaf Nodes " + CountLeafNodetUsingRecursion(root));
	}

	public int CountLeafNodetUsingRecursion(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}else {
			return CountLeafNodetUsingRecursion(root.left) + CountLeafNodetUsingRecursion(root.right);
		}
	}
	
	public void CountHalfLeafNodes() {
		System.out.println("Total Half Leaf Nodes " + CounthalfLeafNodetUsingRecursion(root));
	}

	public int CounthalfLeafNodetUsingRecursion(Node root) {
		if(root == null) {
			return 0;
		}
		
		int count =0;
		if( (root.left != null && root.right == null) || (root.left == null && root.right != null) ) {
			count++;
		}
		count = count + CounthalfLeafNodetUsingRecursion(root.left) + CounthalfLeafNodetUsingRecursion(root.right);
		return count;
	}
	
	public void CountFullNodes() {
		System.out.println("Total Full Nodes " + CountFullNodesUsingRecursion(root));
	}

	public int CountFullNodesUsingRecursion(Node root) {
		if(root == null) {
			return 0;
		}
		int count =0;
		if( root.left != null && root.right != null ) {
			count++;
		}
		count = count + CountFullNodesUsingRecursion(root.left) + CountFullNodesUsingRecursion(root.right);
		return count;
	}

	public static void main(String[] args) {
		CountNodes count = new CountNodes();
		count.InsertUsingRecursion(10);
		count.InsertUsingRecursion(5);
		count.InsertUsingRecursion(12);
		count.InsertUsingRecursion(4);
		count.CountTotalNodes();
		count.CountLeafNodes();
		count.CountHalfLeafNodes();
		count.CountFullNodes();
	}
}
