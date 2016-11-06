package assignments.questions.linkedlist.Ques_10.Ques_10_1;


import java.util.Scanner;

import assignments.commondatastructure.LinkedListNode;



public class Main {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(Solution.reverse_I(input()));
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
}
