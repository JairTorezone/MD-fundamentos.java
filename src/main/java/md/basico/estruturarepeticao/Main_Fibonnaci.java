package md.basico.estruturarepeticao;

public class Main_Fibonnaci {

	public static void main(String[] args) {

		int vezes = 10;
		
		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + " ");

			i = i + j; // CALCULA O PRÓXIMO NÚMERO
			j = i - j; // CALCULA O NÚMERO ANTERIOR
		}
	}

}
