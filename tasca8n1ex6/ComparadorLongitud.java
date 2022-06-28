package tasca8n1ex6;

import java.util.Comparator;

// Si no tinguessim les lambda, hauria d'haver fet això
public class ComparadorLongitud implements Comparator<String> {

	public int compare(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return 1;
		} else if (s1.length() < s2.length()) {
			return -1;
		} else {
			return 0;
		}

	}
}
