package ng.com.cc.app.entity.salesmanager;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
public class Orders implements Serializable {

	DimDate date_Of_Order;
	Custormer custormer;
	Collection<Order_Products> order_Products;
	private int id;
	private String order_details;

	@ManyToOne(optional=false)
	@JoinColumn(name="Date_Of_Order", referencedColumnName="DateKay", nullable=false)
	public DimDate getDate_Of_Order() {
		return this.date_Of_Order;
	}

	public void setDate_Of_Order(DimDate date_Of_Order) {
		this.date_Of_Order = date_Of_Order;
	}

	@ManyToOne(optional=false)
	@JoinColumn(name="Custormerid", referencedColumnName="id")
	public Custormer getCustormer() {
		return this.custormer;
	}

	public void setCustormer(Custormer custormer) {
		this.custormer = custormer;
	}

	@OneToMany(mappedBy="order")
	public Collection<Order_Products> getOrder_Products() {
		return this.order_Products;
	}

	public void setOrder_Products(Collection<Order_Products> order_Products) {
		this.order_Products = order_Products;
	}

	@Id
	@Column(name="id", nullable=false, length=10)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="Order_details")
	public String getOrder_details() {
		return this.order_details;
	}

	public void setOrder_details(String order_details) {
		this.order_details = order_details;
	}

}