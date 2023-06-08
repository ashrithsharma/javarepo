package may_18;

public class classBmain extends abstrct{
public void meth1()
{
	System.out.println("Hello world in child class ");
}
public static void main(String[] args) {
	classBmain b1=new classBmain();
	b1.meth1();
	b1.meth2();
	abstrct.meth3();
}
}

