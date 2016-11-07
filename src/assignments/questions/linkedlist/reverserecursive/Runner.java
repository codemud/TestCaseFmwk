package assignments.questions.linkedlist.reverserecursive;

import assignments.questions.linkedlist.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

import util.stats.Stats;

public class Runner {
	public static void Ques_10_RTest(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = Solution.reverse_R(head);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
}
