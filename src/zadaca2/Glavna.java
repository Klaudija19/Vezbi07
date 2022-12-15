package zadaca2;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
	
	public static void main(String[] args) {
		MetodiZaListaNiza m = new MetodiZaListaNiza();
		List<String> lista = new ArrayList<String>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		m.listToArray(lista);

		String [] niza = {"a","b","c"};
		m.arrayToList(niza);
	}
}
	

