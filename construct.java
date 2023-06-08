package may_18;

public class construct {
	 static int name;
	void meth1()
	{
		System.out.println("meth1() is called");
	}
	/*construct(int x)
	{
		name=x;
		System.out.println("hi");
		new construct("java is awesome").meth1();
		System.out.println(name);
	}*/
	construct(int x)
	{
		//System.out.println(s);
		//System.out.println(20);
		name=x;
		System.out.println(name);
	}
void method3(int x)
	{
		name =x;
		System.out.println(name);
		
	}
	public static void main(String[] args) {
	 System.out.println("start");
	 construct c1=new construct(5);
	 c1.meth1();
		System.out.println(name);
	 System.out.println("end");
	 c1.method3(70);
	 
	 
	}

}
