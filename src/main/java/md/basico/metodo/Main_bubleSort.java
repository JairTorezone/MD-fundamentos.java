package md.basico.metodo;

public class Main_bubleSort {

	public static void main(String[] args) {

		int[] valores = { 3, 2, 5, 6, 1, 13, 4, 7, 19, 9, 8 };

		System.out.print("Array: ");
		imprimirArray(valores);

		System.out.print("Sort:  ");
		calcularBubleSort(valores);
	}

	// Método BubleSort
	public static void calcularBubleSort(int valores[]) {
		for (int i = 0; i < valores.length - 1; i++) {
			for (int j = i + 1; j < valores.length; j++) {

				if (valores[i] > valores[j]) {
					int aux = valores[i];
					valores[i] = valores[j];
					valores[j] = aux;
				}
			}
		}
		for (int valor : valores) {
			System.out.print(valor + " ");
		}

		System.out.println();
		System.out.println("******** Fim programa ********");
	}

	// Imprimir um array
	public static void imprimirArray(int valores[]) {
		for (int valor : valores) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
}
