package exercise.the_bloaters;
import java.util.Enumeration;


public class ExtractMethod {

	public static void main(String[] args) {
		ExtractMethod test = new ExtractMethod("Andi");
		test.printOwing();
	}
	private Order orders;
	private String name;
	public String getName() {
		return name;
	}
	public ExtractMethod(String name) {
		this.name = name;
		orders = new Order();
	}
	// TODO: reduce this method with extract method
	void printOwing() {
	printBanner();
	double outstanding = calculateOutstanding();
	printDetails(outstanding);

	}

	public void printBanner() {
	  System.out.println ("*****************************");
	  System.out.println ("****** Customer totals ******");
	  System.out.println ("*****************************");
	}
	public double calculateOutstanding(){
		Enumeration elements = orders.elements();
	  double outstanding = 0.0;
	

	  // print owings
	  while (elements.hasMoreElements()) {
	    Order each = (Order) elements.nextElement();
	    outstanding += each.getAmount();
	  }
		return outstanding;
	}
	public void printDetails(double outstanding){
			  // print details
	  System.out.println("name: " + name);
	  System.out.println("amount: " + outstanding);
	}
	
	
	class Order implements Enumeration {
		private double [] amounts;
		private int currentIndex;
		public Order() {
			amounts = new double[5];
			currentIndex  = 0;
			amounts[0] = 12.0;
			amounts[1] =  2.5;
			amounts[2] =  3.2;
			amounts[3] =  7.05;
			amounts[4] =  6.0;
		}
		
		public boolean hasMoreElements() {
			if(currentIndex < amounts.length) {
				return true;
			}
			return false;
		}

		public Enumeration elements() {
			return this;
		}

		public double getAmount() {
			return amounts[currentIndex - 1];
		}

		public Object nextElement() {
			currentIndex ++;
			return this;
		}
		
	}
}
