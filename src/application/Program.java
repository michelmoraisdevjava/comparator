package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//Usando Comparator com expressão lambda sem chaves
		Collections.sort(list, (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())
		);
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
