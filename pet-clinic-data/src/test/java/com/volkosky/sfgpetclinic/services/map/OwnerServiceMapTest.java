package com.volkosky.sfgpetclinic.services.map;

import com.volkosky.sfgpetclinic.model.Owner;
import com.volkosky.sfgpetclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    private OwnerServiceMap ownerServiceMap;

    final static Long OWNER_ID = 1L;

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());

        Owner owner = Owner.builder().build();
        owner.setId(OWNER_ID);
        ownerServiceMap.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerServiceMap.findAll();
        assertEquals(1, owners.size());
    }

    @Test
    void deleteByID() {
    }

    @Test
    void delete() {
    }

    @Test
    void save() {
    }

    @Test
    void findByID() {
        Owner owner = ownerServiceMap.findByID(OWNER_ID);

        assertEquals(OWNER_ID, owner.getId());
    }

    @Test
    void findByLastName() {
    }
}