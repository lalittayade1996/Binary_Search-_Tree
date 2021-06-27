package com.bridgelabz.bst.BinarySearchTree_Project;

public class BinaryTree<K extends Comparable<K>> {

	private BinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
		if (current == null) {
			return new BinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return current;
		}
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(BinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	private boolean findNodeRecursive(BinaryNode<K> currentNode, K key) {
		if (currentNode == null) {
			return false;
		}
		int comparisonResult = key.compareTo(currentNode.key);
		if (comparisonResult == 0) {
			return true;
		}
		return comparisonResult < 0 
				? findNodeRecursive(currentNode.left, key)
				: findNodeRecursive(currentNode.right, key);
	}

	public boolean findNode(K key) {
		return findNodeRecursive(root, key);
	}
}