package ng.com.cc.app.entity.salesmanager;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
public class Areas implements Serializable {

	Staff areaManager;
	Collection<Stores> stores;
	private int area_code;
	private String areaName;
	private String areaDescription;

	@ManyToOne(optional=false)
	@JoinColumn(name="AreaManagerId", referencedColumnName="id", nullable=false)
	public Staff getAreaManager() {
		return this.areaManager;
	}

	public void setAreaManager(Staff areaManager) {
		this.areaManager = areaManager;
	}

	@OneToMany(mappedBy="areaCode")
	public Collection<Stores> getStores() {
		return this.stores;
	}

	public void setStores(Collection<Stores> stores) {
		this.stores = stores;
	}

	@Id
	@Column(name="area_code", nullable=false, length=10)
	public int getArea_code() {
		return this.area_code;
	}

	public void setArea_code(int area_code) {
		this.area_code = area_code;
	}

	@Column(name="areaName")
	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Column(name="areaDescription")
	public String getAreaDescription() {
		return this.areaDescription;
	}

	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}

}