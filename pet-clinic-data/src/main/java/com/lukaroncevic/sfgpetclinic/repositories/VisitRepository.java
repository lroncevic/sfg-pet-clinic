package com.lukaroncevic.sfgpetclinic.repositories;

import com.lukaroncevic.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
