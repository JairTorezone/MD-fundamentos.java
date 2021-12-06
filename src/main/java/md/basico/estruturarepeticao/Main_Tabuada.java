package md.basico.estruturarepeticao;

import br.com.softblue.commons.io.Console;

public class Main_Tabuada {

	public static void main(String[] args) {
		
		System.out.print("Digite um número: ");
		int x = Console.readInt();
		
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + " x " + i + " = " + (i*x));
		}
	}

}
