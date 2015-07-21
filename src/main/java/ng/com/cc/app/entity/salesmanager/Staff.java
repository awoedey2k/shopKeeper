package ng.com.cc.app.entity.salesmanager;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Staff implements Serializable {

    DimDate dateOfBirth;

    DimDate dateJoined;

    DimDate dateLeft;

    JobTitle jobTitle;

    Adddresses adddresses;

    Collection<Areas> areas;

    Collection<Stores> stores;

    private int id;

    private String firstName;

    private String lastName;

    private String gender;

    private String officePhone;

    private String cell_mobile_Phone;

    private String email_address;

    private BigDecimal commission_percentage;


    @ManyToOne(optional = false)
    @JoinColumn(name = "DateOfBirth", referencedColumnName = "DateKay", nullable = false)
    public DimDate getDateOfBirth() {
        return this.dateOfBirth;
    }


    public void setDateOfBirth(DimDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    @ManyToOne(optional = false)
    @JoinColumn(name = "DateJoined", referencedColumnName = "DateKay", nullable = false)
    public DimDate getDateJoined() {
        return this.dateJoined;
    }


    public void setDateJoined(DimDate dateJoined) {
        this.dateJoined = dateJoined;
    }


    @ManyToOne(optional = false)
    @JoinColumn(name = "DateLeft", referencedColumnName = "DateKay", nullable = false)
    public DimDate getDateLeft() {
        return this.dateLeft;
    }


    public void setDateLeft(DimDate dateLeft) {
        this.dateLeft = dateLeft;
    }


    @ManyToOne(optional = false)
    @JoinColumn(name = "JobTitle", referencedColumnName = "titleCode", nullable = false)
    public JobTitle getJobTitle() {
        return this.jobTitle;
    }


    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }


    @ManyToOne(optional = false)
    @JoinColumn(name = "Adddresses", referencedColumnName = "id", nullable = false)
    public Adddresses getAdddresses() {
        return this.adddresses;
    }


    public void setAdddresses(Adddresses adddresses) {
        this.adddresses = adddresses;
    }


    @OneToMany(mappedBy = "areaManager")
    public Collection<Areas> getAreas() {
        return this.areas;
    }


    public void setAreas(Collection<Areas> areas) {
        this.areas = areas;
    }


    @OneToMany(mappedBy = "manger")
    public Collection<Stores> getStores() {
        return this.stores;
    }


    public void setStores(Collection<Stores> stores) {
        this.stores = stores;
    }


    @Id
    @Column(name = "id", nullable = false, length = 10)
    public int getId() {
        return this.id;
    }


    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "firstName")
    public String getFirstName() {
        return this.firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    @Column(name = "LastName")
    public String getLastName() {
        return this.lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Column(name = "gender", length = 15)
    public String getGender() {
        return this.gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    @Column(name = "officePhone")
    public String getOfficePhone() {
        return this.officePhone;
    }


    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }


    @Column(name = "cell_mobile_Phone")
    public String getCell_mobile_Phone() {
        return this.cell_mobile_Phone;
    }


    public void setCell_mobile_Phone(String cell_mobile_Phone) {
        this.cell_mobile_Phone = cell_mobile_Phone;
    }


    @Column(name = "email_address")
    public String getEmail_address() {
        return this.email_address;
    }


    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }


    @Column(name = "commission_percentage", length = 19, scale = 4)
    public BigDecimal getCommission_percentage() {
        return this.commission_percentage;
    }


    public void setCommission_percentage(BigDecimal commission_percentage) {
        this.commission_percentage = commission_percentage;
    }
}
