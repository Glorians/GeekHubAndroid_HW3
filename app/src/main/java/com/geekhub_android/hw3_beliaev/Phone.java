package com.geekhub_android.hw3_beliaev;

public class Phone {
    private String brand;
    private String model;
    private int image;


    public Phone (String brand, String model, int image) {
        this.brand = brand;
        this.model = model;
        this.image = image;
        System.out.println("Image: "+ image + "-------------------------------");
    }

    //Getters
    public String getBrand () {
        return this.brand;
    }

    public String getModel () {
        return this.model;
    }

    public int getImage () {
        return this.image;
    }

    //Setters
    public void setBrand (String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setImage (int image) {
        this.image = image;
    }

}


