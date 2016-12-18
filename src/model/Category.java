package model;

public class Category {

	private String name;
	private String description;
	private String imageLink;
	
	public Category(String name, String description, String imageLink) {
		super();
		this.name        = name;
		this.description = description;
		this.imageLink   = imageLink;
	}
	
	@Override
	public String toString() {
		return "Category [name=" + name + ", description=" + description + ", imageLink=" + imageLink + "]";
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
	
	public String getImageLink() {
		return imageLink;
	}
	
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
}
