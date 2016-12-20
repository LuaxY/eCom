package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {
	
	private static Cart instance = new Cart();
	private Map<Book, Integer> products;
	private double SHIPPING = 20;
	
	public static Cart getInstance() {
		return instance;
	}
	
	public Cart() {
		products = new HashMap<>();
	}
	
	public void addProduct(Book book) {
		if (products.containsKey(book)) {
			products.put(book, products.get(book) + 1);
		} else {
			products.put(book, 1);
		}
	}
	
	public void removeProduct(Book book) {
		products.remove(book);
	}
	
	public double getTotal() {
		double total = 0.0;
		
		for (Entry<Book, Integer> product : products.entrySet()) {
			Integer quantity = product.getValue();
			double price = product.getKey().getPrix();
			total += price * quantity;
		}
		
		total += SHIPPING;
		
		return total;
	}
}
