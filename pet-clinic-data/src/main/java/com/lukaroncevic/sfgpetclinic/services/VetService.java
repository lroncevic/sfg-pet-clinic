package com.lukaroncevic.sfgpetclinic.services;

import com.lukaroncevic.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByID(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
