package tasca8n1ex8;

public class Tasca8n1ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ItAcademy";
		FunctionalInterface fi = cadena -> new StringBuilder(cadena).reverse().toString();
		System.out.println(fi.reverse(s));
	}

}
