package com.lukaroncevic.sfgpetclinic.services;

import com.lukaroncevic.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
