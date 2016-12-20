package model;

import javax.persistence.*;

@Entity
@Table(name = "categorie")
@NamedQueries({
	@NamedQuery(name = "category.all",  query = "SELECT category FROM Category as category"),
	@NamedQuery(name = "category.find", query = "SELECT category FROM Category as category WHERE category.id = :key"),
})

public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nom;
	private String description;
	private String image;
	
	public Category() {
		
	}
	
	public Category(String name, String description, String image) {
		super();
		this.nom         = name;
		this.description = description;
		this.image       = image;
	}
	
	@Override
	public String toString() {
		return "Category [name=" + nom + ", description=" + description + ", image=" + image + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
}
