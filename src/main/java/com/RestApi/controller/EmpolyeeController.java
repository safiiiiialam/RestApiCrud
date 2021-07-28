package com.RestApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.model.Empolyee;
import com.RestApi.service.EmpolyeeService;

@RestController
public class EmpolyeeController {
	@Autowired
	private EmpolyeeService empolyeeService;
	
	
	@PostMapping("addSingleEmpolyee")
	public Empolyee addEmpolyee(@RequestBody Empolyee empolyee)    ///////Add Single Empolyeeee....  This is a Crud Operation....
	{
		return this.empolyeeService.addEmpolyee(empolyee);
	}
	
	
	@PostMapping("addMultipleEmpolyee")
    public List<Empolyee> addMultiple( @RequestBody List<Empolyee> empolyees) {
		
		return empolyeeService.addMultiple(empolyees);   /////////////////Add Multiple Empolyeee Together.... This is a Crud Operation....
	}

	
	@GetMapping("/getAllEmpolyee")
	public List<Empolyee> getEmpolyee()
	{
		return  this.empolyeeService.getEmpolyee();       ///to reterive All Empolyeee From DataBase.......This Is Read/Reterive operation
	} 
	

    @GetMapping("empolyeeById/{id}")
    public Optional<Empolyee> empolyeeById(@PathVariable long  id)
    {
   	 return empolyeeService.empolyeeById(id);  //to reterive  Empolyeee From DataBase.By Id......This Is Read/Reterive operation
    }
    
    @GetMapping("empolyeeByName/{name}")
 	public Optional< Empolyee> empolyeeByName( @PathVariable String name) 
 	{
 		return empolyeeService.findByName(name);  //to reterive  Empolyeee From DataBase.By Name......This Is Read/Reterive operation
 	}
    
	
	@PutMapping("updateEmpolyee")
     public Empolyee  updateEmpolyee(  @RequestBody Empolyee empolyee ) 
     {
		return this.empolyeeService.updateEmpolyee(empolyee) ;   //// This is update Empolyee and also save Empolyee...This is update Operation..
		
     }
	
	
	@DeleteMapping("deleteEmpolyeeById/{id}")
	public void deleteEmpolyee( @PathVariable long id)  ///This is Delete Operation ..This is  a  Delete opeartion..
	{
		empolyeeService.deleteEmpolyee(id);
	}
    @GetMapping("get/{pageNo}/{pageSize}")
	public List<Empolyee> getPage(@PathVariable int pageNo,@PathVariable int pageSize)
	{ 
    	return empolyeeService.findpPageinated(pageNo, pageSize);
	}
}

/*
 * int pageSize=3; Page<Empolyee> page=empolyeeService.findpPageinated(PageNo,
 * pageSize); List<Empolyee> listempolyee=page.getContent();
 * model.addAttribute("CurrentPage", PageNo); //model.addAttribute("Total page",
 * Page.getTotalPages()); model.addAttribute("listempolyees", listempolyee);
 * return model; 
 *
 */
