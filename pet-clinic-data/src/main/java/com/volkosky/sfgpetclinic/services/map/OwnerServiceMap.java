package com.volkosky.sfgpetclinic.services.map;

import com.volkosky.sfgpetclinic.model.Owner;
import com.volkosky.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
