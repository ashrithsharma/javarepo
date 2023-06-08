package may_18;

public class divisible {
void method(char c) {
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		System.out.println(c+"  is vowel letter");
	}
	else
	{
		System.out.println(c+"  is a consonant");
	}
	
}
public static void main(String[] args) {
	System.out.println("Start");
	new divisible().method('e');
	System.out.println("end");
}
}
