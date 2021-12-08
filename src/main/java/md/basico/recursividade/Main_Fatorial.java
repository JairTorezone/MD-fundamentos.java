package md.basico.recursividade;

public class Main_Fatorial {

	public static void main(String[] args) {
		
		int x = fatorial(5);
		System.out.println("Fatorial é " + x);
	}
	
	public static int fatorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * fatorial(n - 1);
	}

}
