package week6;

import java.util.Calendar;

public class CreditCard {
	
	
	private int expiryMonth, expiryYear;
	private String firstName, lastName, ccNumber;
	
	public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ccNumber = ccNumber;
	}
	
	public String formatExpiryDate() {
		String year = Integer.toString(this.expiryYear);
		return (this.expiryMonth + "/" + year.substring(2));
	}
	
	public String formatFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public String formatCCNumber() {
		String[] nums = new String[4];
        for (int i = 0; i < nums.length; i++) {
            int idx = i * 4;
            nums[i] = ccNumber.substring(idx, idx + 4);
        }
        String s = String.format("%s %s %s %s", (Object[]) nums);
        return s;
	}
	
	public boolean isValid() {
		Calendar now = Calendar.getInstance();
		if (now.get(Calendar.YEAR) > this.expiryYear) {
			return false;
		} else if (now.get(Calendar.YEAR) == this.expiryYear &&
				now.get(Calendar.MONTH) >= (this.expiryMonth-1)) {
			return false;
		}
		return true;
		
	}
	
	public String toString() {
		return "Number: " + this.formatCCNumber() + 
	            "\nExpiration date: " + this.formatExpiryDate() + 
	            "\nAccount holder: " + this.formatFullName() + 
	            "\nIs valid: " + this.isValid();
	}
	
	public static void main(String[] args) {
		CreditCard x = new CreditCard(10, 2014, "Bob", "Jones", "1234567890123456");
		
		System.out.println(x);
	}
	
}
