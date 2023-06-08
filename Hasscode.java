package may_18;

public class Hasscode {
	void meth1()
	{
		System.out.println("hi");
	}
	public static void main(String [] args)
	{
		Hasscode h1=new Hasscode();
		Hasscode h2=new Hasscode();
		int x=h1.hashCode();
		int y=h2.hashCode();
		System.out.println("h1  hasscode:"+x);
		System.out.println("h2 hasscode:"+y);
		
	}

}
