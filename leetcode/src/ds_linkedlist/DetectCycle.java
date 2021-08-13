// 环形链表02
// https://leetcode-cn.com/leetbook/read/linked-list/jjhf6/

// 思路 如果有环，当快慢指针相遇时，创建一个新指针从head出发，慢指针继续走，相遇时即为入环索引。
package ds_linkedlist;

public class DetectCycle {

	
	public Node detectCycle(Node head)
	{
		Node slow = head;
		Node fast = head;
		while(slow!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				Node find = head;
				while(find!=slow)
				{
					find = find.next;
					slow = slow.next;
				}
				return find;
			}
			if(fast == null)
			{
				return null;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
