package t0707_mylinkedlist;
import java.util.Arrays;

// 单链表实现
// 没有设置 伪头部
public class MyLinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList1 linkedList = new MyLinkedList1();
		linkedList.addAtTail(1);
		System.out.print(linkedList.get(0));
//		linkedList.addAtHead(7);
//		linkedList.addAtHead(2);
//		linkedList.addAtHead(1);
//		linkedList.addAtIndex(3,0);  
//		System.out.println(linkedList);
//		System.out.println("--------");
//		linkedList.deleteAtIndex(2); 
//		System.out.println(linkedList);
//		System.out.println("--------");
//		linkedList.addAtHead(6);
//		linkedList.addAtTail(4);
//		System.out.println(linkedList);
//		System.out.println("--------");
//		System.out.print(linkedList.get(4));
		
//		linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
//		System.out.print(linkedList);
//		System.out.print(linkedList.get(1));  //返回2
//		linkedList.deleteAtIndex(1);  //现在链表是1-> 3
//		System.out.print(linkedList.get(1));            //返回3

	}
	
	private Node head;
	private int size;
	/** Initialize your data structure here. */
	public MyLinkedList1() {
		size = 0;
		head = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
    	
    	if(index>=0 && index<size)
    	{
    		Node curr = head;
    		for(int i=0; i<index; i++)
    		{
    			curr = curr.next;
    		}
    		return curr.val;
    	}
    	else
    	{
    		return -1;
    	}
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	Node curr = new Node(val);
    	curr.next = head;
		head = curr;
		size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	if(size<1)
    	{
    		addAtHead(val);
    	}
    	else
    	{
    		Node curr = head;
        	for(int i=0; i<size-1; i++)
        	{
        		curr = curr.next;
        	}
        	curr.next = new Node(val);
        	size++;
    	}
    	
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	
    	if(index<=0)
    	{
    		this.addAtHead(val);
    	}
    	else if(index == size)
    	{
    		this.addAtTail(val);
    	}
    	else if(index>0 && index<size)
    	{
    		Node curr = head; 
    		for(int i=0; i<index-1; i++)
    		{
    			curr = curr.next;
    		}
    		Node temp = curr.next;
    		curr.next = new Node(val);
    		curr = curr.next;
    		curr.next = temp;
    		size++;
    	}
    	
    }
    public String toString()
    {
    	Node curr = head;
    	if(size == 0)
    	{
    		return "";
    	}
    	else
    	{
    		int[] vals = new int[size];
    		for(int i=0; i<size; i++)
        	{
        		vals[i] = curr.val;
        		curr = curr.next;
        	}
    		return Arrays.toString(vals);
    	}
    	
    }
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	if(index == 0)
    	{
    		head = head.next;
    		size--;
    	}
    	else if(index>0 && index<size)
    	{
    		Node curr = head;
    		for(int i=0; i<index-1; i++)
    		{
    			curr = curr.next;
    		}
    		curr.next = curr.next.next;
    		size--;
    	}
    }
}