package md.basico.collections;

import java.util.ArrayList;
import java.util.List;

public class Main_ArrayList {

	public static void main(String[] args) {
		
		List<String> listaMercado = new ArrayList<>();
		
		//Adicionar itens
		listaMercado.add("Arroz");
		listaMercado.add("Feijão");
		listaMercado.add("Macarrão");
		listaMercado.add("ovo");
		listaMercado.add("Sal");
		
		//Imprimir toString
		System.out.println(listaMercado);
		System.out.println();
		
		//Imprimir For-each
		for (String item : listaMercado) {
			System.out.println("item: " + item);
		}
		
		System.out.println();
		System.out.println(listaMercado.get(3));
		
		//Imprimir for normal
		for (int i = 0; i < listaMercado.size(); i++) {
			System.out.println("item => " + listaMercado.get(i));
		}
		
		//Remover macarrão
		listaMercado.remove(2);
		System.out.println(listaMercado);
		
		
		//Remover sal
		listaMercado.remove("Sal");
		System.out.println(listaMercado);
		System.out.println();
		
		System.out.println("Contem ovo: "+ listaMercado.contains("ovo"));
		System.out.println("Posição ovo: "+ listaMercado.indexOf("ovo"));
		
	}

}
