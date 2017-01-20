package pl.quider.web.system.model;

import pl.quider.web.system.model.EntityType;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Adrian on 20.01.2017.
 */
@Entity
@Table(name = "item")
public class Item extends EntityType {

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "tax")
    private BigDecimal tax;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }
}
