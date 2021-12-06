package md.basico.operadoresrelacionais;

public class Main_OperadoresLogico {

	public static void main(String[] args) {
		
		//TABELA VERDADE E == TODAS AS CONDIÇÕES VERDADEIRO
		boolean a = false;
		boolean b = !a;
		System.out.println(b);
		
		//TABELA VERDADE OU == PELO MENOS UMA CONDIÇÃO VERDEIRA
		boolean c = false;
		boolean d = false;
		System.out.println(c || d);
	}

}
