// https://leetcode-cn.com/problems/linked-list-cycle/
// https://leetcode-cn.com/leetbook/read/linked-list/jbex5/

// 环形链表01 

package ds_linkedlist;


public class HasCycle {
	
	public static boolean hasCycle(Node head)
	{
		
		Node slow = head;
		Node fast = head;
		while(slow!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				return true;
			}
			if(fast == null)
			{
				return false;
			}
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Self defined a linked list using class MyLinkedList2

	}

}
