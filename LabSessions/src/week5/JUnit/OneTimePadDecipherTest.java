package week5.JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import week5.OneTimePadDecipher;

public class OneTimePadDecipherTest {

    @Test
    public void testDecipher() {
        assertEquals("YOUMANAGEDIT", OneTimePadDecipher.decipher("uvufsghktdal", "WHATSTHEPASSWORD"));

        assertEquals("YOUCANDECIPHEROK", OneTimePadDecipher.decipher("wconlahzgzgleuai", "YOULLNEVERREADMYONETIMEPAD"));

        assertEquals("IS THIS SECURE", OneTimePadDecipher.decipher("sw itmn jcxyic", "KEEPMEVERYVERYSAFE"));
    }
}