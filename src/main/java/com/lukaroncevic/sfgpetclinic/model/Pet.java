package com.lukaroncevic.sfgpetclinic.model;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public String getPetType(){
        return petType;
    }

    public void setPetType(PetType petType){
        this.petType = petType;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }
}

