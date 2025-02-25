package exercise.the_bloaters;
public class ExtractSubClass {
// todo: extract subclass PartsItem & LaborItem from JobItem
	class JobItem {
	  private int quantity;


	  public JobItem(int quantity) {
		this.quantity = quantity;
	  }

	  public int getQuantity() {
		return quantity;
	  }
	public abstract int getUnitPrice();

		        public int getTotalPrice() {
            return quantity * getUnitPrice();
        }
	}
	class PartsItem extends JobItem {
		private int unitPrice;
		public PartsItem(int quantity, int unitPrice){
			super(quantity);
			this.unitPrice = unitPrice;
		}
		public setUnitPrice(int unitPrice) {
			this.unitPrice = unitPrice;
		}
		getUnitPrice(){
			return unitPrice;
		}
		
	}
    class LaborItem extends JobItem {
        private Employee employee;

        public LaborItem(int quantity, Employee employee) {
            super(quantity);
            this.employee = employee;
        }
        public int getUnitPrice() {
            return employee.getRate();
        }
        public Employee getEmployee() {
            return employee;
        }
    }
		

	class Employee {
	  private int rate;
	  public Employee(int rate) {
		this.rate = rate;
	  }
	  public int getRate() {
		return rate;
	  }
	}
	public void action() {
		Employee kent = new Employee(50);
		JobItem j1 = new JobItem(5, 0, true, kent);
		JobItem j2 = new JobItem(15, 10, false, null);
		int total = j1.getTotalPrice() + j2.getTotalPrice();
		System.out.println(total);
	}
	public static void main(String[] args) {
		new ExtractSubClass().action();
	}

}
