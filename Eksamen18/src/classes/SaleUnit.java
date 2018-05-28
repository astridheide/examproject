package classes;

import classes.Product;
import classes.User;

	public class SaleUnit {
		private int saleunit_id;
		private int saleunit_product_id;
		private int saleunit_totalsale_id;
		private User user; //XXX
		private Product product; //XXX
		private int saleunit_amount;
		private int	saleunit_price;
		

		public SaleUnit(int saleunit_id, int saleunit_product_id, int saleunit_totalsale_id,  
				 int saleunit_amount, int saleunit_price) {
			this.saleunit_id = saleunit_id;
			this.saleunit_product_id = saleunit_product_id;
			this.saleunit_totalsale_id = saleunit_totalsale_id;
			this.saleunit_amount = saleunit_amount;
			this.saleunit_price = saleunit_price;
					
			//
		}
		
		public SaleUnit(User user, Product product, int saleunit_id) {
			this.user = user; //XXX
			this.product = product; //XXX
			this.saleunit_id = saleunit_id;
		}

		public int getSaleunit_id() {
			return saleunit_id;
		}
		
		public int getSaleunit_product_id() {
			return saleunit_product_id;
		}

		public int getSaleunit_totalsale_id() {
			return saleunit_totalsale_id;
		}
		
		public User getUser() { //XXX
			return user; 
		}
		
		public Product getProduct() { //XXX
			return product;
		}

		public int getSaleunit_amount() {
			return saleunit_amount;
		}

		public int getSaleunit_price() {
			return saleunit_price;
		}

		

	}
	

