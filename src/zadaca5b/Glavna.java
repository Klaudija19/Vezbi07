package zadaca5b;

import java.util.Set;
import java.util.TreeSet;

public class Glavna {
	
	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String> ();
		mnozestvo1.add("portokalova");
		mnozestvo1.add("zolta");
		mnozestvo1.add("zelena");

		Set<String> mnozestvo2 = new TreeSet<String> ();
		mnozestvo2.add("portokalova");
		mnozestvo2.add("zolta");
		mnozestvo2.add("crvena");

		System.out.println("Unija od dvete mnozhestva");
		mnozestvo1.addAll(mnozestvo2);
		System.out.println(mnozestvo1);
	}
}

