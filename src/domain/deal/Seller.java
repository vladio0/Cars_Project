package domain.deal;

import java.time.LocalDate;

public class Seller extends Person{
    private String companyName;
    private String bankAccount;
    private String carDescription;
    private double price;


    public Seller(String surName, String givenName, String patronymic, LocalDate dateOfBirth){
        super(surName, givenName, patronymic, dateOfBirth);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
