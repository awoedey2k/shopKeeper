package ng.com.cc.app.entity.salesmanager;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
public class JobTitle implements Serializable {

	Collection<Staff> staff;
	private int titleCode;
	private String title;
	private String title_Description;

	@OneToMany(mappedBy="jobTitle")
	public Collection<Staff> getStaff() {
		return this.staff;
	}

	public void setStaff(Collection<Staff> staff) {
		this.staff = staff;
	}

	@Id
	@Column(name="titleCode", nullable=false, length=10)
	public int getTitleCode() {
		return this.titleCode;
	}

	public void setTitleCode(int titleCode) {
		this.titleCode = titleCode;
	}

	@Column(name="Title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name="Title_Description")
	public String getTitle_Description() {
		return this.title_Description;
	}

	public void setTitle_Description(String title_Description) {
		this.title_Description = title_Description;
	}

}