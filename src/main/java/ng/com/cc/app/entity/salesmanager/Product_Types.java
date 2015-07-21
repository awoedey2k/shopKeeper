package ng.com.cc.app.entity.salesmanager;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
public class Product_Types implements Serializable {

	Product_Types parent_Product_Type_Code;
	Collection<Product> product;
	Collection<Product_Types> product_Types;
	private int product_Type_Code;
	private Integer product_Type_Description;

	@ManyToOne(optional=false)
	@JoinColumn(name="Parent_Product_Type_Code", referencedColumnName="Product_Type_Code")
	public Product_Types getParent_Product_Type_Code() {
		return this.parent_Product_Type_Code;
	}

	public void setParent_Product_Type_Code(Product_Types parent_Product_Type_Code) {
		this.parent_Product_Type_Code = parent_Product_Type_Code;
	}

	@OneToMany(mappedBy="product_TypesProduct_Type_Code")
	public Collection<Product> getProduct() {
		return this.product;
	}

	public void setProduct(Collection<Product> product) {
		this.product = product;
	}

	@OneToMany(mappedBy="parent_Product_Type_Code")
	public Collection<Product_Types> getProduct_Types() {
		return this.product_Types;
	}

	public void setProduct_Types(Collection<Product_Types> product_Types) {
		this.product_Types = product_Types;
	}

	@Id
	@Column(name="Product_Type_Code", nullable=false, length=10)
	public int getProduct_Type_Code() {
		return this.product_Type_Code;
	}

	public void setProduct_Type_Code(int product_Type_Code) {
		this.product_Type_Code = product_Type_Code;
	}

	@Column(name="Product_Type_Description", length=10)
	public Integer getProduct_Type_Description() {
		return this.product_Type_Description;
	}

	public void setProduct_Type_Description(Integer product_Type_Description) {
		this.product_Type_Description = product_Type_Description;
	}

}