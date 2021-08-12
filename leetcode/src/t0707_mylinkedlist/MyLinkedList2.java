package t0707_mylinkedlist;

// 单链表实现
// 在1的基础上 设置伪头部节点 在处理delete上保持一致。
// 这样，真实的index-th的值保存在index-th的next node中
public class MyLinkedList2 {
	private Node head;
	private int size;
//	初始化单链表 
	public MyLinkedList2() {
		size = 0;
//		伪头部节点，val值无意义
		head = new Node(0); 
    }
	
//	Get the value of the index-th node in the linked list. 
//	If the index is invalid, return -1. */
    public int get(int index) 
    {
//    	if the index is invalid
    	if(index<0 || index>=size)
    	{
    		return -1;
    	}
//    	
    	Node curr = head;
//    	now i increases to index
    	for(int i=0; i<=index; i++)
    	{
    		curr = curr.next;
    	}
    	return curr.val;
    }
    
//  Add a node of value val before the index-th node in the linked list. 
//  If index equals to the length of linked list, 
//  the node will be appended to the end of linked list. 
//  If index is greater than the length, the node will not be inserted.
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
    	Node curr = head;
    	Node addNode = new Node(val);
    	for(int i=0; i<index; i++)
    	{
    		curr = curr.next;
    	}
    	addNode.next = curr.next;
    	curr.next = addNode;
    	size++;
    }
//  Delete the index-th node in the linked list, if the index is valid. 
    public void deleteAtIndex(int index)
    {
    	if(index<0||index>=size)
    	{
    		return;
    	}
    	Node curr = head;
    	for(int i=0; i<index; i++)
    	{
    		curr = curr.next;
    	}
    	curr.next = curr.next.next;
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
	
    //Test 
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList2 linkedList = new MyLinkedList2();

	}
	

}
