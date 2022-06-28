package tasca8n1ex3;

import java.util.ArrayList;

public class Tasca8n1ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> llistaMesos = new ArrayList<String>();

		llistaMesos.add("Gener");
		llistaMesos.add("Febrer");
		llistaMesos.add("Març");
		llistaMesos.add("Abril");
		llistaMesos.add("Maig");
		llistaMesos.add("Juny");
		llistaMesos.add("Juliol");
		llistaMesos.add("Agost");
		llistaMesos.add("Setembre");
		llistaMesos.add("Octubre");
		llistaMesos.add("Novembre");
		llistaMesos.add("Desembre");

		llistaMesos.forEach(s->System.out.println(s));
		
	}

}
