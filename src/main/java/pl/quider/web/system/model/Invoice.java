package pl.quider.web.system.model;

import pl.quider.web.contact.model.Contact;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Adrian on 20.01.2017.
 */
@Entity(name = "invoice")
public class Invoice extends Bill{

    @Column(name = "net", nullable = true)
    private BigDecimal net;

    @Column(name = "payment_term")
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentTerm;

    @OneToOne
    @JoinColumn(name = "buyer_id")
    private Contact buyer;

    public BigDecimal getNet() {
        return net;
    }

    public void setNet(BigDecimal net) {
        this.net = net;
    }

    public Date getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(Date paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public Contact getBuyer() {
        return buyer;
    }

    public void setBuyer(Contact buyer) {
        this.buyer = buyer;
    }

}
