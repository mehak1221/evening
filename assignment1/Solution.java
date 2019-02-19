package package1;
import java.util.*;
class Employee
{
	int id;
	String name;
	double age;
	Employee()
	{
		this.id=0;
		this.name=null;
		this.age=0;
	}
	public void set(int id,String name,double age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
}
public class Solution {
	public Employee employeewithsecondlowestage()
	{
		Employee e=new Employee(id,name,age);
		return e;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Employee[] arr=new Employee[n];
		for(int i=0;i<n;i++)
		{
			int id=sc.nextInt();
			String name=sc.nextLine();
			double age=sc.nextDouble();
			arr[i].set(id, name, age);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].age);
		}

	}

}
