package org.nikolay.metod;

public class Metod {

	public double square(double a, double b, double c) {
		return 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b)
				* (a + b - c));
	}

}