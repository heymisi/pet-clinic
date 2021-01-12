package hu.misi.petclinic.services;

import hu.misi.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
