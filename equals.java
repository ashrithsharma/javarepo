package may_18;

public class equals {
	void meth1()
	{
		System.out.println("Hello");
		
	}
public static void main(String []args)
{
	equals e1= new equals();
	equals e2=new equals();
	System.out.println(e1.equals(e2));
	System.out.println(e2.equals(e1));
}

}
