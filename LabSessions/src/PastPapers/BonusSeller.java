package PastPapers;

import java.util.HashMap;

public class BonusSeller extends Seller {
	
	private HashMap<String, Double> sales;
	
	public BonusSeller(String n) {
		super(n);
		this.sales = new HashMap<String, Double>(10);
	}
	
	public void sale (String n, double amount) {
		super.sale(amount);
		if (this.sales.containsKey(n)) {
			double newValue = sales.get(n) + amount;
			this.sales.put(n, newValue);
		} else {
			this.sales.put(n, amount);
		}
		System.out.println("Added customer " + n + " with value " + amount + " and now size of sales is " + this.sales.keySet());
	}
	
	@Override
	public String toString() {
		String result = "";
		result += super.toString() + "\n";
		System.out.println(this.sales.keySet());
		for (String key: this.sales.keySet()) {
			int sales = (int) Math.round(this.sales.get(key));
			result += key + ", " + sales + "kg\n";
		}
		
		return result;
	}
	
	public int calculateBonus() {
		int numberOfCustomers = sales.size();
		if (numberOfCustomers < 5) {
			return 0;
		} else if (numberOfCustomers < 10) {
			return 5;
		} else {
			return 7;
		}
	}
	
	public static void main (String[] args) {
		BonusSeller b;
		b = new BonusSeller("Perdita Stevens");
		b.sale("Ian Stark", 45.09);
		System.out.println(b);
	}
	
	
}
