package ng.com.cc.app.entity.salesmanager;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
public class Product implements Serializable {

	Product_Types product_TypesProduct_Type_Code;
	Ref_Unit_Of_Measurment uOM_Code;
	Collection<Order_Products> order_Products;
	Collection<Daily_Inventory_Levels> daily_Inventory_Levels;
	Collection<Stroes_Product_Prices> stroes_Product_Prices;
	private int id;
	private String product_Name;
	private Double unit_Price;
	private String product_description;
	private Integer reorder_Level;
	private Integer reorder_Quanty;
	private Integer column;

	@ManyToOne(optional=false)
	@JoinColumn(name="Product_TypesProduct_Type_Code", referencedColumnName="Product_Type_Code")
	public Product_Types getProduct_TypesProduct_Type_Code() {
		return this.product_TypesProduct_Type_Code;
	}

	public void setProduct_TypesProduct_Type_Code(Product_Types product_TypesProduct_Type_Code) {
		this.product_TypesProduct_Type_Code = product_TypesProduct_Type_Code;
	}

	@ManyToOne(optional=false)
	@JoinColumn(name="UOM_Code", referencedColumnName="UOM_Code", nullable=false)
	public Ref_Unit_Of_Measurment getUOM_Code() {
		return this.uOM_Code;
	}

	public void setUOM_Code(Ref_Unit_Of_Measurment uOM_Code) {
		this.uOM_Code = uOM_Code;
	}

	@OneToMany(mappedBy="product")
	public Collection<Order_Products> getOrder_Products() {
		return this.order_Products;
	}

	public void setOrder_Products(Collection<Order_Products> order_Products) {
		this.order_Products = order_Products;
	}

	@OneToMany(mappedBy="product")
	public Collection<Daily_Inventory_Levels> getDaily_Inventory_Levels() {
		return this.daily_Inventory_Levels;
	}

	public void setDaily_Inventory_Levels(Collection<Daily_Inventory_Levels> daily_Inventory_Levels) {
		this.daily_Inventory_Levels = daily_Inventory_Levels;
	}

	@OneToMany(mappedBy="product")
	public Collection<Stroes_Product_Prices> getStroes_Product_Prices() {
		return this.stroes_Product_Prices;
	}

	public void setStroes_Product_Prices(Collection<Stroes_Product_Prices> stroes_Product_Prices) {
		this.stroes_Product_Prices = stroes_Product_Prices;
	}

	@Id
	@Column(name="id", nullable=false, length=10)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="Product_Name")
	public String getProduct_Name() {
		return this.product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	@Column(name="Unit_Price")
	public Double getUnit_Price() {
		return this.unit_Price;
	}

	public void setUnit_Price(Double unit_Price) {
		this.unit_Price = unit_Price;
	}

	@Column(name="Product_description")
	public String getProduct_description() {
		return this.product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	@Column(name="Reorder_Level", length=10)
	public Integer getReorder_Level() {
		return this.reorder_Level;
	}

	public void setReorder_Level(Integer reorder_Level) {
		this.reorder_Level = reorder_Level;
	}

	@Column(name="Reorder_Quanty", length=10)
	public Integer getReorder_Quanty() {
		return this.reorder_Quanty;
	}

	public void setReorder_Quanty(Integer reorder_Quanty) {
		this.reorder_Quanty = reorder_Quanty;
	}

	@Column(name="Column", length=10)
	public Integer getColumn() {
		return this.column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

}