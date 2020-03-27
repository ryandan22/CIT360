package examples;

public class Inventory {

	private String id;
	private String name;
	private String description;
	private String location;
	private double price;
	private double stock;
	private int weight;
	private int size;

	public Inventory() {
	}

	public Inventory(String id, String name, String description, String location, double price, double stock,
			int weight, int size) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.location = location;
		this.price = price;
		this.stock = stock;
		this.weight = weight;
		this.size = size;
	}

	public Inventory(String name, String description, String location, double price, double stock, int weight,
			int size) {
		this.name = name;
		this.description = description;
		this.location = location;
		this.price = price;
		this.stock = stock;
		this.weight = weight;
		this.size = size;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", description=" + description + ", location=" + location
				+ ", price=" + price + ", stock=" + stock + ", weight=" + weight + ", size=" + size + "]";
	}


}