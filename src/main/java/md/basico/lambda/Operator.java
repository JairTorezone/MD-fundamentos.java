package md.basico.lambda;

@FunctionalInterface
public interface Operator {

	int execute (int x, int y);
	//int soma ();
	
	default void say() {
		System.out.println("I am the operator");
	}
}
