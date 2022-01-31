package md.basico.lambda;

public class Main_InterfaceFuncional {

	public static void main(String[] args) {
		Operator op =(x,y) -> x * y;
		System.out.println(op.execute(5, 2));
	}

}
