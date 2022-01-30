package md.basico.collections;

import java.util.HashSet;
import java.util.Set;

public class Main_Set {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(1);
		numeros.add(10);
		numeros.add(2);
		numeros.add(22);
		numeros.add(2);
		
		for (Integer n : numeros) {
			System.out.println("=> " + n);
		}
	}

}
