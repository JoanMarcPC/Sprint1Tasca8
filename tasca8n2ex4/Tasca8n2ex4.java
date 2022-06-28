package tasca8n2ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tasca8n2ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> llista = new ArrayList<String>();

		add(llista);

		// Alfab�ticament pel primer car�cter. (Nota: charAt(0) retorna el codi num�ric
		// del primer car�cter)
		llista.sort((s1, s2) -> {
			return (int) s1.charAt(0) - (int) s2.charAt(0);
		});
		System.out.println(llista.toString());

		// Les cadenes que contenen una "e" primer, la resta de cadenes despr�s. Posa el
		// codi directament a la lambda.
		llista.sort((s1, s2) -> {
			if ((int) s1.charAt(0) == 101 && (int) s2.charAt(0) != 101) { // int de char lletra e =101
				return -1;
			} else if ((int) s1.charAt(0) != 101 && (int) s2.charAt(0) == 101) {
				return 1;
			} else {
				return 0;
			}
		});
		System.out.println(llista.toString());
		// Modifica tots els elements de la llista que tenen una �a�. Modifica la �a�
		// per un �4�.

		llista = llista.stream().map(s -> s = s.replaceAll("a", "4")).collect(Collectors.toList());
		System.out.println(llista);

		// Mostra nom�s els elements que s�n num�rics. (Encara que estiguin guardats com
		// Strings).

		llista = llista.stream().filter(s -> s.matches("[+-]?\\d*(\\.\\d+)?")).collect(Collectors.toList()); // sincerament
																												// no se
																												// que
																												// es
																												// aixo:
																												// "[+-]?\\d*(\\.\\d+)?"
																												// but
																												// it
																												// works!
		System.out.println(llista);

	}

	public static void add(List<String> llista) {
		llista.add("4");
		llista.add("ezequiel");
		llista.add("alabala");
		llista.add("434536");
		llista.add("445645756");
		llista.add("586344");
		llista.add("44534");
		llista.add("25354");
		llista.add("3454");
		llista.add("elbrus");
		llista.add("antananaribo");
		llista.add("amposta");
		llista.add("empire state");
		llista.add("exit");
		llista.add("help");
		llista.add("please");
		llista.add("hate");
		llista.add("java");

	}
}
