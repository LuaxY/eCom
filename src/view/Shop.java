package view;

import controller.ShopController;

public class Shop
{
	public void init() {
		ShopController.getInstance();
		
		System.out.println("Bienvenue dans la librarie en ligne eCom");
	}
	
	public void buyAllBooks() {
		System.out.println("Ajout de tout les livre dans le panier");
		ShopController.getInstance().buyAllBooks();
	}
	
	public void displayTotalPrice() {
		System.out.println("Prix total du panier : " + ShopController.getInstance().getTotalPrice() + " Euros");
	}
}
