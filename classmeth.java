package may_18;

public class classmeth {
	int meth1(int a,int b)
	{
		System.out.println(a);
		System.out.println(a-b);
		return new classmeth().meth4(a-1,"hi");	
	}
	
	String meth2(int x) {
		System.out.println(x - new classmeth().meth1(200,199));
		System.out.println(x);
		return "java";
		
	}
	String meth3(int a,int b,String s)
	{
		System.out.println(a);
		System.out.println(a+a);
		System.out.println(a+b);
		return s;
	}
	
	int meth4(int b,String s)
	{
		System.out.println(b);
		System.out.println(s);
		return b+b;
		
	}
	String meth5(String s)
	{
		return s;
		
	}
	
public static void main(String[] args)
{
	System.out.println(new classmeth().meth5(new classmeth().meth3(15,25,new classmeth().meth2(500))));
	
	
}
}

