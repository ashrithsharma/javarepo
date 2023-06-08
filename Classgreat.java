package may_18;

public class Classgreat {
	public Classgreat(int a,int b,int c )
	{
		if(a>b) 
		{
			if(a>c) {
				System.out.println(a+" "+"is greater");
			}
		}
		else if(b>c)
		{
			if(b>a) {
				System.out.println(b+" "+"is greater");
			}
			
		}
		else
		{
			System.out.println(c+" "+"is greater");
		}
	}
	public static void main(String[] args) {
		new Classgreat(5,6,7);
	}

}
