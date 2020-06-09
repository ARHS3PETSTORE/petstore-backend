package com.example.petstore.controller;

import com.example.petstore.dao.PetDao;
import com.example.petstore.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PetController {

    @Autowired
    private PetDao petDao;

    @GetMapping(value = "/pets")
    public ResponseEntity<Object> getPets() {
        Iterable<Pet> pets = petDao.findAll();
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public HttpStatus delete(@PathVariable(value = "id") long id) {
        if (petDao.existsById(id)) {
            petDao.deleteById(id);
            return HttpStatus.OK;
        } else {
            return HttpStatus.NOT_FOUND;
        }
    }

    @PostMapping(value = "/add")
    public void addPet(@RequestBody Pet pet) {
        petDao.save(pet);
    }
}
