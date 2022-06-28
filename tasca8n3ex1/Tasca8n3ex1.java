package tasca8n3ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tasca8n3ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Alumne> llista = new ArrayList<Alumne>();
		List<Alumne> llista2;
		add(llista);

//Mostra per pantalla el nom i l’edat de cada alumne/a. 

		llista.forEach(s -> {
			System.out.println("Nom: " + s.getNom() + " Edat: " + s.getEdat());
		});
		System.out.println();

// Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna
// a aquests alumnes a una altra llista i mostra per pantalla la nova llista
// (tot amb lambdes).

		llista2 = llista.stream().filter(s -> s.getNom().startsWith("A")).collect(Collectors.toList());
		llista2.forEach(s -> {
			System.out.println(s.toString());
		});
		System.out.println();

// Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.

		llista.stream().filter(s -> s.getNota() > 5).forEach(s -> System.out.println(s.toString()));
		System.out.println();

// Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que
// no són de PHP.

		llista.stream().filter(s -> s.getNota() > 5).filter(s -> s.getCurs() != "PHP")
				.forEach(s -> System.out.println(s.toString()));
		System.out.println();

// Mostra tots els alumnes que fan JAVA i són majors d’edat.

		llista.stream().filter(s -> s.getEdat() >= 18).filter(s -> s.getCurs().equalsIgnoreCase("Java"))
				.forEach(s -> System.out.println(s.toString()));
	}

	public static void add(List<Alumne> llista) {
		llista.add(new Alumne("Francisco", "Java", 50, 6));
		llista.add(new Alumne("Anna", "PHP", 19, 7));
		llista.add(new Alumne("Alfonso", "Data", 35, 7));
		llista.add(new Alumne("Oriana", "Node", 35, 1));
		llista.add(new Alumne("Boticaria", "Java", 11, 5));
		llista.add(new Alumne("Manolo", "Java", 17, 0));
		llista.add(new Alumne("Angustias", "Java", 60, 9));
		llista.add(new Alumne("Juan", "React", 19, 4));
		llista.add(new Alumne("Jaume", "JavaScript", 52, 8));
		llista.add(new Alumne("Zaida", "Java", 18, 7));

	}
}
