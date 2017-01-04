package com.devcrocod.task5.domain;

import javax.persistence.*;

@Entity(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NUMBER")
    private int number;

    @Column(name = "SUM")
    private long sum;


    // Constructor
    public Customer(){

    }


    // Getter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getNumber() {
        return number;
    }

    public long getSum() {
        return sum;
    }


    // Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}
