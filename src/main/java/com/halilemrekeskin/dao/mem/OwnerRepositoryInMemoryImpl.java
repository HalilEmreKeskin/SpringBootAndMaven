package com.halilemrekeskin.dao.mem;

import com.halilemrekeskin.dao.OwnerRepository;
import com.halilemrekeskin.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class OwnerRepositoryInMemoryImpl implements OwnerRepository {

    public Map<Long,Owner> ownerMap = new HashMap<>();

    public OwnerRepositoryInMemoryImpl() {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Halil");
        owner1.setLastName("Keskin");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Emre");
        owner2.setLastName("Keskin");

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Shara");
        owner3.setLastName("Andrada");

        Owner owner4 = new Owner();
        owner4.setId(4L);
        owner4.setFirstName("Denis");
        owner4.setLastName("Andrada");

        ownerMap.put(owner1.getId(),owner1);
        ownerMap.put(owner2.getId(),owner2);
        ownerMap.put(owner3.getId(),owner3);
        ownerMap.put(owner4.getId(),owner4);


    }

    @Override
    public List<Owner> findAll() {
        return new ArrayList<>(ownerMap.values());
    }

    @Override
    public Owner findById(Long id) {
        return ownerMap.get(id);
    }

    @Override
    public List<Owner> findByLastName(String lastname) {
        return ownerMap.values().stream().filter(owner -> owner.getLastName().equals(lastname)).collect(Collectors.toList());
    }

    @Override
    public void create(Owner owner) {
        owner.setId(new Date().getTime());
        ownerMap.put(owner.getId(),owner);
    }

    @Override
    public Owner update(Owner owner) {
        ownerMap.replace(owner.getId(),owner);
        return owner;
    }

    @Override
    public void delete(Long id) {
        ownerMap.remove(id);

    }
}
