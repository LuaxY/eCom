package model;

import javax.persistence.*;

@Entity
@Table(name = "produit")
@NamedQueries({
	@NamedQuery(name = "book.all",  query = "SELECT book FROM Book as book"),
	@NamedQuery(name = "book.find", query = "SELECT book FROM Book as book WHERE book.id = :key"),
})

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nom;
	private String description;
	private double prix;
	private int qte;
	private String image;
	
	@ManyToOne
    @JoinColumn(name = "cat_id")
	private Category cat_id;
	
	public Book() {
		
	}
	
	public Book(String nom, String description, double prix, int qte, String image) {
		super();
		this.nom         = nom;
		this.description = description;
		this.prix        = prix;
		this.qte         = qte;
		this.image       = image;
	}

	@Override
	public String toString() {
		return "Book [nom=" + nom + ", description=" + description + ", prix=" + prix + ", qte=" + qte
				+ ", image=" + image + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCat_id() {
		return cat_id;
	}

	public void setCat_id(Category cat_id) {
		this.cat_id = cat_id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String name) {
		this.nom = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double price) {
		this.prix = price;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int quantity) {
		this.qte = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String imageLink) {
		this.image = imageLink;
	}
	
}
