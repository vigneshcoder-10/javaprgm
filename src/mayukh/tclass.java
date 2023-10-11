package mayukh;

public class tclass {

	public static void main(String[ ] args) {
		   A object = new A();
		   object.start();
		   }
}
		class B implements Runnable {
			   public void run() {
			     System.out.println("B");	
			   }
			}
			class A extends Thread {
			   public void run() {
			    System.out.println("A");
			    Thread t = new Thread(new B());
			    t.start();
			   }
			}
			
			
	


