package classes;

public class Car extends Product {

	private String brand, model, drive;
	private long capacity;
	private long product_year;
	
	public Car(String brand, String model, String drive, long price, String description) {
		super("car", price, description);
		this.brand = brand;
		this.brand = model;
		this.brand = drive;
		
	}
	
	//getter and setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getProduct_year() {
		return product_year;
	}

	public void setProduct_year(long product_year) {
		this.product_year = product_year;
	}

	public long getCapacity() {
		return capacity;
	}

	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}

	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}
}
