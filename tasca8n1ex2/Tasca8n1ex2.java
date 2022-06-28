package tasca8n1ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tasca8n1ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listaString = new ArrayList<String>();
		List<String> listaFiltrada = new ArrayList<String>();
		listaString.add("Manolo");
		listaString.add("Osvaldo");
		listaString.add("Ana");
		listaString.add("Maria");
		listaString.add("Oriol");
		listaString.add("Susanna");
		listaString.add("Oriana");
		listaString.add("Juan");
		listaString.add("Pol");
		listaFiltrada = listaString.stream().filter(s->s.contains("o")).filter(s->s.contains("O")).filter(s->s.length()>5).collect(Collectors.toList());
		listaFiltrada.forEach(a->System.out.println(a));

	}

}
