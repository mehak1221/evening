package LinkList;

public class Circularll<T> {
	public CNode<T> insert(CNode<T> head,T data)
	{
		CNode<T> newNode=new CNode<T>(data);
		if(head==null)
		{
			head=newNode;
			newNode.next=head;
		}
		else
		{
			CNode<T> temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.next=head;
		}
		return head;
	}
	public CNode<T> insertatAny(CNode<T> head,T data,int pos)
	{
		CNode<T> newNode=new CNode<T>(data);
		int c=1;
		if(pos==1)
		{
			newNode.next=head;
			head=newNode;
		}
		else
		{
			CNode<T> temp=head;
			while(c<pos-1)
			{
				temp=temp.next;
				c++;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
		return head;
	}
	public CNode<T> del(CNode<T> head,int pos)
	{
		
		int c=1;
			CNode<T> temp=head;
			if(pos==1)
				return head.next;
			while(c<pos-1)
			{
				temp=temp.next;
				c++;
			}
			temp.next=temp.next.next;
		
		return head;
	}

	
	public void display(CNode<T> head)
	{
		
			CNode<T> temp=head;
			while(temp.next!=head)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.print(temp.data+"->");
			System.out.print(temp.next.data);
	}

}
