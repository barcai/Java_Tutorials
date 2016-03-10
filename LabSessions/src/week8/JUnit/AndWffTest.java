package week8.JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import week8.AndWff;
import week8.Operator;
import week8.PropVar;

public class AndWffTest {

    @Test
    public void testAndWff() {
        PropVar p = new PropVar("P");
        PropVar q = new PropVar("Q");
        AndWff andWff = new AndWff(p, q);
        assertSame(p, andWff.getLeft());
        assertSame(q, andWff.getRight());
        assertSame(Operator.AND, andWff.getOp());
        assertEquals("(P & Q)", andWff.toString());
   }

}
