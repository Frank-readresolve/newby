package io.readresolve.newby.utils;

/**
 * A simple calculator.
 *
 * @author Frank MARSHALL
 */
public final class Calc {

    private Calc() {
	// Ensures non-instantiability
    }

    /**
     * Returns the result of {@code a + b}.
     *
     * @param a
     *            a value
     * @param b
     *            another value
     * @return the result of {@code a + b}
     */
    public static double add(double a, double b) {
	return a + b;
    }

    /**
     * Returns the result of {@code a - b}.
     *
     * @param a
     *            a value
     * @param b
     *            another value
     * @return the result of {@code a - b}
     */
    public static double substract(double a, double b) {
	return a - b;
    }

    /**
     * Returns the result of {@code a / b}.
     *
     * @param a
     *            a value
     * @param b
     *            another value
     * @return the result of {@code a / b}
     */
    public static double divide(double a, double b) {
	return a / b;
    }

    /**
     * Returns the result of {@code a * b}.
     *
     * @param a
     *            a value
     * @param b
     *            another value
     * @return the result of {@code a * b}
     */
    public static double multiply(double a, double b) {
	return a * b;
    }
}
