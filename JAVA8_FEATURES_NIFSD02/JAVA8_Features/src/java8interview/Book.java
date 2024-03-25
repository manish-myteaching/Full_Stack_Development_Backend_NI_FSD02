package java8interview;

//Pojo
public class Book {
	private String id;
	private String name;
	private String author;
	private Double cost;

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Book(String id, String name, String author, Double cost) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public Double getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", cost=" + cost + "]";
	}
	

}
