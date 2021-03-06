package pl.quider.web.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
public abstract class DictionaryEntity extends EntityType {
    /**
     * typical column with a name of entity
     */
    @Column(name = "name")
    protected String name;

    @Column(name = "deleted")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date deleted;

    @Column(name = "is_default", columnDefinition = "BIT(1) DEFAULT 0")
    protected Boolean isDefault;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
