package com.RestApi.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.RestApi.model.Empolyee;

public interface EmpolyeeRepository extends JpaRepository<Empolyee,Long>{

	 public Optional<Empolyee> findByName(String name);   ///Find By Name
	 

	

}
