package ng.com.cc.app.entity.salesmanager;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
public class Stores implements Serializable {

	Adddresses address;
	Areas areaCode;
	Staff manger;
	Collection<Stroes_Product_Prices> stroes_Product_Prices;
	private int id;
	private String stroreName;
	private String location;

	@ManyToOne(optional=false)
	@JoinColumn(name="address", referencedColumnName="id", nullable=false)
	public Adddresses getAddress() {
		return this.address;
	}

	public void setAddress(Adddresses address) {
		this.address = address;
	}

	@ManyToOne(optional=false)
	@JoinColumn(name="areaCode", referencedColumnName="area_code", nullable=false)
	public Areas getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(Areas areaCode) {
		this.areaCode = areaCode;
	}

	@ManyToOne(optional=false)
	@JoinColumn(name="Manger_id", referencedColumnName="id", nullable=false)
	public Staff getManger() {
		return this.manger;
	}

	public void setManger(Staff manger) {
		this.manger = manger;
	}

	@OneToMany(mappedBy="stores")
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

	@Column(name="StroreName")
	public String getStroreName() {
		return this.stroreName;
	}

	public void setStroreName(String stroreName) {
		this.stroreName = stroreName;
	}

	@Column(name="Location")
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}