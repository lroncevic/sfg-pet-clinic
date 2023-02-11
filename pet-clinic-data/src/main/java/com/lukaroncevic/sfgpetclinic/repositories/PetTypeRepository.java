package com.lukaroncevic.sfgpetclinic.repositories;

import com.lukaroncevic.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
