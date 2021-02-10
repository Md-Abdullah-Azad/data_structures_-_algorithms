package com.tree;
import java.util.Stack;

public class RootToLeafPath {
	
	Node root;
	public static void main(String[] args) {
		RootToLeafPath tree = new RootToLeafPath();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(5);
        Stack<Integer> st = new Stack<>();
        rootToLeaf(tree.root, st);
	}

	public static void rootToLeaf(Node root,Stack<Integer> st){
		if(null == root) {
			return;
		}
		st.push(root.data);
		rootToLeaf(root.left, st);
		if(root.left == null && root.right == null) {
			System.out.println(st);
		}
		rootToLeaf(root.right, st);
		st.pop();
	}
}
