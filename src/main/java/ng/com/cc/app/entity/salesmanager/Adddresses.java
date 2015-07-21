package ng.com.cc.app.entity.salesmanager;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Adddresses implements Serializable {

    Collection<Staff> staff;

    Collection<Stores> stores;

    private int id;

    private String line1;

    private String line3;

    private String line2;

    private String city;

    private String zipOrPostCode;

    private String state;

    private String country;


    @OneToMany(mappedBy = "adddresses")
    public Collection<Staff> getStaff() {
        return this.staff;
    }


    public void setStaff(Collection<Staff> staff) {
        this.staff = staff;
    }


    @OneToMany(mappedBy = "address")
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


    @Column(name = "Line1")
    public String getLine1() {
        return this.line1;
    }


    public void setLine1(String line1) {
        this.line1 = line1;
    }


    @Column(name = "Line3")
    public String getLine3() {
        return this.line3;
    }


    public void setLine3(String line3) {
        this.line3 = line3;
    }


    @Column(name = "Line2")
    public String getLine2() {
        return this.line2;
    }


    public void setLine2(String line2) {
        this.line2 = line2;
    }


    @Column(name = "city")
    public String getCity() {
        return this.city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    @Column(name = "ZipOrPostCode")
    public String getZipOrPostCode() {
        return this.zipOrPostCode;
    }


    public void setZipOrPostCode(String zipOrPostCode) {
        this.zipOrPostCode = zipOrPostCode;
    }


    @Column(name = "State")
    public String getState() {
        return this.state;
    }


    public void setState(String state) {
        this.state = state;
    }


    @Column(name = "country")
    public String getCountry() {
        return this.country;
    }


    public void setCountry(String country) {
        this.country = country;
    }
}
