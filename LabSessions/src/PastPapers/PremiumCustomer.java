package PastPapers;

import java.util.HashMap;
import java.util.Map;

public class PremiumCustomer extends Customer {

	private Map<String, String> freeGifts;
	
	public PremiumCustomer(String n, Map<String, String> map) {
		super(n);
		this.freeGifts = map;
	}
	
	public void  giftsFrom(String item, int quantity) {
		if (freeGifts.containsKey(item)) {
			System.out.println(freeGifts.get(item) + " x " + quantity);
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		result += super.toString();
		result += "\nFree gifts:\n";
		for (String key: this.freeGifts.keySet()) {
			result += this.freeGifts.get(key) + " on ordering " + key + "\n";
		}
		return result.trim();
	}
	
	public int chocolateGifts() {
		int counter = 0;
		for (String key: this.freeGifts.keySet()) {
			if (this.freeGifts.get(key).contains("chocolate")) {
				counter++;
			}
		}
		
		return counter;
	}
	
	public static void main (String[] args) {
		Map<String, String> m = new HashMap<String,String>();
		m.put("printer cartridge", "chocolate bar");
		PremiumCustomer p = new PremiumCustomer("Perdita Stevens", m);
		p.giftsFrom("printer cartridge", 3);
		System.out.println(p);
		System.out.print(p.chocolateGifts());
	}

}
