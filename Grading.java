package may_18;

public class Grading {
void marks(int marks)
{
	if(marks>80)
	System.out.println("A- Grade");
	else if(marks>60 && marks<80)
		System.out.println("B-Grade");
	else if(marks>50 && marks<60)
		System.out.println("C-Grade");
	else if(marks>45 && marks<50)
		System.out.println("D-Grade");
	else if(marks>25 && marks<45)
		System.out.println("E-Grade");
	else 
	System.out.println("Fail");
}
public static void main(String[] args) {
	new Grading().marks(77);
}
}
