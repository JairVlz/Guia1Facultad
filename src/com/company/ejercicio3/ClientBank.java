package com.company.ejercicio3;
import java.util.UUID;
public class ClientBank {
    private String idClient;
    private String name;
    private Character gender;

public ClientBank(){}

public ClientBank(String name,Character gender)
{
    this.idClient=UUID.randomUUID().toString();
    this.name=name;
    this.gender=gender;
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


    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

}


