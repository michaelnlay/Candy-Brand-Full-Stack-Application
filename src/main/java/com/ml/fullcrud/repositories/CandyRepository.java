package com.ml.fullcrud.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ml.fullcrud.models.Candy;


@Repository
//Repository take interface file that hold default methods for us to use in other classes
public interface CandyRepository extends CrudRepository<Candy, Long> {
	
    // this method retrieves all the candy from the database
    List<Candy> findAll();
    

}
