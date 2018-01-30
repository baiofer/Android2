package com.jarzasa.madridshops.domain.model;

public final class ShopJava {

    private int id;
    private String name;
    private String address;

    public ShopJava(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    {
        ShopJava shop1 = new ShopJava("Tienda 1");
        shop1.setAddress("address");
        shop1.getAddress();
    }

}
