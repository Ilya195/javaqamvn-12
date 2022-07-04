package ru.netology.javaqamvn12.services;
public class Smartphone extends Product{
    //private String title;
    private String manufacturer;

    public Smartphone(int id, String name, int price, String title, String manufacturer) {
        super(id,name,price,title);
        this.manufacturer = manufacturer;
    }

    public  String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
