package com.company.ejercicio3;
import java.util.UUID;
public class ClientBank {
    private String idClient;
    private String name;
    private String lastName;
    private Character gender;

public ClientBank(){}

public ClientBank(String name ,  String lastName,Character gender)
{
    this.idClient=UUID.randomUUID().toString();
    this.name=name;
    this.lastName=lastName;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

}


