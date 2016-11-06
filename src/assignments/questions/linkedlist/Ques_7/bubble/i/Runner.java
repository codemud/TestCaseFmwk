package assignments.questions.linkedlist.Ques_7.bubble.i;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

import util.stats.Stats;

public class Runner {
	/**
	 * Q_8:
	 * bubbleSort
	 * */
	public static void Ques_8Test_BubbleIterative(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer>headResult = Solution.bubbleSort(head);
		stats.endStat();
		LinkedListUtility.printList(headResult,filePath);
	}
}
