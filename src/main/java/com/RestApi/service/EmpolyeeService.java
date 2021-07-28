package com.RestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.RestApi.model.Empolyee;

public interface EmpolyeeService {
	
	
	
	public Empolyee addEmpolyee(Empolyee empolyee);     ///TO Add Single Empolyee In DataBase  // cretae single ...POST
	public List<Empolyee> addMultiple(List<Empolyee> empolyees);            //To Add Multiple Empolyee In DataBase..// create Multiple....POST
	public List<Empolyee> getEmpolyee();          /// To get Empolyee In DataBase Retervie  // To read/retervie Multiple....Read>  GET
    public Optional<Empolyee>  empolyeeById(long id );            // To get Empolyee BY Id... To read By empolyee by Id.... Read/Id  GET
	public  Optional<Empolyee> findByName(String name);       // To get Empolyee BY Name... To read By empolyee by Name.... Read/Name   GET
	public Empolyee updateEmpolyee(Empolyee empolyee);     //TO Update Empolyee........PUT
	public String   deleteEmpolyee(long id);         /// TO Delete Empolyee BY Id........DELETE
	public List<Empolyee> findpPageinated(int pageNo,int pageSize);

}
