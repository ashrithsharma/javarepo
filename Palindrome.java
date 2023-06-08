package may_18;
import java.util.Scanner;
public class Palindrome {
	int n;
	int palindrome;
void method1()
{
	Scanner sc= new Scanner(System.in);
n=sc.nextInt();
int a=11;
 palindrome=a+(n-1)*1;
 System.out.println(palindrome);
	
}
public static void main(String []args)
{
	new Palindrome().method1();
}
}
