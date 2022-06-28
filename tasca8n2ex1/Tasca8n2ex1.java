package tasca8n2ex1;

import java.util.ArrayList;
import java.util.List;

public class Tasca8n2ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> llista = new ArrayList<String>();
		add(llista);

		llista.forEach(name -> {
			if (name.startsWith("A") && name.length() == 3) {
				System.out.println(name);
			}
		});

		// que retorni una llista, ok
		List<String> llista2 = llista.stream().filter(s -> s.startsWith("A")).filter(s -> s.length() == 3).toList();
		System.out.println(llista2);
	}

	public static void add(ArrayList<String> llista) {
		llista.add("Ana");
		llista.add("Ama");
		llista.add("Astrid");
		llista.add("Anna");
		llista.add("Bilbo");
		llista.add("Bob");
		llista.add("Tom");
		llista.add("Tod");
		llista.add("Dad");
		llista.add("All");
		llista.add("Francesco");
		llista.add("Jaime");
		llista.add("Antonio");
		llista.add("Ant");
	}
}
