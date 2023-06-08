package may_18;

public class TypeCasting {
	void implicit()
	{
		//System.out.println("performing implicit operations");
		byte b=50;
		int i=b;
		float f=b;
	/*	System.out.println("Byte value is:"+b);
		System.out.println("Int value:"+i);
		System.out.println("float value:"+f+"\n"); */
		/*char c='b';
		int x=c;
		System.out.println("char  value:"+c);
		System.out.println("int value:"+x);*/
		//float g=9.99f;
		//double d=g;
	//	System.out.println("d value:"+d);
		int x=98;
		char c1=(char) x;
		System.out.println(c1);
		
	}
	public static void main(String[] args) {
		new TypeCasting().implicit();
		
	}
		
		
	}


