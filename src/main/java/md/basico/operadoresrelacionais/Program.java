package md.basico.operadoresrelacionais;

import br.com.softblue.commons.io.Console;

public class Program {

	public static void main(String[] args) {
		
		System.out.print("Número 1: ");
		int n1 = Console.readInt();
		
		System.out.print("Número 2: ");
		int n2 = Console.readInt();
		
		boolean igual = n1 == n2;
		System.out.println("Iguais? " + igual);
		
		boolean diferentes = n1 != n2;
		System.out.println("Diferentes? " + diferentes);
		
		boolean maiorIgual = n1 >= n2;
		System.out.println(n1 + " Maior igual que "+ n2 +"? "+ maiorIgual);
		
		boolean menorIgual = n1 <= n2;
		System.out.println(n1 + " Menor igual que "+ n2 +"? " + menorIgual);
		
		
	}

}
