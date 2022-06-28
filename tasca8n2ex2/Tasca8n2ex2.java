package tasca8n2ex2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Tasca8n2ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubç
		ArrayList<Integer> llista = new ArrayList<Integer>();
		String llista2;

		add(llista);

		llista2 = (String) llista.stream().map(s -> {
			if (s % 2 == 0) {
				return "e" + s.toString();
			} else {
				return "o" + s.toString();
			}
		}).collect(Collectors.toList()).toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");

		System.out.println(llista2);
	}

	public static void add(ArrayList<Integer> llista) {
		for (int i = 1; i < 100; i++) {
			llista.add(i);
		}

	}
}
