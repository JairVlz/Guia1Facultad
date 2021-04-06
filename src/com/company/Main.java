package com.company;
import com.company.ejercicio1.Book;
import com.company.ejercicio2.Client;
import com.company.ejercicio2.Bill;
import com.company.ejercicio3.BankAccount;
import com.company.ejercicio3.ClientBank;
import com.company.ejercicio2.ItemSell;
import java.util.Scanner;



public class Main {
	private static final int maxRegister=10;
	private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

    	String [] registerClient=new String[maxRegister];
    	String [] registerMoney=new String[maxRegister];

    	ClientBank client= new ClientBank("Facundo", 'M');

    	BankAccount account =new BankAccount(55000,client,registerClient,registerMoney);

    double newPrice;

    double moneyToExtracAndDeposit;

    int amountItem=3;

    int newStock;

    Client consumer = new Client("Jorge","Martinez","jorgem@gmail.com",10);

    ItemSell[] items=new ItemSell[amountItem];

    items [0] = new ItemSell("Helado","Helado grido sabor a chocolate",50);
    items [1] = new ItemSell("Pasta Dental","Pasta dental oral-B sabor a limon",65);
    items [2] = new ItemSell("Desodrante","Desodrante axe aroma a chocolate",200);

	Bill factura =	new Bill(consumer, 0, items, amountItem );

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

	System.out.println("Enter money to extract:");

	moneyToExtracAndDeposit=scanner.nextDouble();

	account.extractMoney(moneyToExtracAndDeposit);

	account.viewAccount();

	System.out.println("Enter money to deposit:");

	moneyToExtracAndDeposit = scanner.nextDouble();

	account.moneyToDeposit(moneyToExtracAndDeposit);

	account.viewAccount();



	}
}
