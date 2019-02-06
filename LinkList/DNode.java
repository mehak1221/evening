package LinkList;

public class DNode<T> {
	T data;
	DNode next;
	DNode prev;
	DNode(T data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
