package com.lukaroncevic.sfgpetclinic.services;

import com.lukaroncevic.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findByID(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
