package may_18;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		System.out.println("size:"+al.size());
		for(int i=0;i<al.size()-1;i++)
		{
			System.out.print(al.get(i)+"    ");
		}
		System.out.println("\n");
		System.out.println("-----------------------------------------------------");
		for (int x:al)
		{
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------------");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		al.add(0,500);
		System.out.println(al);
		System.out.println("---------------------");
		System.out.println("isEmpty: "+al.isEmpty());
		System.out.println("remove: "+al.remove(0));
		System.out.println(al);
		System.out.println("---------reverse order---------");
		for(int i1=al.size()-1;i1>=0;i1--)
		{
			
				System.out.print(al.get(i1)+"    ");
			
		}
		System.out.println("-----------------------------");
		System.out.println("comtains:"+al.contains(50));
		
	}
	public static void main(String[] args) {
		new Collection().meth1();
	}
}
