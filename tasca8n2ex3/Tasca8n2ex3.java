package tasca8n2ex3;

public class Tasca8n2ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuntionalInterface suma = (num1, num2) -> num1 + num2;
		FuntionalInterface resta = (num1, num2) -> num1 - num2;
		FuntionalInterface multiplicacio = (num1, num2) -> num1 * num2;
		FuntionalInterface divisio = (num1, num2) -> {
			try {
				return num1 / num2;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				return 0;
			}
		};

		System.out.println(suma.operacio(2, 2));
		System.out.println(resta.operacio(20, 10));
		System.out.println(multiplicacio.operacio(100, 100));
		System.out.println(divisio.operacio(15, 4));
	}
}
