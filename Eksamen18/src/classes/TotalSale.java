package classes;

public class TotalSale {

	private int totalSale_id;
	private int totalSale_totalPrice;
	private int totalSale_user_id;
	private int totalSale_date;

	public TotalSale(int totalSale_id, int totalSale_totalPrice, int totalSale_user_id, int totalSale_date) {
		this.totalSale_id = totalSale_id;
		this.totalSale_totalPrice = totalSale_totalPrice;
		this.totalSale_user_id = totalSale_user_id;
		this.totalSale_date = totalSale_date;
	}

	public int getTotalSale_id() {
		return totalSale_id;
	}

	public int getTotalSale_totalPrice() {
		return totalSale_totalPrice;
	}

	public int getTotalSale_user_id() {
		return totalSale_user_id;
	}

	public int getTotalSale_date() {
		return totalSale_date;
	}

}
