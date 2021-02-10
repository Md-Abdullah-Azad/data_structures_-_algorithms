package com.tree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalOrderTraversal {

	Node root;
	public static HashMap<Integer, List<Integer>> map = null;
	public static void main(String[] args) {
		
		VerticalOrderTraversal tree = new VerticalOrderTraversal();
		tree.root = new Node(1);
		tree.root.right = new Node(3);
		tree.root.left = new Node(2);
		tree.root.left.right = new Node(4);
		tree.root.left.right.right = new Node(5);
		tree.root.left.right.right.right = new Node(6);
		
		verticalOrderTraversal(tree.root);
		for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
			System.out.println("Distance : "+entry.getKey()+"  Values : "+entry.getValue() );
		}
	}

	public static void verticalOrderTraversal(Node root) {
		if (null == map) {
			map = new HashMap<>();
		}
		verticalTrav(root, 0);
	}
	
	private static void verticalTrav(Node root, int distance) {
		if (null == root) {
			return;
		}
		List<Integer> list = null;
		if (map.containsKey(distance)) {
			list = map.get(distance);
		} else {
			list = new ArrayList<>();
		}
		list.add(root.data);
		map.put(distance, list);
		verticalTrav(root.left, distance - 1);
		verticalTrav(root.right, distance + 1);
	}
}
