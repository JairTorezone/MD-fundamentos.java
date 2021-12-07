package md.basico.array;

public class Main_bubleSort {

	public static void main(String[] args) {

		int[] valores = {3, 2, 5, 6, 1, 0, 4,7,19,9,8};
		
		for (int i = 0; i < valores.length - 1; i++) {
			for (int j = i + 1; j < valores.length; j++) {
				
				if(valores[i] > valores[j]) {
					int aux = valores[i];
					valores[i] = valores[j];
					valores[j] = aux;
				}
			}
		}
		
		for (int valor : valores) {
			System.out.print(valor + " ");
		}
	}
	
	//PROXI 3.14

}
