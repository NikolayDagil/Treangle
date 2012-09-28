package org.nikolay.metod;

public class Metod {

	public static final double IS_TREANGLE = 1;
	public static final double NOT_TREANGLE = 0;

	private static final boolean IS_NULL = true;
	private static final boolean NOT_NULL = false;

	public double square(double a, double b, double c) {
		return 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b)
				* (a + b - c));
	}
	
	public double height(double a, double b, double c) {
		return 2
				* 0.25
				* Math.sqrt((a + b + c) * (b + c - a) * (a + c - b)
						* (a + b - c)) / a;
	}

	/**
	 * Данный метод проверяет является ли объект треугольником по трем известным
	 * сторонам
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return треугольник / не треугольник
	 */
	public double isCheckTreangl(double a, double b, double c) {

		if (!isCheckForNul(a) && !isCheckForNul(b) && !isCheckForNul(c)) {
									
			if ((c <= a + b) && (a<= b +  c)
					&& (b<= a + c )) {
				return IS_TREANGLE;
			} else {
				return NOT_TREANGLE;
			}
		} else {
			return NOT_TREANGLE;
		}
	}

	private boolean isCheckForNul(double a) {
		if (a == 0) {
			return IS_NULL;
		} else {
			return NOT_NULL;
		}
	}

}