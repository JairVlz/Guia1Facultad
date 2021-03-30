package com.company;
import com.company.ejercicio1.Book;
import com.company.ejercicio2.Client;
import com.company.ejercicio2.Bill;
import com.company.ejercicio3.BankAccount;
import com.company.ejercicio3.ClientBank;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

    	ClientBank client= new ClientBank("Facundo","Ibañez", 'M');

		BankAccount account =new BankAccount(55000,client);

    double newPrice;

    int newStock;

    Client consumer = new Client("Jorge","Martinez","jorgem@gmail.com",10);

	Bill factura =	new Bill(consumer, 2000);

	Book javaBook=new Book("Effective Java","Joshua","Bloch","joshua@email.com",'M',150,450);

	javaBook.onlyAuthor();

	javaBook.onlyBook();

	System.out.println("Enter the new price:");

	newPrice=scanner.nextDouble();

	System.out.println("Enter the new number of books:");

	newStock=scanner.nextInt();

	javaBook.increasePrice(newPrice);

	javaBook.increaseStock(newStock);

	javaBook.BookNameAndPrice();

	consumer.viewClient();

	factura.ammountDiscount();

	factura.viewPrices();

	factura.viewInfo();

	


	}
}
