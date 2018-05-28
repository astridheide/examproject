package classes;


	public class Product {
		   private long product_id;
		   
		   private String brand;
		   
		   private String model;
		   
		   private String product_type;
		   
		   private long product_year;
		   
		   private long capacity;
		   
		   private String drive;
		   
		   private long price; 
		   
		   private String description; 
		   
		   //private Owner owner
		   	
		   //Bil constructor med ID
		   public Product (long product_id, String brand, String model, String product_type,
				   		long product_year, long capacity, String drive, long price, String description) { //Owner owner
		      this.product_id = product_id;
		      this.brand = brand;
		      this.model = model;
		      this.product_type = product_type;
		      this.product_year = product_year;
		      this.capacity = capacity;
		      this.drive = drive;
		      this.price = price; 
		     this.description = description;
		     // this.owner = owner;
		      //
		   }
		   
		   //Bil constructor uden ID
		   public Product (String brand, String model, String product_type,
			   		long product_year, long capacity, String drive, long price, String description) { //Owner owner
	     
	     this.brand = brand;
	     this.model = model;
	     this.product_type = product_type;
	     this.product_year = product_year;
	     this.capacity = capacity;
	     this.drive = drive;
	     this.price = price;
	     this.description = description;
	   
	    // this.owner = owner;
	     //
	  }

		 //Tilbehør constructor uden ID
		   public Product (String brand, long price, String description) {
			   this.brand = brand;
			   this.price = price;
			   this.description = description;
		   }
		   
		 //Tilbehør constructor med ID
		   
		   public Product (Long id, String brand, Long price, String description) {
			   this.product_id = id;
			   this.brand = brand;
			   this.price = price;
			   this.description = description;
		   }
		   
		public long getProduct_id() {
			return product_id;
		}

		public void setProduct_id(long product_id) {
			this.product_id = product_id;
		}

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

		public String getProduct_type() {
			return product_type;
		}

		public void setProduct_type(String product_type) {
			this.product_type = product_type;
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

		public long getPrice() {
			return price;
		}

		public void setPrice(long price) {
			this.price = price;
		}
		/*
	    public String getDescription(String description) {
	    	return this.description = description; 
	    } 
	    public String setDescription(String description) {
	    	return this.description = description; 
	    }
*/
		public String getDescription() {
			return description;
		} 

		public String setDescription() {
			return description;
		} 
		   

		  /* public Owner getOwner() {
		      return owner;
		   }*/

	}

