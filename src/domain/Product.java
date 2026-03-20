package domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Product implements EntityInterface{
    private UUID uuid;
    private String sku;
    private String name;
    private BigDecimal price;
    private Date datePrice;
    private ArrayList<Price> historicalPrice = new ArrayList<>();

    public Product() {
    }

    public Product(String name, BigDecimal price, String sku) {
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    public Product(BigDecimal price, String sku, UUID uuid, String name) {
        this.price = price;
        this.sku = sku;
        this.uuid = uuid;
        this.name = name;
    }

    public Date getDatePrice() {
        return datePrice;
    }

    public void setDatePrice(Date datePrice) {
        this.datePrice = datePrice;
    }

    public ArrayList<Price> getHistoricalPrice() {
        return historicalPrice;
    }

    public void setHistoricalPrice(ArrayList<Price> historicalPrice) {
        this.historicalPrice = historicalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        if (this.price != null && this.datePrice != null) {
            Price oldPrice = new Price (this.datePrice, this.price);
            historicalPrice.add(oldPrice);
        }


        this.price = price;
        this.datePrice = new Date();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "Product{" +
                "datePrice=" + datePrice +
                ", sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", historicalPrice=" + historicalPrice +
                '}';
    }
}
