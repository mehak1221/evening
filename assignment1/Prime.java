package package1;
import java.util.*;
public class Prime {

	public static int prime(int num)
	{
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
			break;
			}
		}
			return flag;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=0;
		for(int i=0;i<n;i++)
		{
			int rev=0;
			int flag=prime(arr[i]);
			if(flag==0)
			{
				int num=arr[i];
				while(num>0)
				{
					int rem=num%10;
					rev=rev*10+rem;
					num=num/10;
				}
				int flag2 = prime(rev);
				if(flag2==0)
				{
					
					arr[k]=arr[i];
					k++;
				}
			}
			
		}
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<k;i++)
			System.out.print(arr[i]+" ");

	}

}

