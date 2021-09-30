package data.structure.tree;

import java.util.ArrayList;
import java.util.Scanner;

import data.structure.LinkedList.Solution;

class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException {
		if (size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}

	public void enqueue(T element) {
		Node<T> newNode = new Node<T>(element);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException {
		if (head == null) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if (head == tail) {
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

public class PriintLevelWise {

	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise() {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = s.nextInt();
				for (int i = 0; i < numChild; i++) {
					int currentChild = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
	}

	public static void printLevelWise(TreeNode<Integer> root) {
		QueueUsingLL<TreeNode<Integer>> level = new QueueUsingLL<TreeNode<Integer>>();
		TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
		level.enqueue(root);
		System.out.println(root.data);
		level.enqueue(nullNode);
		while (level.size() != 1) {
			TreeNode<Integer> temp = null;
			try {
				temp = level.dequeue();
			} catch (QueueEmptyException e) {

			}
			if (temp == nullNode) {
				level.enqueue(nullNode);
				System.out.println();
				continue;
			}
			for (int i = 0; i < temp.children.size(); i++) {
				System.out.print(temp.children.get(i).data + " ");
				level.enqueue(temp.children.get(i));
			}
		}
	}

}
