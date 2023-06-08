package may_18;

	public class SwapNumbers {
	    
	        String swapnum(int x,int y) {
	        System.out.println("Number 1 = " +x);
	        System.out.println("Number 2 = " +y);
	  
	        x = x + y;
	        y = x - y;
	        x = x - y;
	        return x+ " "+ y;
	       
	        
	    }
	        public static void main(String[] args) {
	        SwapNumbers s1=new SwapNumbers();
	        
	        System.out.println("after swapping"+" "+s1.swapnum(5,7));
	        
	        }
	        
	}


