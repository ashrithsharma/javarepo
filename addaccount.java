package may_18;

public class addaccount {

	 int amount=500;
	 addaccount()
	 {
		 System.out.println(amount);
	 }
	 addaccount(int x)
	 {
		 System.out.println("The final value:"+(x+amount));
		 }
	 public static void main(String[] args) {
		new addaccount();
		new addaccount(250);
		
	}
}
