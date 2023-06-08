package may_18;

public class Choice {
	int limit =20;
	void odd()
	{
		System.out.println("-----------------ODD----NUMBERS------------");
		for(int i=1;i<limit;i++)
		{
			if(i%2!=0)
			System.out.println(i);
		}
	}
	
	void methodprime(){
		System.out.println("-----------------PRIME--NUMBERS------------");
for(int i=1; i < limit; i++){
	boolean isPrime = true;
	for(int j=2; j < i ; j++){
 if(i % j == 0){
  isPrime = false;
  break;
         }
 } 
 if(isPrime)
         System.out.print(i + "\n");
}
}
public static void main(String[] args){
new Choice().call("odd");
System.out.println("-----------------------------------------------");
new Choice().call("even");
System.out.println("-----------------------------------------------");
new Choice().call("prime");
System.out.println("-----------------------------------------------");
new Choice().call("natural");
System.out.println("-----------------------------------------------");

}
void even()
{
	System.out.println("-----------------EVEN---NUMBERS------------");
	for(int i=0;i<limit;i++) {
		if(i%2==0)
		System.out.println(i);
	}
}

void natural()
{
	System.out.println("-----------------NATURAL---NUMBERS---------");
	for(int i=0;i<limit;i++)
	{
		System.out.println(i);
	}
}
void call(String c)
{
	switch(c)
	{
	case "odd":odd();
	       break;
	case "even":even();
	break;
	case "prime": methodprime();
	break;
	case "natural":natural();
	break;
	default:System.out.println("invalid operation");
	}
	}
}

	                   
	                   