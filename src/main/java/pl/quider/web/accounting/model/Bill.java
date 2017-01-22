package pl.quider.web.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * Created by Adrian on 20.01.2017.
 */
@Entity(name = "bill")
public class Bill extends AccountingDocument {

    @Column(name = "gross_value", nullable = true)
    private BigDecimal grossValue;

    public BigDecimal getGrossValue() {
        return grossValue;
    }

    public void setGrossValue(BigDecimal grossValue) {
        this.grossValue = grossValue;
    }
}
