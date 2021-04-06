package com.company.ejercicio3;
import java.util.UUID;

public class BankAccount {
    private String idBankAccount;
    private double balance;
    private ClientBank client;
    private String [] registerMoney;
    private String [] registerClient;
    private int posRegister;

    public BankAccount(){}

    public BankAccount(double balance, ClientBank client,String [] registerMoney,String[] registerClient) {
        this.idBankAccount=UUID.randomUUID().toString();
        this.balance = balance;
        this.client = client;
        this.registerMoney=registerMoney;
        this.registerClient=registerClient;
        this.posRegister=0;
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

    public String[] getRegisterMoney() {
        return registerMoney;
    }

    public void setRegisterMoney(String[] registerMoney) {
        this.registerMoney = registerMoney;
    }

    public String[] getRegisterClient() {
        return registerClient;
    }

    public void setRegisterClient(String[] registerClient) {
        this.registerClient = registerClient;
    }

    public int getPosRegister() {
        return posRegister;
    }

    public void setPosRegister(int posRegister) {
        this.posRegister = posRegister;
    }

    public void extractMoney(double moneyToWithdraw)
    {
        if(this.balance-moneyToWithdraw<-2000)
        {
            System.out.println("The amount entered exceeds the amount in the account");
        }else
        {
            setBalance(this.balance-moneyToWithdraw);

            if (this.posRegister<9)
            {
            this.registerMoney[this.posRegister]=Double.toString(moneyToWithdraw);
            this.registerClient[this.posRegister]=this.client.getName();
            this.setPosRegister(this.posRegister+1);
            }
            else
            {
                setPosRegister(0);
                this.registerMoney[this.posRegister]=Double.toString(moneyToWithdraw);
                this.registerClient[this.posRegister]=this.client.getName();
                this.setPosRegister(this.posRegister+1);
            }

        }

    }
    public void moneyToDeposit(double moneyToAdd)
    {
        setBalance(this.balance+moneyToAdd);

        if (this.posRegister<9)
        {
            this.registerMoney[this.posRegister]=Double.toString(moneyToAdd);
            this.registerClient[this.posRegister]="El deposito de "+this.client.getName();
            this.setPosRegister(this.posRegister+1);
        }
        else
        {
            setPosRegister(0);
            this.registerMoney[this.posRegister]=Double.toString(moneyToAdd);
            this.registerClient[this.posRegister]=this.client.getName();
            this.setPosRegister(this.posRegister+1);
        }

    }

    public void viewAccount ()
    {
        System.out.println("Bank Account:\n"+"ID Bank:"+this.idBankAccount+"\n"+"Balance:"+this.balance+"\n"+"ID Client:"+this.client.getIdClient()+"\n"+"Name:"+this.client.getName()+"\n"+"Gender:"+this.client.getGender());
    }
    public void viewRegister ()
    {
        int i=0;
        for(i=0;i<this.posRegister;i++)
        {
            System.out.println("La extraccion del cliente "+this.registerClient[posRegister]+" ");
        }
    }


}
