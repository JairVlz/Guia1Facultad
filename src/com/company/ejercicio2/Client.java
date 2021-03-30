package com.company.ejercicio2;
import java.util.UUID;
import com.company.ejercicio2.Bill;
public class Client {

    private String idClient;
    private String name;
    private String lastName;
    private String email;
    private
    double discountRate;

    public Client()
    { }

    public Client(String name, String lastName, String email, double discountRate) {
        this.idClient = UUID.randomUUID().toString();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.discountRate = discountRate;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

   public void viewClient()
   {
       System.out.println("Cliente:\n"+"ID:"+this.idClient+"\n"+ "Name:"+this.name+"\n"+"LastName:"+this.lastName+"\n"+"Email:"+this.email+"\n"+ "Discount:"+ this.discountRate);
   }

}
