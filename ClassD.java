package may_18;

public class ClassD {
int meth1(int x,int y)
{
	System.out.println("hi");
	return x+y;
}
void meth2(int i) {
	System.out.println(i+i);

}
public static void main(String []args)
{
	new ClassD().meth2(new ClassD().meth1(5,95));
}
}
