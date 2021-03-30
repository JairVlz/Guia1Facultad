package com.company.ejercicio3;
import java.util.UUID;

public class BankAccount {
    private String idBankAccount;
    private double balance;
    private ClientBank client;

    public BankAccount(){}

    public BankAccount(double balance, ClientBank client) {
        this.idBankAccount=UUID.randomUUID().toString();
        this.balance = balance;
        this.client = client;
    }

    public String getIdBankAccount() {
        return idBankAccount;
    }

    public void setIdBankAccount(String idBankAccount) {
        this.idBankAccount = idBankAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClientBank getClient() {
        return client;
    }

    public void setClient(ClientBank client) {
        this.client = client;
    }
    public void extractMoney(double moneyToWithdraw)
    {
        if(this.balance-moneyToWithdraw<-2000)
        {
            System.out.println("The amount entered exceeds the amount in the account");
        }else
        {
            setBalance(this.balance-moneyToWithdraw);
        }

    }
    public void moneyToDeposit(double moneyToAdd)
    {
        setBalance(this.balance+moneyToAdd);
    }


}
