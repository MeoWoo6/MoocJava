// 删除链表的倒数第N个结点
// https://leetcode-cn.com/leetbook/read/linked-list/jf1cc/
// 一开始思路：利用快慢指针，快指针先到达链表末尾，得到链表长度，慢指针再进行删除相应结点。
// 但这样，快慢指针（快每次进两步）没有意义，和两遍遍历没有区别。

// 快指针先出发n步，慢指针再出发，这样快指针在末尾的时候，慢指针就到了倒数第n+1
// 链表不为空
package ds_linkedlist;

public class RemoveNthFromEnd {

	public Node removeNthFromEnd(Node head, int n) 
	{
		Node fast = head;
		Node slow = new Node(0);
		slow.next = head;
		boolean delhead = true;
		for(int i=0; i<n; i++)
		{
			fast = fast.next;
		}
		
		while(fast!=null)
		{
			slow = slow.next;
			fast = fast.next;
			delhead = false;
		}
		slow.next = slow.next.next;
		if(delhead)
		{
			return slow.next;
		}
		else
		{
			return head;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
