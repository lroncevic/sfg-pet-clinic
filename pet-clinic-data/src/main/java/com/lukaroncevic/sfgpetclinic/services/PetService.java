package com.lukaroncevic.sfgpetclinic.services;

import com.lukaroncevic.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByID(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
