package com.halilemrekeskin.model;

import java.util.Date;

public class Pet {
    private Long id;
    private String Name;
    private Date  birthday;

    private Owner owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", birthday=" + birthday +
                ", owner=" + owner +
                '}';
    }
}
