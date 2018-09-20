package com.peng.springbootwar.bean;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/20
 * Time: 15:47
 */


import javax.persistence.*;

/**
 *描述：
 * @author Li.peng
 *@create 2018-09-20 15:47
 */
@Entity
@Table(name = "a_employee_copy", schema = "activiti" )
public class AEmployeeCopyEntity {
    private Long id;
    private String name;
    private String email;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
