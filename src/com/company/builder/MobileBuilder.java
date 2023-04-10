package com.company.builder;

public class MobileBuilder {

    private String brand;
    private String model;
    private Integer ram;
    private Integer storage;

    public MobileBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public MobileBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public MobileBuilder setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public MobileBuilder setStorage(Integer storage) {
        this.storage = storage;
        return this;
    }


    public MobileConfiguration build(){
        return new MobileConfiguration(this.brand, this.model, this.storage, this.ram);
    }
}
