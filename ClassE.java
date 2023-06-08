package may_18;

public class ClassE {
int meth1(int a,int b,char c)
{
	System.out.println(c);
	int result=new ClassE().meth2("java",100,'y');
	return 10+a+result;
}
int meth2(String s,int a,char c) {
	
	System.out.println(3);
	System.out.println(c);
	return 20;
}
public static void main(String []args)
{
	System.out.println(new ClassE().meth1(10,10,'x'));
}
}
