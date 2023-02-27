package week2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestingStream {

	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<Integer>();
		
		for(int i = 0; i <= 10; i+=2) {
			test.add(i);
		}
		System.out.println(test);
		
		System.out.println(test.stream().filter(e -> e % 3 == 0 || e % 5 == 0).collect(Collectors.toList()));
//		test.stream().filter(e -> e % 3 == 0 || e % 5 == 0).forEach(e -> System.out.println(e));
	}

}
