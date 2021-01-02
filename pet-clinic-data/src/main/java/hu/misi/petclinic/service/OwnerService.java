package hu.misi.petclinic.service;

import hu.misi.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByName(String Name);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
