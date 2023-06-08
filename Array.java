package may_18;
import java.util.Scanner;
public class Array {
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter into array elements");
		for(int i=0;i<arr.length-1;i++)
{
	arr[i]=sc.nextInt();
}
		System.out.println("------------------------------");
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		new Array().input();
	}

}
