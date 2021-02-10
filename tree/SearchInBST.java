package com.tree;

public class SearchInBST {

	Node root;
	public SearchInBST() {
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
	
	public void search(int data) {
		Node temp = SearchUsingRecursion(root, data);
		if(temp != null) {
			System.out.println("Node Found : " + temp.data);
		}else {
			System.out.println("Node not exist");
		}
	}
	public Node SearchUsingRecursion(Node root, int data) {
		if(root == null && root.data == data ) {
			return root;
		}
		if(data < root.data){
			return SearchUsingRecursion(root.left, data);
		}else {
			return SearchUsingRecursion(root.right, data);
		}
	}
	
	public static void main(String[] args) {
		SearchInBST bst = new SearchInBST();
		bst.InsertUsingRecursion(10);
		bst.InsertUsingRecursion(5);
		bst.InsertUsingRecursion(12);
		bst.InsertUsingRecursion(4);
		bst.search(12);
		// bst.search(101);
	}
}
