package ng.com.cc.app.entity.salesmanager;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
public class Daily_Inventory_Levels implements Serializable {

    @ManyToOne(optional = false)
    @PrimaryKeyJoinColumn(name = "Date_Of_Inventory", referencedColumnName = "DateKay")
    DimDate date_Of_Inventory;

    @ManyToOne(optional = false)
    @PrimaryKeyJoinColumn(name = "Product_ID", referencedColumnName = "id")
    Product product;

    @Column(name = "Level", length = 10)
    private Integer level;


    @Id
    public DimDate getDate_Of_Inventory() {
        return this.date_Of_Inventory;
    }


    public void setDate_Of_Inventory(DimDate date_Of_Inventory) {
        this.date_Of_Inventory = date_Of_Inventory;
    }


    @Id
    public Product getProduct() {
        return this.product;
    }


    public void setProduct(Product product) {
        this.product = product;
    }


    public Integer getLevel() {
        return this.level;
    }


    public void setLevel(Integer level) {
        this.level = level;
    }
}
