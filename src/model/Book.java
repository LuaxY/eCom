package model;

public class Book
{
	private String name;
	private String description;
	private double price;
	private int quantity;
	private String imageLink;
	
	public Book(String name, String description, double price, int quantity, String imageLink) {
		super();
		this.name        = name;
		this.description = description;
		this.price       = price;
		this.quantity    = quantity;
		this.imageLink   = imageLink;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", description=" + description + ", price=" + price + ", quantity=" + quantity
				+ ", imageLink=" + imageLink + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	
}
