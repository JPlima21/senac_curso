package Atv_DezesseisDJulho;

import java.util.ArrayList;
import java.util.List;

public class Atv3 {
	public static void main(String[] args) {
		List<String> listFruta = new ArrayList<>();
		listFruta.add("Morango");
		listFruta.add("Uva");
		listFruta.add("Maçã");
		listFruta.add("Laranja");
		listFruta.add("Tanjerina");
		
		listFruta.remove(1);
		
		System.out.println(listFruta);
	
	}

}
