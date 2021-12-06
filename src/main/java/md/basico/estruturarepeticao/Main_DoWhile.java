package md.basico.estruturarepeticao;

import br.com.softblue.commons.io.Console;

public class Main_DoWhile {

	public static void main(String[] args) {
		
		double nota;
		int cont = 1;
		double soma = 0;
		
		do {
			System.out.println("Digite a nota: "+ cont++ + ":");
			nota = Console.readDouble();
			
			if(nota != -1) {
				soma += nota;
				System.out.println("(soma = " + soma + ")");
			}
			
			
		} while (nota != -1);
		double media = soma / (cont -2);
		
		System.out.println("Soma = " + soma);
		System.out.println("Média = "+ media);
		
		System.out.println("Fim do programa");
	}
	
}
