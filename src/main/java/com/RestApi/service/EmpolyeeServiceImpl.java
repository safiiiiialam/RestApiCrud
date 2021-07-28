package com.RestApi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import com.RestApi.Repository.EmpolyeeRepository;
import com.RestApi.model.Empolyee;
@Service
public class EmpolyeeServiceImpl implements EmpolyeeService {
	
	@Autowired
	private EmpolyeeRepository empolyeeRepository;
	
  
	
	@Override
	public Empolyee addEmpolyee(Empolyee empolyee) {
	
		return empolyeeRepository.save(empolyee);      /////To Add Single Empolye In DataBAse......
	}
	
	
	@Override
	public List<Empolyee>addMultiple(List<Empolyee> empolyees) {
		
		return empolyeeRepository.saveAll(empolyees);   //// To Add Multiple Empolyee In DataBAse
	}
	
	@Override
	public List<Empolyee> getEmpolyee()
	{
		
	  return (List<Empolyee>) empolyeeRepository.findAll();    /// To retervie  All Data In DAtaBase
	}
	

	@Override
	public Optional<Empolyee> empolyeeById(long  id) {
		
		return empolyeeRepository.findById(id);  ///// /// To retervie   Data In DAtaBase By ID
	}
	
	
	@Override
	public Optional< Empolyee> findByName(String name) 
	{
		
		return empolyeeRepository.findByName(name);    ///// /// To retervie   Data In DAtaBase By Name
	}


	@Override
	public Empolyee updateEmpolyee(Empolyee empolyee ) 
	{
		
		return empolyeeRepository.save(empolyee);   ///// /// To Update   Data In DAtaBase 
		
	}

	@Override
	public String  deleteEmpolyee(long id) 
	{
		
		 empolyeeRepository.deleteById(id);  ///// /// To Delete   Data In DAtaBase
		  return "delete Student"+id;
		
	}


	@Override
	public List<Empolyee> findpPageinated(int pageNo, int pageSize) {
		Pageable paging=PageRequest.of(pageNo, pageSize);
		Page<Empolyee> pageresult=empolyeeRepository.findAll(paging);
		return pageresult.toList() ;
	}



	

	

	

	

}





/*@Override
public void deleteEmpolyee(int id) {
	list=(List<Empolyee>) this.list.stream().filter(e->e.getId());	
}*/

/*
 * @Override
 
public Empolyee getSingleEmplyee(int id) {
   Empolyee e=null;
    for(Empolyee empolyee:list)
    {
    	if(empolyee.getId()==id)
    	{
    		e=empolyee;
    		break;
    	}
    }
	return e; 
	return empolyeeRepository.
}
*/

//List<Empolyee> list;
	/*public EmpolyeeServiceImpl ()
	{
		//list=new ArrayList<>();
		list.add(new Empolyee(1,"John","Developer",25000.0,2));
		list.add(new Empolyee(2,"Robert","Vicepresident",30000.0,4));
		list.add(new Empolyee(3,"Shawn","Hr",98766.0,1.5));
	}*/
//return list;
//list.add(empolyee);
//return empolyee;
/*list.forEach(e->{if(e.getId()==empolyee.getId())
{
	e.setName(empolyee.getName());
	e.setRole(empolyee.getRole());
}
});
return empolyee;*/