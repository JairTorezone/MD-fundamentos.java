package md.basico.metodo;

public class Main_Fibonnaci {

	public static void main(String[] args) {
	
		calcularFibonnaci(10, ", ");
		calcularFibonnaci(8, " - ");
		System.out.println();
		
		int[] valores = calcularFibonnaci(10);
		for(int v: valores){
			System.out.print(v + "::");
		}
	}
	
	//MÉTODO VOID COM DOIS PARÂMENTROS
	public static void calcularFibonnaci(int number, String separador) {
		System.out.println("Fibonnaci do número: " + number);
		
		for(int cont = 0, i = 0, j = 1; cont < number; cont++) {
			if(cont < number -1) {
				System.out.print(i + separador);	
			}else {
				System.out.print(i + " ");
			}
			
			i = i + j;
			j = i - j;
		}
		System.out.println();
		System.out.println();
		System.out.println("******** Fim programa ************");
	}
	
	
	//MÉTODO COM RETORNO ARRAY
	public static int[] calcularFibonnaci(int vezes) {
		int[] arrays = new int[vezes];
		for(int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			i = i + j;
			j = i - j;
			
			arrays[cont] = i;
		}
		
		return arrays;
	}
}
