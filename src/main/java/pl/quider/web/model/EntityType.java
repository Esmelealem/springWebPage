package pl.quider.web.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Adrian on 20.01.2017.
 */
@MappedSuperclass
public abstract class EntityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "added", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    protected Date added;

    @Column(name = "modified", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date modified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
