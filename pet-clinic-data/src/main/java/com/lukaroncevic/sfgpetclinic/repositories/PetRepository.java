package com.lukaroncevic.sfgpetclinic.repositories;

import com.lukaroncevic.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
