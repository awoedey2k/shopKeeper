package ng.com.cc.app.entity.salesmanager;

import javax.persistence.*;
import java.io.*;

@Entity
public class Order_Products implements Serializable {

	Product product;
	Orders order;
	private int order_Item_Id;
	private Integer product_Quantity;

	@ManyToOne(optional=false)
	@JoinColumn(name="Product_ID", referencedColumnName="id", nullable=false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne(optional=false)
	@JoinColumn(name="Order_id", referencedColumnName="id", nullable=false)
	public Orders getOrder() {
		return this.order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	@Id
	@Column(name="Order_Item_Id", nullable=false, length=10)
	public int getOrder_Item_Id() {
		return this.order_Item_Id;
	}

	public void setOrder_Item_Id(int order_Item_Id) {
		this.order_Item_Id = order_Item_Id;
	}

	@Column(name="Product_Quantity", length=10, scale=4)
	public Integer getProduct_Quantity() {
		return this.product_Quantity;
	}

	public void setProduct_Quantity(Integer product_Quantity) {
		this.product_Quantity = product_Quantity;
	}

}