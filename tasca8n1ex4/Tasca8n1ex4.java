package tasca8n1ex4;

import java.util.ArrayList;



public class Tasca8n1ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<String> mesos = new ArrayList<String>();
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Desembre");
		
		mesos.forEach(System.out::println);
	}

}
