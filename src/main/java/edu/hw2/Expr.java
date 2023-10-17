package edu.hw2;

import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

public sealed interface Expr {
    Logger LOGGER = Logger.getLogger(Expr.class.getName());

    double evaluate();

    static void main(String[] args) {
        var two = new Constant(2);
        var four = new Constant(4);
        var negOne = new Negate(new Constant(1));
        var sumTwoFour = new Addition(two, four);
        var mult = new Multiplication(sumTwoFour, negOne);
        var exp = new Exponent(mult, 2);
        var res = new Addition(exp, new Constant(1));

        LOGGER.info(res + " = " + res.evaluate());
    }

    record Constant(double value) implements Expr {
        @Override
        public double evaluate() {
            return value;
        }

        @Override
        public @NotNull String toString() {
            return Double.toString(value);
        }
    }

    record Negate(Expr expr) implements Expr {
        @Override
        public double evaluate() {
            return -expr.evaluate();
        }

        @Override
        public @NotNull String toString() {
            return "-" + expr.toString();
        }
    }

    record Exponent(Expr base, double exponent) implements Expr {
        @Override
        public double evaluate() {
            return Math.pow(base.evaluate(), exponent);
        }

        @Override
        public @NotNull String toString() {
            return base.toString() + "^" + exponent;
        }
    }

    record Addition(Expr left, Expr right) implements Expr {
        @Override
        public double evaluate() {
            return left.evaluate() + right.evaluate();
        }

        @Override
        public @NotNull String toString() {
            return "(" + left.toString() + " + " + right.toString() + ")";
        }
    }

    record Multiplication(Expr left, Expr right) implements Expr {
        @Override
        public double evaluate() {
            return left.evaluate() * right.evaluate();
        }

        @Override
        public @NotNull String toString() {
            return "(" + left.toString() + " * " + right.toString() + ")";
        }
    }
}
