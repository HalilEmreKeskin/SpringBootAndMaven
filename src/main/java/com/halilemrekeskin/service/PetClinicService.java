package com.halilemrekeskin.service;

import com.halilemrekeskin.exception.OwnerNotFoundException;
import com.halilemrekeskin.model.Owner;

import java.util.List;

public  interface PetClinicService {
    List<Owner> findOwners();
    List<Owner> findOwners(String lastName);
    Owner findOwner(Long id) throws OwnerNotFoundException;
    void createOwner(Owner owner);
    void update(Owner owner);
    void deleteOwner(Long id);
}
