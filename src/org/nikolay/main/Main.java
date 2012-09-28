package org.nikolay.main;

import org.nikolay.metod.Metod;
import org.nikolay.treangle.Treangle;

public class Main {

	public static void main(String[] args) {

		Treangle treangle = new Treangle();

		treangle.setA(3);
		treangle.setB(4);
		treangle.setC(5);

		Metod metod = new Metod();

		double a = treangle.getA();
		double b = treangle.getB();
		double c = treangle.getC();

		System.out.print("�������� �� �����������: ");

		if (metod.isCheckTreangl(a, b, c) == metod.NOT_TREANGLE) {
			System.out.println("�� �����������");
		} else {
			System.out.println("�����������");

			System.out.print("�������: ");
			System.out.println(metod.square(a, b, c));
			System.out.print("������: ");
			System.out.println(metod.height(a, b, c));
		}

	}

}
