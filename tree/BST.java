package com.tree;

public class BST {

	Node root;
	public BST() {
		this.root = null;
	}
	
	public void insert(int data) {
		Node temp = new Node(data);
		if(root == null) {
			root=temp;
		}else {
			while(true) {
				Node currentNode = root;
				Node prevNode = null;
				if(data < root.data) {
					prevNode = currentNode;
					currentNode = currentNode.left;
					if(currentNode == null) {
						prevNode.left = temp;
						break;
					}
				}else {
					prevNode = currentNode;
					currentNode = currentNode.right;
					if(currentNode == null) {
						prevNode.right = temp;
						break;
					}
				}
			}
		}
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
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(10);
		bst.insert(5);
		bst.insert(12);
		bst.insert(4);
		System.out.println(bst);
	}
	
}
