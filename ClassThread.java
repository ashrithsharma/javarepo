package may_18;

public class ClassThread extends Thread {
public void run()
{
	System.out.println("       ****************************************************************************************************");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	System.out.println("       ****************************************************************************************************");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	System.out.println("       *--------------------------------------------------------------------------------------------------*");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	System.out.println();
	
	System.out.println("       *               *******          *        *     *    *        *      *                             *");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	System.out.println("       *               *                * *    * *     *    *        *    *                               *");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	System.out.println("       *               *                *   * *  *     *    *        *  *                                 *");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	System.out.println("       *               *******   ****   *    *   *     *    *        *  *                                 *");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	System.out.println("       *               *                *        *     *    *        *    *                               *");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	System.out.println("       *               *                *        *     *    *        *      *                             *");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	System.out.println("       *               *******          *        *     *    *******  *       *                            *");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	System.out.println("       *--------------------------------------------------------------------------------------------------*");
	try {
		Thread.sleep(500);
		
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	System.out.println();
	
}
public static void main(String[] args) throws InterruptedException {
	ClassThread tobj=new ClassThread();
	Thread t1=new Thread(tobj);
	Thread.sleep(500);
	t1.start();
	
}
}
