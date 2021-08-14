// 相交链表
// https://leetcode-cn.com/leetbook/read/linked-list/jjbj2/


// 解法：链表A,B 头尾相连，A-B B-A 两种连接方式 若A，B有相交，那两个从head出发的指针会相遇
package ds_linkedlist;

public class GetIntersectionNode {
	public Node getIntersectionNode(Node headA, Node headB)
	{
		Node a = headA;
		Node b = headB;
		while(a!=b)
		{
			a = a.next;
			b = b.next;
			if(a == b)
			{
				return a;
			}
			if(a == null)
			{
				a = headB;
			}
			if(b == null)
			{
				b = headA;
			}
			
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
