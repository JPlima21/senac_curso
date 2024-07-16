package Atv_DezesseisDJulho;

import java.util.ArrayList;
import java.util.List;

public class Atv4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.set(3, 10);
		
		System.out.println(list);
		
	}

}
