package classes;

public class Product {
	private long product_id;
	private String product_type;
	private long price;
	private String description;

	
	public Product() {
	}
	
	//Car constructor with id
	public Product(long product_id) {
		this.product_id = product_id;
	}

	public Product(String product_type, long price, String description) {
		this.product_type = product_type;
		this.price = price;
		this.description = description;
	}


	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	
	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public String setDescription() {
		return description;
	}

}
