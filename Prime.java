package may_18;
import java.util.Scanner;

public class Prime {
	int n;

	void methodprime(){
		System.out.println("-----------------PRIME--NUMBERS------------");
		Scanner sn=new Scanner(System.in);
		System.out.println("enter new ");
		n=sn.nextInt();
for(int i=1; i < n; i++){
	boolean c = true;
	for(int j=2; j < i ; j++){
 if(i % j == 0){
  c = false;
  break;
         }
 } 
 if(c) {
         System.out.println(i + "\n");
}

}
}
	public static void main(String[] args) {
		new Prime().methodprime();
	}
}