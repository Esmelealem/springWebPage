package pl.quider.web.model;

import pl.quider.web.model.DictionaryEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Adrian on 22.01.2017.
 */
@Entity
@Table(name = "payment_type")
public class PaymentType extends DictionaryEntity {
}
