package com.company.ejercicio1;

public class Book {
    private String tittle;
    private String name;
    private String lastName;
    private String email;
    private Character gender;
    private int stock;
    private double price;

    public Book(){

    }

    public Book(String tittle, String name, String lastName, String email, Character gender, int stock, double price) {
        this.tittle = tittle;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.stock = stock;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
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

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void onlyBook ()
    {
        System.out.println("Book:\n" + "tittle:"+ this.tittle + "\n" + "Price:" + this.price + "\n" + "Stock" + this.stock);
    }

    public void increasePrice (double priceToIncrease)
    {
        setPrice(priceToIncrease);
    }

    public void increaseStock (int newStock)
    {
        newStock=newStock+this.stock; ///Creo que hay una forma mejor de hacerlo pero no la recuerdo :(
        setStock(newStock);
    }
    public void onlyAuthor ()
    {
        System.out.println("Author:\n"+"Name:"+ this.name + "\n" + "LastName:" + this.lastName + "\n" + "Email:" + this.email + "\n");
    }
    public void BookNameAndPrice ()
    {
        System.out.println("The book," + this.tittle +" from " + this.name+ " " + this.lastName + ". Sold at price " + this.price + " pesos");
    }
}
