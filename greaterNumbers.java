package controlstatements;

public class greaterNumbers {
	public static void main(String args[]) {
		int a, b, c, d, e;
		a = 23;
		b = 12;
		c = 16;
		d = 76;
		e = 54;

		if (a > b && a > c && a > d && a > e) {
			System.out.println("a is greater");

		} else if (b > a && b > c && b > d && b > e) {
			System.out.println("b is greater");
		} else if (c > a && c > b && c > d && c > e) {
			System.out.println("c is greater");
		} else if (d > a && d > b && d > c && d > e) {
			System.out.println("d is greater");
		} else if (e > a && e > b && e > c && e > d) {
			System.out.println("e is greater");
		} else {
			System.out.println("All Are Same");
		}
	}
}
