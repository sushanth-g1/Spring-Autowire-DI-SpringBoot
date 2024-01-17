package com.springboot.demo;

import org.springframework.stereotype.Component;

@Component("comp1")
public class Computer {
    private int cid;
    private String brand;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cid=" + cid +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void compile(){
        System.out.println(" compiling ");
    }
}
