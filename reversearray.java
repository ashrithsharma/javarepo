package may_18;
import java.util.Scanner;
class reversearray {

		
			public void input()
			{
				Scanner sc=new Scanner(System.in);
				int arr[]=new int[5];
				System.out.println("enter into array elements");
				for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
				System.out.println("------------------------------");
				for(int i=arr.length-1;i>=0;i--)
				{
									{
						System.out.print(arr[i]+" ");
					}
				}
			}
			public static void main(String[] args) {
				new reversearray().input();
			}

		}

