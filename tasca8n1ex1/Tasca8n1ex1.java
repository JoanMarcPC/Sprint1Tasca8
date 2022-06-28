package tasca8n1ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tasca8n1ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercici 1
		ArrayList<String> listaString = new ArrayList<String>();
		List<String> listaConO = new ArrayList<String>();
		listaString.add("Manolo");
		listaString.add("Osvaldo");
		listaString.add("Ana");
		listaString.add("Maria");
		listaString.add("Oriol");
		listaString.add("Susanna");
		listaString.add("Oriana");
		listaString.add("Juan");
		listaString.add("Pol");
		listaConO = listaString.stream().filter(s->s.contains("o")).filter(s->s.contains("O")).collect(Collectors.toList());
		System.out.println(listaConO.toString());

	}

	

}
