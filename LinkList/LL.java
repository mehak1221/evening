package LinkList;

public class LL<T> {

	public Node<T> insertatEnd(Node<T> head,T data)
	{
		Node<T> newNode=new Node<>(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node<T> temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
		return head;
	}
	public Node<T> insertatBegin(Node<T> head,T data)
	{
		Node<T> newNode=new Node<>(data);
		newNode.next=head;
		head=newNode;
		return head;
	}
	public Node<T> insertatAny(Node<T> head,T data,int pos)
	{
		Node<T> newNode=new Node<>(data);
		Node<T> temp=head;
		int c=1;
		while(c<pos-1)
		{
			temp=temp.next;
			c++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	public Node<T> del(Node<T> head,int pos)
	{
		Node<T> temp=head;
		int c=1;
		if(pos==1)
		{
			return head.next;
		}
		else
		{
			while(c<pos-1)
			{
				temp=temp.next;
				c++;
			}
			temp.next=temp.next.next;
			
		}
		return head;
	}
	public Node<T> rev(Node<T> head)
	{
		Node<T> p1=head;
		Node<T> p2=head.next;
		Node<T> p3=p2;
		p1.next=null;
		while(p3.next!=null)
		{
			p3=p3.next;
			p2.next=p1;
			p1=p2;
			p2=p3;
		}
		p2.next=p1;
		head=p3;
		return head;
	}
	public static void display(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
