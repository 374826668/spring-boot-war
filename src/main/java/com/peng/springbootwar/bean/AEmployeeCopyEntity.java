package com.peng.springbootwar.bean;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/21
 * Time: 9:14
 */

import javax.persistence.*;
import java.util.Objects;

/**
 *描述：
 * @author Li.peng
 *@create 2018-09-21 9:14
 */
@Entity
@Table(name = "a_employee_copy", schema = "activiti", catalog = "")
public class AEmployeeCopyEntity {
    private Long id;
    private String name;
    private String password;
    private String email;
    private String role;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AEmployeeCopyEntity that = (AEmployeeCopyEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password) &&
                Objects.equals(email, that.email) &&
                Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, password, email, role);
    }
}
