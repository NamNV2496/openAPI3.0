package com.openapi3.service;

import com.openapi3.controller.PetApiDelegate;
import com.openapi3.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceOpenApiImpl implements PetApiDelegate {


    @Override
    public ResponseEntity<Pet> createNewPet(Pet pet) {
        // repository.save(pet);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @Override
    public ResponseEntity<Pet> findById(Integer id) {
        Pet pet = new Pet();
        pet.setId(1);
        pet.setName("cat");
        pet.setStatus(Pet.StatusEnum.AVAILABLE);
        return new ResponseEntity(pet, HttpStatus.OK);
    }
    @Override
    public ResponseEntity<List<Pet>> getAllPet() {
        // repository.findAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
