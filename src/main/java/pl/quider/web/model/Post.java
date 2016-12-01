package pl.quider.web.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;
    @Column
    private String text;
    @Column
    private Date added;
    @Column
    private Date modified;
    @Enumerated(EnumType.ORDINAL)
    private PostSate state;
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
    @Column(name = "placeHolder")
    private String placeHolder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public PostSate getState() {
        return state;
    }

    public void setState(PostSate state) {
        this.state = state;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    private enum  PostSate {
        PUBLISHED(1),
        DRAFT(2),
        DELETED(3);

        private int value;

        private PostSate(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
