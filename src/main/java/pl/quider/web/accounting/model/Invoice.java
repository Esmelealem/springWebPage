package pl.quider.web.accounting.model;

import pl.quider.web.contact.model.Contact;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "invoice")
public class Invoice extends Bill {

    @Column(name = "net", nullable = true)
    private BigDecimal net;

    @Column(name = "payment_term")
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentTerm;

    @OneToOne
    @JoinColumn(name = "buyer_id")
    private Contact buyer;

    @OneToMany
    @JoinColumn(name = "payment_type_id")
    private PaymentType paymentType;

    @Temporal(TemporalType.DATE)
    @Column
    private Date deliverDate;

    @Column
    private BigDecimal total;

    @Column
    private BigDecimal discountTotal;

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

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

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDiscountTotal() {
        return discountTotal;
    }

    public void setDiscountTotal(BigDecimal discountTotal) {
        this.discountTotal = discountTotal;
    }
}
