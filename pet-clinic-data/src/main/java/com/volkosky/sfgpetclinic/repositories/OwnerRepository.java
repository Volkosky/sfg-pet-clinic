package com.volkosky.sfgpetclinic.repositories;

import com.volkosky.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
