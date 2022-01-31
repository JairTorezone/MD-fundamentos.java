package md.basico.collections;

import java.util.Set;
import java.util.TreeSet;

public class Main_TreeSet {

	public static void main(String[] args) {
		Set<Character> alfabeto = new TreeSet<>();
		alfabeto.add('F');
		alfabeto.add('A');
		alfabeto.add('C');
		alfabeto.add('E');
		alfabeto.add('D');
		alfabeto.add('B');
		
		//System.out.println(alfabeto);
		
		Mes m1 = new Mes("Janeiro", 1);
		Mes m2 = new Mes("Fevereiro", 2);
		Mes m3 = new Mes("Maio", 5);
		Mes m4 = new Mes("Outurbo", 10);
		
		Set<Mes> meses = new TreeSet<>();
		meses.add(m1);
		meses.add(m2);
		meses.add(m3);
		meses.add(m4);
		
		System.out.println(meses);
	}

}
