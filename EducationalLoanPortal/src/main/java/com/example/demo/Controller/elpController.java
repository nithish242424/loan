package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.LoanApplicationModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Service.elpService;

public class elpController {
	@Autowired
	public elpService eser;
	//user
	@PostMapping("/user/id")
	public UserModel savedetails(@RequestBody UserModel id) 
	
	{
		return eser.savedetails(id);
	}
	
	@DeleteMapping("/deleteid/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		eser.delete(id);
		return "deleted";
		
	}
	 @GetMapping("/get")
	   
	   public List<UserModel>listAll()
	   {
		   return eser.getUser();
	   }
	
	@PutMapping("/update")
	
	public UserModel updatedetails(@RequestBody UserModel id)
	{
		return eser.updateInfo(id);
	}
	
	 //LoanApplication
@PostMapping("/lapp")
public LoanApplicationModel savedetails1(@RequestBody LoanApplicationModel id) 

{
	return eser.save(id);
}
@DeleteMapping("/deletelapp/{id}")
public String delete2(@PathVariable("id")int id)
{
	eser.deletela(id);
	return "deleted";
	
}

@GetMapping("/getloan")

public List<LoanApplicationModel>listAll1()
{
	   return eser.getUser1();
}


@PutMapping("/updatelapp")

public LoanApplicationModel update(@RequestBody LoanApplicationModel id)
{
	return eser.updateInfo(id);
}
}

