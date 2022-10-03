package com.openapi3.service;

import com.openapi3.controller.PetApiDelegate;
import com.openapi3.model.Pet;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceOpenApiImpl implements PetApiDelegate {


    @Override
    public ResponseEntity<Pet> createNewPet(Pet pet) {
        // repository.save(pet);
        System.out.println("Call createNewPet");
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @Override
    public ResponseEntity<Pet> findById(Integer id) {
        Pet pet = new Pet();
        pet.setId(1);
        pet.setName("cat");
        pet.setStatus(Pet.StatusEnum.AVAILABLE);
        System.out.println("Call findById");
        return new ResponseEntity(pet, HttpStatus.OK);
    }

    @SecurityRequirement(name = "BearerJWT")
    @Override
    public ResponseEntity<List<Pet>> getAllPet() {
        // repository.findAll();
        System.out.println("Call getAllPet");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
