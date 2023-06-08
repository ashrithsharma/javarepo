package may_18;

public class Classpractice {
 public Classpractice(){
	 
	System.out.println("default Constructor");
	method1();
}
 public Classpractice(int x,int y)
 {
	 System.out.println("Paramaterised constructor");
	 
 }
 public Classpractice(int x)
 {
	 if(x%2==0)
	 {
		 method1();
	 }
	 else if(x%5==0)
	 {
		method2();
	 }
	 else
	 {
		 default1();
	 }
 }
 void method1()
 {
	 int a;
	  a=5;
	 float c;
	 c=a;
	 int b1=(int) (c+a);
	 b1++; // b=11
	 System.out.println(b1++);// 11 b =12
	 method2();
 }
 void method2()
 {
	 int i=5;
	 Integer i1=Integer.valueOf(i++);
	 System.out.println(i);
	 int j=9;
	Integer j1= Integer.valueOf(j--);
	System.out.println(j--);
	show();
	System.out.println(j1);
	System.out.println(i1);
	
 }
void  show()
 {

	Integer i2=new Integer(100);
	 int i4=i2;
	 i4++;
	System.out.println(i4++);	
	evaluate();
 }
void evaluate()
{
	int e=5;
	int f=7;
	int sum=(e++ + f++)+(++e + ++f);
	int diff=(e-- + f--)-(--e+--f);
	int total=(sum++)+(--diff);
	System.out.println(total);
}
void default1()
{
	new Classpractice();
}
public static void main(String[] args) {
	System.out.println("welcome to ClassPractice");
	new Classpractice(5,7);
	new Classpractice(2);
	System.out.println("end");
	
	
	
}
}