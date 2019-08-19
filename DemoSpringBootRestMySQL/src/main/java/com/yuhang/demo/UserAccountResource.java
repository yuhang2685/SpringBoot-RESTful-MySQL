package com.yuhang.demo;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//YH: To import the package for @RestController, it requires the dependency "starter-web"
@RestController
public class UserAccountResource {

	UserAccountRepository uaRepo = new UserAccountRepository();
	
	// YH: The method responsible for handling HTTP GET requests needs to be annotated with @RequestMapping annotation.
	@RequestMapping("userAccounts")
	public List<UserAccount> getUserAccounts() {

		return uaRepo.getUserAccounts();
	}
	
	
	@RequestMapping("userAccount/{uid}")	
	// YH: @PathVariable is to obtain some placeholder from the URI (Spring calls it an URI Template),
	// i.e., the user input URI component "uid" is passed to the local variable "id".
	public UserAccount getUserAccount(@PathVariable("uid") int id) {
		
		UserAccount ua = uaRepo.getUserAccount(id);		
		return ua;
	}
	
	
	// YH: The method responsible for handling HTTP POST requests needs to be annotated with @PostMapping annotation.
	@PostMapping("userAccount")
	// YH: To be able to convert the JSON sent as HTTP Body content into a Java object which we can use in our application,
	// we need to use the @RequestBody annotation for the method argument.
	public void createUserAccount(@RequestBody UserAccount ua) {
		
		uaRepo.addUserAccount(ua);
	}


	// YH: The method responsible for handling HTTP PUT requests needs to be annotated with @PutMapping annotation.
	@PutMapping("userAccount")
	public void updateUserAccount(@RequestBody UserAccount ua) {
		
		if(uaRepo.getUserAccount(ua.getId()).getId()==0)
		{uaRepo.addUserAccount(ua);}
		else
		{uaRepo.updateUserAccount(ua);}
		
	}

	
	// YH: The method responsible for handling HTTP DELETE requests needs to be annotated with @DeleteMapping annotation.
	@DeleteMapping("userAccount/{uid}")	
	public void delUserAccount(@PathVariable("uid") int id) {
		
		if(uaRepo.getUserAccount(id).getId()!=0)
			uaRepo.deleteUserAccount(id);
		
	}
}
