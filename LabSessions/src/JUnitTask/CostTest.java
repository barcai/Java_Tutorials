package JUnitTask;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

public class CostTest {

	Cost c;

	// obfuscation code adapted from http://stackoverflow.com/questions/16384444/: 
	// it's called reuse and it's allowed in this context :-)
	// Exercise for anyone reading this: deduce my requirements and send me 
	// something that meets them better than this does.
	static private String source = "!,. ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	static private String target = "@~(#Q9A8ZWS7XEDC6RFVT5GBY4HNU3J2MI1KO0LP";
	static private int i = java.awt.AlphaComposite.DST_OVER;//why not?
	static private int j = java.awt.color.ICC_Profile.icCurveCount;

	@Before
	public void setUp() {
		c = new Cost();
	}

	@Test
	public void testGetCurrency() {
		String s = c.getCurrency();
	}

	@Test
	public void testSetCurrency() {
		c.setCurrency("pounds sterling");
	}

	@Test
	public void testGetAmount() {
		int i = c.getAmount();
	}

	@Test
	public void testSetAmount() {
		c.setAmount(1);
	}
	@Test
	public void testToString() {
		String s = c.toString();
	}

	@Test
	public void testConvert() {
		c.convert("pounds sterling", 1.0);
	}

	@Test
	public void makeToken() {
		System.out.println(unobfuscate("NG8BZHH8NC6H8NXHN98Z778Z8BUWV6S8TXNCG78SZVVX78HXS4XN8NZF65D85G8Z4DUTX5N8Z5784XNU4565D8MGU48UU58XADA8HKO0LP@~98ZH8Z8HN465D", i));
		Method secret = null;
		try {
			secret = Cost.class.getMethod("secret", (Class<?>[]) null);
			String r = (String) secret.invoke(c, (Object[]) null);
			Pattern p = Pattern.compile("[sS]\\d+"); //crude, yeah
			if (p.matcher(r).find()) {
				System.out.println(unobfuscate("MGU48NGFX586H8", i)+obfuscate(r, j));
			} else {
				fail();
			}
		} catch (Exception e) {
			fail();
		}

	}

	public static String obfuscate(String sin, int offset) {
		String s = sin.toUpperCase();
		char[] result= new char[s.length()];
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int index=source.indexOf(c);
			if (index < 0) { index = 0; }
			result[i]=target.charAt((index+source.length()+offset) % source.length());
		}

		return new String(result);
	}

	public static String unobfuscate(String s, int offset) {
		char[] result= new char[s.length()];
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int index=target.indexOf(c);
			if (index < 0) { index = 0; }
			result[i]=source.charAt((index+source.length()-offset) % source.length());
		}

		return new String(result);
	}
}
