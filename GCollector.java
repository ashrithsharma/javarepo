package may_18;

public class GCollector {
void meth1()
{
	System.out.println("hi");
}
protected void finalize()
{
	System.out.println("Garbage has been called");
	
}
public static void main(String [] args) {
	GCollector g1=new GCollector();
	GCollector g2=new GCollector();
	System.out.println("----------------GETCLASS_OUTPUT--------"+"\n");
	System.out.println(g1.getClass());
	System.out.println(g2.getClass());
	System.out.println("----------------TOSTRING_OUTPUTS-------"+"\n");
	System.out.println(g1.toString());
	System.out.println(g2.toString());
	
	
	}
}
