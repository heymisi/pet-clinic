package hu.misi.petclinic.service;

import hu.misi.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByName(String Name);

}
