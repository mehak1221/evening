package LinkList;
import java.util.*;
public class Dlist {

	public static void main(String[] args) {
		DNode<Integer> head=null;
		Dll<Integer> dlist=new Dll<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int data=sc.nextInt();
			head=dlist.insert(head,data);
		}
		dlist.display(head);
		int data=sc.nextInt();
		int pos=sc.nextInt();
		head=dlist.insertatAny(head, data, pos);
		dlist.display(head);
	}

}
