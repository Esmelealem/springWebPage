package pl.quider.web.system.model;

import pl.quider.web.system.model.EntityType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "section")
public class Section extends EntityType{

    @Column
    private String name;
    @Column
    @Temporal(TemporalType.DATE)
    private Date added;
    @Column
    @Temporal(TemporalType.DATE)
    private Date modified;

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
}
