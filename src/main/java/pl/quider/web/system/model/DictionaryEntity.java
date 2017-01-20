package pl.quider.web.system.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
public abstract class DictionaryEntity extends EntityType {
    @Column(name = "name")
    protected String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "added")
    protected Date added;

    @Column(name = "modified")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date modified;

    @Column(name = "deleted")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date deleted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }
}
