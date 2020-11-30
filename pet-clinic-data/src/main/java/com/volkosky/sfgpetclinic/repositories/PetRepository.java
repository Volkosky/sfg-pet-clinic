package com.volkosky.sfgpetclinic.repositories;

import com.volkosky.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
