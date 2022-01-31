package md.basico.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main_lambda {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 4, 2));
		
		//NumberComparator comparator = new NumberComparator();
		
//		Comparator<Integer> comparator = new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return -o1.compareTo(o2);
//			}
//		};
		
		numbers.sort((o1, o2) -> -o1.compareTo(o2));
		
		System.out.println(numbers);
		
	}

}
