package md.basico.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main_Maps {

	public static void main(String[] args) {
		Map<Integer, String> meses = new HashMap<>();
		
		meses.put(1, "Janeiro");
		meses.put(2, "Fevereiro");
		meses.put(6, "Junho");
		meses.put(9, "Setembro");
		meses.put(12, "Dezembro");
		
		System.out.println(meses);
		
		String m1 = meses.get(1);
		System.out.println(m1);
		
		//Retorna só as chaves mapas
		Set<Integer> numeros = meses.keySet();
		System.out.println(numeros);
		
		//Retorna só os valores mapas
		Collection<String> nomes = meses.values();
		System.out.println(nomes);
		
		//Retornando as chaves e o valores
		Set<Map.Entry<Integer, String>> entrys = meses.entrySet();
		
		for(Map.Entry<Integer, String> entry: entrys) {
			System.out.println(entry.getKey() + " => "+ entry.getValue());
		}
		
		
	}

}
