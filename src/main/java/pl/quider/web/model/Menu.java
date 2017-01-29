package pl.quider.web.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "menu")
public class Menu extends DictionaryEntity {

    @Column
    private String pos;

    @OneToMany(mappedBy = "menu", fetch = FetchType.EAGER)
    private Collection<MenuItem> menuItems;


    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Collection<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(Collection<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

}
