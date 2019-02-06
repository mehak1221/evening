package LinkList;
import java.util.*;
public class List {

	public static void main(String[] args) {
		Node<Integer> head=null;
		LL<Integer> l=new LL<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int data=sc.nextInt();
			head=l.insertatEnd(head, data);
		}
		l.display(head);
		int data=sc.nextInt();
		int pos=sc.nextInt();
		head=l.insertatAny(head,data,pos );
		l.display(head);
	    pos=sc.nextInt();
		head=l.del(head, pos);
		System.out.println("linklist after reversing");
		head=l.rev(head);
		l.display(head);

	}

}
