package edu.hw2;

public sealed interface Expr {
    double evaluate();

    public record Constant(double value) implements Expr {
        public double evaluate() {
            return value;
        }
    }

    public record Negate(Expr expr) implements Expr {
        public double evaluate() {
            return -expr.evaluate();
        }
    }

    public record Exponent(Expr base, Expr power) implements Expr {
        public double evaluate() {
            return Math.pow(base.evaluate(), power.evaluate());
        }
    }

    public record Addition(Expr left, Expr right) implements Expr {
        public double evaluate() {
            return left.evaluate() + right.evaluate();
        }
    }

    public record Multiplication(Expr left, Expr right) implements Expr {
        public double evaluate() {
            return left.evaluate() * right.evaluate();
        }
    }
}
