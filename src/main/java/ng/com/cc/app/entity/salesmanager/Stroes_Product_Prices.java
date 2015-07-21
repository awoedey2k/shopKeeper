package ng.com.cc.app.entity.salesmanager;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
public class Stroes_Product_Prices implements Serializable {

    @ManyToOne(optional = false)
    @PrimaryKeyJoinColumn(name = "price_date", referencedColumnName = "DateKay")
    DimDate price_date;

    @ManyToOne(optional = false)
    @PrimaryKeyJoinColumn(name = "Storesid", referencedColumnName = "id")
    Stores stores;

    @ManyToOne(optional = false)
    @PrimaryKeyJoinColumn(name = "Productid", referencedColumnName = "id")
    Product product;

    @Column(name = "price")
    private Double price;

    @Column(name = "discount")
    private Double discount;

    @Column(name = "Reorder_Level", length = 10)
    private Integer reorder_Level;

    @Column(name = "reorder_quantyty", length = 10)
    private Integer reorder_quantyty;


    @Id
    public DimDate getPrice_date() {
        return this.price_date;
    }


    public void setPrice_date(DimDate price_date) {
        this.price_date = price_date;
    }


    @Id
    public Stores getStores() {
        return this.stores;
    }


    public void setStores(Stores stores) {
        this.stores = stores;
    }


    @Id
    public Product getProduct() {
        return this.product;
    }


    public void setProduct(Product product) {
        this.product = product;
    }


    public Double getPrice() {
        return this.price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }


    public Double getDiscount() {
        return this.discount;
    }


    public void setDiscount(Double discount) {
        this.discount = discount;
    }


    public Integer getReorder_Level() {
        return this.reorder_Level;
    }


    public void setReorder_Level(Integer reorder_Level) {
        this.reorder_Level = reorder_Level;
    }


    public Integer getReorder_quantyty() {
        return this.reorder_quantyty;
    }


    public void setReorder_quantyty(Integer reorder_quantyty) {
        this.reorder_quantyty = reorder_quantyty;
    }
}
