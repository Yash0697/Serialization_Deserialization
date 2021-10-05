package model;

import java.io.Serializable;

public class PlainCricketer implements Serializable {
    String name;
    int age;
    String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void printDetails() {
        System.out.println("Name: "+this.getName());
        System.out.println("Age: "+this.getAge());
        System.out.println("Country: "+this.getCountry());
    }
}
