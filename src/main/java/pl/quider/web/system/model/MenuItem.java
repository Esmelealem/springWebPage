package pl.quider.web.system.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "menu_item")
public class MenuItem extends EntityType {
    @Column
    private String name;
    @Column(name="display_name")
    private String displayName;
    @Column
    private String href;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
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
