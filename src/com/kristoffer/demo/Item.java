package com.kristoffer.demo;

public class Item {

    private String name;
    private int price;
    private int armor;

    public Item() {}
    public Item(String name, int price, int armor) {
        this.name = name;
        this.price = price;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", armor=" + armor +
                '}';
    }
}
