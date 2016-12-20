package controller;

import java.util.List;
import java.util.Vector;
import storage.Dao;
import storage.DaoFactory;
import model.Book;
import model.Cart;

public class ShopController {

	private List<Book> books;
	private static ShopController instance = new ShopController();
	private Cart cart;
	
	public static ShopController getInstance() {
		return instance;
	}
	
	private ShopController() {
		cart = Cart.getInstance();
		
		init();
	}
	
	private void init() {
		DaoFactory daoFactory = DaoFactory.getInstance();
		Dao<Book> dao = (Dao<Book>) daoFactory.getDao();
		books = (List<Book>) dao.readAll();
	}
	
	public void buyAllBooks() {
		for (Book book : books) {
			cart.addProduct(book);
		}
	}
	
	public double getTotalPrice() {
		return cart.getTotal();
	}
}
