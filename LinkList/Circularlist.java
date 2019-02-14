package LinkList;
import java.util.*;
public class Circularlist {

	public static void main(String[] args) {
		Circularll<Integer> list=new Circularll<>();
		CNode<Integer> head=null;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int data=sc.nextInt();
			head=list.insert(head, data);
		}
		list.display(head);
		int data=sc.nextInt();
		int pos=sc.nextInt();
		head=list.insertatAny(head, data, pos);
		list.display(head);
		pos=sc.nextInt();
		head=list.del(head, pos);
		list.display(head);
	}

}
