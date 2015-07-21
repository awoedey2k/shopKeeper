package ng.com.cc.app.entity.salesmanager;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Ref_Unit_Of_Measurment implements Serializable {

    Collection<Product> product;

    private String UOM_Code;

    private String UOM_Description;


    @OneToMany(mappedBy = "UOM_Code")
    public Collection<Product> getProduct() {
        return this.product;
    }


    public void setProduct(Collection<Product> product) {
        this.product = product;
    }


    @Id
    @Column(name = "UOM_Code", nullable = false)
    public String getUOM_Code() {
        return this.UOM_Code;
    }


    public void setUOM_Code(String UOM_Code) {
        this.UOM_Code = UOM_Code;
    }


    @Column(name = "UOM_Description")
    public String getUOM_Description() {
        return this.UOM_Description;
    }


    public void setUOM_Description(String UOM_Description) {
        this.UOM_Description = UOM_Description;
    }
}
