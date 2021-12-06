package md.basico.operadoresaritmeticos;

import br.com.softblue.commons.io.Console;

public class Main_baskara {

	public static void main(String[] args) {
		
		System.out.print("a: ");
		int a = Console.readInt();
		
		System.out.print("b: ");
		int b = Console.readInt();
		
		System.out.print("c: ");
		int c = Console.readInt();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		//proxima aula 3.5
	}

}
