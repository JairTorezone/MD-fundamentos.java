package md.basico.lambda;

import java.util.stream.Collectors;

public class Main_Concatenar {

	public static void main(String[] args) {
		
		String bcdario = "ACBA";
		
		// -> 1-3-2-1 <-
		
		String result = bcdario.chars()
				.map(i -> i - 64)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining("-", "=>> ", " <<="));
		
		System.out.println(result);
	}

}
