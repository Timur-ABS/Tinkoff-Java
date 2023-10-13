package edu.hw2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.hw2.Expr.*;

//public class ExprTest {
//
//    @Test
//    public void testConstant() {
//        Expr constant = new Constant(5);
//        assertEquals(5, constant.evaluate());
//    }
//
//    // Аналогичные тесты для других классов...
//}


public class ExprTest {
    public static void main(String[] args) {
        var two = new Constant(2);
        var four = new Constant(4);
        var negOne = new Negate(new Constant(1));
        var sumTwoFour = new Addition(two, four);
        var mult = new Multiplication(sumTwoFour, negOne);
        var exp = new Exponent(mult, new Constant(2));
        var res = new Addition(exp, new Constant(1));

        System.out.println(res + " = " + res.evaluate());
    }
}
