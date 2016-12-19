package controller;

import java.util.List;
import java.util.Vector;
import storage.Dao;
import storage.DaoFactory;
import model.Book;

public class ShopController {

	private List<Book> books;
	private static ShopController instance = new ShopController();
	
	public static ShopController getInstance() {
		return instance;
	}
	
	private ShopController() {
		//books = new Vector<>();
		init();
	}
	
	private void init() {
		DaoFactory daoFactory = DaoFactory.getInstance();
		Dao<Book> dao = (Dao<Book>) daoFactory.getDao();
		books = (List<Book>) dao.readAll();
	}
}
