package md.basico.array;

import br.com.softblue.commons.io.Console;

public class Program {

	public static void main(String[] args) {
		
		double[] notas = new double[3];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i +1) + ": ");
			double nota = Console.readDouble();
			notas[i] = nota;
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}

}
