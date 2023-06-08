package may_18;

public class reverse {
	public int revNumber(int a) {
		return ((a%10)*10+(a/10));
		}
public static void main(String []args)
{
	 reverse r1 =new reverse();
	 System.out.println(r1.revNumber(56));
	 
}
}
