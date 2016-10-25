package assignments.runners.linkedlist.Ques_1;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Runner {
	/**
	 * Q_1: 
	 * Insert at ith position
	 */
	public static void Ques_1Test(int [] arr, int position, int data,String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> finalHead= LinkedListSolution.insertR(head,position,data);
		stats.endStat();
		LinkedListUtility.printList(finalHead,filePath);
	}
}