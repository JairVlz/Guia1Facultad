package com.company.ejercicio2;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;
import java.time.LocalDate;

import static java.lang.System.out;

public class Bill {
    private Client buyer;
    private String idBill;
    private double amount;
    private double totalAmount;
    private LocalDate date;
    private LocalTime hour;
    private ItemSell [] item ;
    private int amountItem;

    public Bill(){}

    public Bill(Client buyer, double amount,ItemSell [] item,int amountItem ) {
        this.buyer = new Client();
        this.buyer=buyer;
        this.idBill =UUID.randomUUID().toString();
        this.amount = amount;
        this.totalAmount=0;
        this.date = LocalDate.now();
        this.hour = LocalTime.now();
        this.item=item;
        this.amountItem=amountItem;

    }



    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void ammountDiscount ()
    {
        Double discount=this.buyer.getDiscountRate();
        int i=0;
        double finalAmount=0;
        for(i=0;i<this.amountItem;i++)
        {
        finalAmount=finalAmount+ this.item[i].getUnitPrice();
        }
        finalAmount=(finalAmount*discount)/100;
        setTotalAmount(finalAmount);
    }
    public void viewPrices()
    {
        out.println("\nPrices:\n"+"Amount:"+this.amount+"\n"+"Total amount:"+this.totalAmount);
    }

    public void viewInfo()
    {

        Client aux = this.buyer;

        int i=0;

        LocalDateTime fecha=LocalDateTime.of(this.date,this.hour);

        System.out.println("\nBill:\n" + "ID:" + this.idBill + "\n" + "Date:" + fecha + "\n"+"Ammount:"+this.amount+"\n"+"Ammount final:\n"+this.totalAmount+"\n"+ "Cliente:\n"+ "ID:"+ aux.getIdClient() + "\n"+"Name:"+ aux.getName()+"\n"+"LastName:"+aux.getLastName()+"\n"+"Email:"+ aux.getEmail()+"\n"+"Discount:"+aux.getDiscountRate());
        for(i=0;i<this.amountItem;i++)
        {
            System.out.println("\nName Item:"+this.item[i].getNameItem()+"\nDescription:"+this.item[i].getDescription()+"\nID:"+this.item[i].getId()+"\nUnit Price:"+this.item[i].getUnitPrice());
        }
    }
}
