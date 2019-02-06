package LinkList;

public class Dll<T> {
	public DNode<T> insert(DNode<T> head,T data)
	{
		DNode<T> newNode=new DNode<>(data);
		if(head==null)
			head=newNode;
		else
		{
			DNode<T> temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
		return head;
	}
	public DNode<T> insertatAny(DNode<T> head,T data,int pos)
	{
		DNode<T> newNode=new DNode<>(data);
		DNode<T> temp=head;
		int c=1;
		while(c<pos-1)
		{
			temp=temp.next;
			c++;
		}
		newNode.next=temp.next;
		newNode.prev=temp;
		temp.next.prev=newNode;
		temp.next=newNode;
		return head;
	}
	public static void display(DNode<Integer> head)
	{
		DNode<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}

}
