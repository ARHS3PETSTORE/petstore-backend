package com.example.petstore.dao;

import com.example.petstore.entity.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetDao extends CrudRepository<Pet, Long> { }
