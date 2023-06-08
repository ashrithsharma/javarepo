package may_18;

public class Square {
int side;
Square(int x)
{
	side=x;
}
public void getArea()
{
	System.out.println("Area of the Square is:"+(side*side));
}
public static void main(String[] args) {
	new Square(5).getArea();
}
}
