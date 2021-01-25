package com.deepesh.mypetclinic.services;

import com.deepesh.mypetclinic.model.Owner;
import com.deepesh.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
