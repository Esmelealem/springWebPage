package pl.quider.web.system.model;

import pl.quider.web.system.model.EntityType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User extends EntityType {// implements UserDetails{
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private Date added;
    @Column
    private Date modified;
    @Column
    private String avatar;


    public void setUsername(String username) {
        this.username = username;
    }

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }

    public String getPassword() {
        return password;
    }

//    @Override
    public String getUsername() {
        return username;
    }

//    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

//    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

//    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

//    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
