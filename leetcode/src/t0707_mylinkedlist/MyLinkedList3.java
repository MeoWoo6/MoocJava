package t0707_mylinkedlist;

import java.util.Arrays;

//双链表实现


public class MyLinkedList3 {
	private dbNode head;
	private dbNode tail;
	int size;
//	initialize 
	public MyLinkedList3()
	{
		size = 0;
		head = new dbNode(0);
		tail = new dbNode(0);
		head.next = tail;
		tail.prev = head;
	}
	public int get(int index) 
	{
//    	if the index is invalid
    	if(index<0 || index>=size)
    	{
    		return -1;
    	}
    	dbNode curr = head;
    	if(index < size-index-1)
    	{
        	for(int i=0; i<=index; i++)
        	{
        		curr = curr.next;
        	}
    	}
    	else
    	{
    		curr = tail;
    		for(int i=0; i<size-index; i++)
    		{
    			curr = curr.prev;
    		}
    	}
    	return curr.val;
	}
	public void addAtIndex(int index, int val)
    {
    	if(index>size)
    	{
    		return;
    	}
    	if(index<0)
    	{
    		index = 0;
    	}
    	dbNode curr = head;
    	dbNode addNode = new dbNode(val);
 
    	if(index < size-index-1)
    	{
        	for(int i=0; i<index; i++)
        	{
        		curr = curr.next;
        	}
    	}
    	else
    	{
    		curr = tail;
    		for(int i=0; i<=size-index; i++)
    		{
    			curr = curr.prev;
    		}
    	}
    	addNode.next = curr.next;
    	curr.next.prev = addNode;
    	addNode.prev = curr;
    	curr.next = addNode;
    	size++;
    }
	
	public void deleteAtIndex(int index)
	{
		if(index<0||index>=size)
    	{
    		return;
    	}
		
		dbNode curr = head;
		if(index < size-index-1)
    	{
        	for(int i=0; i<index; i++)
        	{
        		curr = curr.next;
        	}
    	}
    	else
    	{
    		curr = tail;
    		for(int i=0; i<=size-index; i++)
    		{
    			curr = curr.prev;
    		}
    	}
		curr.next = curr.next.next;
		curr.next.prev = curr;
		size--;
	}
	
	
	public void addAtHead(int val)
    {
    	addAtIndex(0, val);
    }
	
    public void addAtTail(int val)
    {
    	addAtIndex(size, val);
    }
    
    public String toString()
    {
    	dbNode curr = head;
    	if(size == 0)
    	{
    		return "";
    	}
    	else
    	{
    		int[] vals = new int[size+2];
    		for(int i=0; i<size+2; i++)
        	{
        		vals[i] = curr.val;
        		curr = curr.next;
        	}
    		return Arrays.toString(vals);
    	}
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList3 linkedList = new MyLinkedList3();
		linkedList.addAtHead(1);
		linkedList.addAtTail(3);
		linkedList.addAtIndex(1,2);
//		System.out.println(linkedList.get(1));
		linkedList.deleteAtIndex(1);
		System.out.println(linkedList.get(1));
		System.out.println(linkedList);

	}

}
