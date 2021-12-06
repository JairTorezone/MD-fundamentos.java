package md.basico.estruturarepeticao;

import br.com.softblue.commons.io.Console;

public class Main_While {

	public static void main(String[] args) {

		double nota = 0;
		int cont = 1;
		double soma = 0;

		while (true) {
			System.out.print("Digite a nota: " + cont + "; ");
			nota = Console.readDouble();

			if (nota == -1) {
				cont--;
				break;
			}

			cont++;
			soma += nota;
			System.out.println("(soma = " + soma + ")");
		}
		System.out.println();
		double media = soma / cont;

		System.out.println("Soma = " + soma);
		System.out.println("Média = " + media);

		System.out.println("Fim do programa");

	}

}
