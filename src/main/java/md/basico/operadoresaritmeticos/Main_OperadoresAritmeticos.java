package md.basico.operadoresaritmeticos;

import br.com.softblue.commons.io.Console;

public class Main_OperadoresAritmeticos {

	public static void main(String[] args) {
		
		System.out.print("Digite o nome: ");
		String name = Console.readString();
		
		System.out.print("Digite o sobrenome: ");
		String sobrenome = Console.readString();
		
		System.out.println();
		
		String nomeSobrenome = name + " " +sobrenome;
		System.out.println(nomeSobrenome);
	}

}
