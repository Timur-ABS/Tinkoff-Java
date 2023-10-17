package edu.hw2;

import edu.hw2.Expr.Addition;
import edu.hw2.Expr.Constant;
import edu.hw2.Expr.Exponent;
import edu.hw2.Expr.Multiplication;
import edu.hw2.Expr.Negate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExprTest {

    @Test public void testConstant() {
        Expr e = new Constant(5);
        assertEquals(5, e.evaluate());
        Expr e2 = new Constant(-5);
        assertEquals(-5, e2.evaluate());
    }

    @Test public void testNegate() {
        Expr e = new Negate(new Constant(5));
        assertEquals(-5, e.evaluate());
        Expr e2 = new Negate(new Constant(-5));
        assertEquals(5, e2.evaluate());
    }

    @Test public void testExponent() {
        Expr e = new Exponent(new Constant(2), 3);
        assertEquals(8, e.evaluate());
        Expr e2 = new Exponent(new Constant(-2), 3);
        assertEquals(-8, e2.evaluate());
        Expr e3 = new Exponent(new Constant(-2), 2);
        assertEquals(4, e3.evaluate());
    }

    @Test public void testAddition() {
        Expr e = new Addition(new Constant(3), new Constant(4));
        assertEquals(7, e.evaluate());
        Expr e2 = new Addition(new Constant(-3), new Constant(4));
        assertEquals(1, e2.evaluate());

    }

    @Test public void testMultiplication() {
        Expr e = new Multiplication(new Constant(3), new Constant(4));
        assertEquals(12, e.evaluate());
        Expr e2 = new Multiplication(new Constant(-3), new Constant(4));
        assertEquals(-12, e2.evaluate());
    }
}
