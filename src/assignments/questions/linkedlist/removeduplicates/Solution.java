package assignments.questions.linkedlist.removeduplicates;

import assignments.questions.linkedlist.LinkedListNode;

public class Solution {
	/**
	 * Q_4: Remove duplicates
	 */

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> current = head;

		if (head == null)
			return null;

		while (current.next != null) {
			if (current.data.equals(current.next.data)) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

		return head;
	}

}
