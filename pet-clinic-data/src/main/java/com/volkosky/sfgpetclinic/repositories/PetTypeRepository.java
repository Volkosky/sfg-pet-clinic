package com.volkosky.sfgpetclinic.repositories;

import com.volkosky.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
