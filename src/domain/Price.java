package domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Price implements EntityInterface{

    private UUID uuid;
    private Float price;
    private Date date;

    public Price() {
    }

    public Price(Date date, Float price) {
        this.date = date;
        this.price = price;
    }

    public Price(Date date, Float price, UUID uuid) {
        this.date = date;
        this.price = price;
        this.uuid = uuid;
    }

    @Override
    public UUID getUUID() {
        return this.uuid;
    }

    @Override
    public String toString() {
        return "Price{" +
                "date=" + date +
                ", price=" + price +
                '}';
    }
}
