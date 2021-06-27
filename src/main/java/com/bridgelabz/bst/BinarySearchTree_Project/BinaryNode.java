package com.bridgelabz.bst.BinarySearchTree_Project;

public class BinaryNode<K extends Comparable<K>> {
	K key;
	BinaryNode<K> left;
	BinaryNode<K> right;

	BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}