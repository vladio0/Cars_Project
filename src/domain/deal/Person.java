package domain.deal;

import java.time.LocalDate;

public abstract class Person {
    protected String surName;
    protected String givenName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String passportSeria;
    private String passportNumber;
    private LocalDate passportDate;
    private int passportOffice;
    private Address address;

    public Person(){
        
    }

    public Person(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
    }

    public int getPassportOffice(){
        return passportOffice;
    }

    public void setPassportOffice(int passportOffice){
        this.passportOffice = passportOffice;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public LocalDate getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(LocalDate passportDate) {
        this.passportDate = passportDate;
    }

    public String getPersonString() {
        return surName + " " + givenName + ":" + passportNumber;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
