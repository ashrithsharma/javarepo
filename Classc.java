package may_18;

public class Classc {
int meth1()
{
	System.out.println("meth1() cslled");
	return 100;
}
public static void main(String [] args)
{
	System.out.println("hello world");
	Classc c1= new Classc();
	int x=c1.meth1();
	System.out.println(x+new Classc().meth1());
}
}
