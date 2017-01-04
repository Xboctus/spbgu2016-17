package com.devcrocod.task5.model;

import java.io.Serializable;

public class CustomerTO implements Serializable{

    private static final long serialVersionCID = -2310882902018760564L;

    private Long id;
    private String name;
    private String password;
    private int number;
    private long sum;

    public CustomerTO(Long id, String name, String password, int number, long sum){
        this.id = id;
        this.name = name;
        this.password = password;
        this.number = number;
        this.sum = sum;
    }

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
