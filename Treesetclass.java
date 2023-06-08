package may_18;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;


public class Treesetclass {
void meth1()
{
	 TreeSet<Object> t=new TreeSet<Object>();
	 t.add(10);
	 t.add(12);
	 t.add(13);
	 t.add(16);
	 t.add(10);

	 System.out.println(t);
	 System.out.println("\n");
	 System.out.println("size:"+t.size());
	 System.out.println("--------------------------------------");
	 
	 Iterator i=t.iterator();
	 while(i.hasNext())
	 {
		 System.out.print(i.next()+" ");
	 }
	  ArrayList<Object> al=new ArrayList<Object>();
	  al.add(10);
		 al.add(12);
		 al.add(13);
		 al.add(16);
		 al.add(10);
		 al.add("java");
		 al.add("ashrith");
		 System.out.println("--------------------------------------");
		 Iterator i1=al.iterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next()+" ");
		 }
		
	    HashSet<Object> hs=new HashSet<Object>(t);
	    System.out.println(hs);

		  LinkedList<Object> li=new LinkedList<Object>();
		  li.add(10);
			 li.add(12);
			 li.add(13);
			 li.add(16);
			 li.add(10);
			 li.add("java");
			 li.add("ashrith");
			 Iterator i11=li.iterator();
			 System.out.println("--------------------------------------");
			 while(i11.hasNext())
			 {
				 System.out.println(i11.next()+" ");
			 }
	 
}
public static void main(String[] args) {
	new Treesetclass().meth1();
}
}