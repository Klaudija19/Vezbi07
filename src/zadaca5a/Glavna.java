package zadaca5a;

import java.util.Set;
import java.util.TreeSet;

public class Glavna {
	
	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String> ();
		mnozestvo1.add("Portokalova");
		mnozestvo1.add("Bela");
		mnozestvo1.add("Zolta");

		Set<String> mnozestvo2 = new TreeSet<String> ();
		mnozestvo2.add("Portokalova");
		mnozestvo2.add("Crvena");
		mnozestvo2.add("Zolta");

		System.out.println("Presek od dvete mnozestva");
		mnozestvo1.retainAll(mnozestvo2);
		System.out.println(mnozestvo1);

	}
}

