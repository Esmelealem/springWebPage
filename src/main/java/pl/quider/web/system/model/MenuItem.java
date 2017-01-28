package pl.quider.web.system.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "menu_item")
public class MenuItem extends DictionaryEntity {

    @Column(name="display_name")
    private String displayName;
    @Column
    private String href;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

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

}
