package com.company.builder;


public class MobileConfiguration {
    private String brand;
    private String model;
    private Integer ram;
    private Integer storage;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public MobileConfiguration(String brand, String model, Integer ram, Integer storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "MobileConfiguration{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}
