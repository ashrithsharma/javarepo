package may_18;

public class employee {
String empname;
int empsal;
String empdept;

static String empcompany="tcs";
employee(String name,int sal,String dept)
{
	empname=name;
	empsal=sal;
	empdept=dept;
}
public static void main(String[] args) {
	employee e1=new employee("Ashrith",10000,"c++");
	System.out.println(e1.empname+" "+e1.empsal+" "+e1.empdept+" "+e1.empcompany);
}
}
