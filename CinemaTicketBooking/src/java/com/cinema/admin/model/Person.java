
package com.cinema.admin.model;

public class Person {
    
    private String name;
    private String gender;
    private String birth_date;

    public Person(String name, String gender, String birth_date) {
        this.name = name;
        this.gender = gender;
        this.birth_date = birth_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
    
    
    
}
