package com.app.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.repo.MyRepository;

@Component
public class MyService {
	
	    // Go and search for MyRepository Object, Take this Object 
		// and Inject here (MyService.class)
		// If I read MyService Object and print it should also print MyRepository Object
		// Two Object should be printed
		// We use second case where no object will be found in this case 
		// We are not using @Component Annotation and
		// or moved this class in another package both are applicable
	@Autowired
	private MyRepository repo;  // Has-A-Relationship

	@Override
	public String toString() {
		return "MyService [repo=" + repo + "]";
	}
    
	
	
	

}
