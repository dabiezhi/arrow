package cn.tsyh.arrow.user.facade.entity.User;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author tsy
 * @Description
 * @date 17:02 2017/8/2
 */
@Table(name="user")
public class User implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
