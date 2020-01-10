package edu.city.domain;

import java.time.LocalDate;

/**
 * Created by ВАСЯ on 09.01.2020.
 */
// поля запрос
// получить и вернуть входной параметр для получении ифо о человеке
public class PersonRequest {

    private String surName;
    private String giveName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String building;
    private String extension;
    private String apartment;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGiveName() {
        return giveName;
    }

    public void setGiveName(String giveName) {
        this.giveName = giveName;
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

    public String getBilding() {
        return building;
    }

    public void setBilding(String bilding) {
        this.building = bilding;
    }

    public String getExtenssion() {
        return extension;
    }

    public void setExtenssion(String extenssion) {
        this.extension = extenssion;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}