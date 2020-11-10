package com.volkosky.sfgpetclinic.services;

import com.volkosky.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
