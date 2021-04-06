package com.company.ejercicio2;
import java.util.UUID;

public class ItemSell {
    private String nameItem;
    private String description;
    private String id;
    private double unitPrice;

    public ItemSell(){}

    public ItemSell(String nameItem , String description  , double unitPrice)
    {
        this.nameItem=nameItem;
        this.description=description;
        this.id=UUID.randomUUID().toString();
        this.unitPrice=unitPrice;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
