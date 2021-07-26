package com.chunyue.springframeworkpetclinic.services;

import com.chunyue.springframeworkpetclinic.model.Owner;

public interface OwnerInterface extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
