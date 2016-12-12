package com.mprv.automation;


import javax.persistence.*;

/**
 * Created by shira on 12/8/2016.
 */
@Entity
@Table(name="test_user")
public class Test_User

{
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private int id;
    private String name;
    //setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}