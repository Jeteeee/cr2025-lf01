package exercise.the_bloaters;
public class ExtractClass {
// todo extract class TelephoneNumber from class Person
	class TelephoneNumber {
		private String officeAreaCode;
		private String officeNumber;
	
	 public String getOfficeAreaCode() {
		return officeAreaCode;
	  }
	  public void setOfficeAreaCode(String arg) {
		officeAreaCode = arg;
	  }
	  public String getOfficeNumber() {
		return officeNumber;
	  }
	  public void setOfficeNumber(String arg) {
		officeNumber = arg;
	  }
	   public String getTelephoneNumber() {
		return ("(" + officeAreaCode + ") " + officeNumber);
	  }
		
	}
	
	class Person {
	  private String name;
	  private TelephoneNumber TelephoneNumber;
		public Person (){
			this.TelephoneNumber = new TelephoneNumber();
		}

	  public String getName() {
		return name;
	  }
	  public void setName(String name) {
		  this.name = name
	  }
	  public String getTelephoneNumber() {
            return telephoneNumber.getTelephoneNumber();
        }

        public String getOfficeAreaCode() {
            return telephoneNumber.getOfficeAreaCode();
        }

        public void setOfficeAreaCode(String areaCode) {
            telephoneNumber.setOfficeAreaCode(areaCode);
        }

        public String getOfficeNumber() {
            return telephoneNumber.getOfficeNumber();
        }

        public void setOfficeNumber(String number) {
            telephoneNumber.setOfficeNumber(number);
        }
    }
	}
}
