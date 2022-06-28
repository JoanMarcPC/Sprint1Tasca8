package tasca8n1ex6;

import java.util.ArrayList;
import java.util.Comparator;

public class Tasca8n1ex6 {

// 	Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaString = new ArrayList<String>();

		listaString.add("AA");
		listaString.add("123");
		listaString.add("123");
		listaString.add("12");
		listaString.add("1");
		listaString.add("1234");
		listaString.add("1234567");
		listaString.add("123456");
		listaString.add("12345");
		listaString.add("123456789");
		listaString.add("12345678");
		listaString.add("12345678");
		listaString.add("12345678");
		listaString.add("12345678");
		listaString.add("12345678");
		listaString.add("Manuel");
		listaString.add("Michel");
		listaString.add("Esteban");
		listaString.add("A");
		listaString.sort(Comparator.comparing(e->e.toString().length()));
		listaString.forEach(System.out::println);
		

	}

}
