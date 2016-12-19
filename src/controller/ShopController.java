package controller;

import java.util.List;
import java.util.Vector;
import storage.Dao;
import storage.DaoFactory;

public class ShopController {

	private List<ManagedBook> books;
	private static ShopController instance = new ShopController();
	
	public static ShopController getInstance() {
		return instance;
	}
	
	private ShopController() {
		books = new Vector<>();
		
		init();
	}
	
	private void init() {
		DaoFactory daoFactory = DaoFactory.getInstance();
		Dao<BookPOJO> dao = (Dao<BookPOJO>) daoFactory.getDao();
		List<BookPOJO> bookPOJOs = (List<BookPOJO>) dao.readAll();
		
		for (BookPOJO bookPOJO : bookPOJOs) {
			books.add(new ManagedBook(bookPOJO.getId(), dao));
		}
	}
}
