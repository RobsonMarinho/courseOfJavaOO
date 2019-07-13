package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Product productest;

	public Order(Date date, Product productest) {
		super();
		this.date = date;
		this.productest = productest;
		this.productest.name = "TV";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProductest() {
		return productest;
	}

	public void setProductest(Product productest) {
		this.productest = productest;
	}

}
