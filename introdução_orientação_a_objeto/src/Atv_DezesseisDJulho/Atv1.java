package Atv_DezesseisDJulho;

import java.util.ArrayList;
import java.util.List;


public class Atv1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		for (int i = 0; i < 5; i++) {
			System.out.println("Elemento: " + list.get(i));
		}

	}

}
