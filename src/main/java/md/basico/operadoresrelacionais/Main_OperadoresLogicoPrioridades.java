package md.basico.operadoresrelacionais;

public class Main_OperadoresLogicoPrioridades {

	public static void main(String[] args) {
		
		boolean v = false;
		
		boolean x = 5 * 3 + Math.sqrt(7 * 7) <= 100 || !v && v;
		System.out.println(x);
		
		// COM V = TRUE
		/* x = 5 * 3 + Math.sqrt(7 * 7) <= 100 OU NÃO v E v;
		 * x = 15 + Math.sqrt(49) <= 100 OU NÃOv E v;
		 * x = 15 + 7 <= 100 ou NÃO true e true;
		 * x = 22 <= 100 ou FALSE e true;
		 * x = TRUE ou FALSE;
		 * x = TRUE;
		*/ 
		
		//-------------------------------------------------------
		// COM V = FALSE
		/* x = 5 * 3 + Math.sqrt(7 * 7) <= 100 OU NÃO v E v;
		 * x = 15 + Math.sqrt(49) <= 100 OU NÃOv E v;
		 * x = 15 + 7 <= 100 ou NÃO FALSE e FALSE;
		 * x = 22 <= 100 ou TRUE e FALSE;
		 * x = TRUE ou FALSE;
		 * x = TRUE;
		*/ 
	}

}
