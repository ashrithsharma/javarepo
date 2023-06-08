package may_18;

public class classparam {
void call(int x,int y)
{
	System.out.println("Start");
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x%y);
	System.out.println(x/y);
	System.out.println("end");
}
void newdata(String s,int v)
{
	System.out.println(s);
	System.out.println(v);
}
public static void main(String []args)
{
	classparam a1=new classparam();
	a1.call(5,8);
	a1.newdata("Ashrith",6);
	a1.newdata("Ashrith sharma", 9);
	
}
}
