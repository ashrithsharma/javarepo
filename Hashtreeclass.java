package may_18;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Hashtreeclass {
void meth1()
{
	  LinkedHashMap<Object,Object> hm=new LinkedHashMap<Object,Object>();
	  hm.put(101, "ashrith");
	  hm.put(102, "aravind");
	  hm.put(103, "nikhilesh");
	  hm.put(104, "Akhil");
	  System.out.println(hm);
	  System.out.println("size :"+hm.size());
	  System.out.println("----------------------------------");
	  System.out.println("retrivig using hashset");
	   TreeSet<Object> hs=new TreeSet<Object>(hm.keySet());
	   System.out.println("--iterative method-------");
	    Iterator<Object> i=hs.iterator();
	   while(i.hasNext())
	    {
	    	System.out.println(i.next());
	   }
	    
	   
}
public static void main(String[] args) {
	new Hashtreeclass().meth1();
}
}
