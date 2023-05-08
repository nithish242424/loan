package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CustomerDetails;
import com.example.demo.Model.login;
import com.example.demo.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class Controller {
	@Autowired
	CustomerService  Service;
	
	@PostMapping("")
	public String create(@RequestBody CustomerDetails customer)
	{
		return Service.addCustomer(customer);
	}
	@GetMapping("/gets")
	public List<CustomerDetails> read()
	{
		return Service.getCustomer();
	}
	@GetMapping("/{id}")
	public Optional<CustomerDetails>readById(@PathVariable int id)
	{
		return Service.getCustomerById(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody CustomerDetails customer)
	{
		return Service.updateCustomer(customer);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("cid") int id)
	{
		Service.deleteByRequestParam(id);
		return "Deleted";
	}
	//sorting
		@GetMapping("/sort/{name}")
		
		public List<CustomerDetails> sorting(@PathVariable("name")String name)
		{
			 return Service.sorting(name);
		}
		
		//pagination
		@GetMapping("/page/{pnum}/{psize}")
		public List<CustomerDetails> page(@PathVariable("pnum")int num,@PathVariable("psize")int size)
		{
			return Service.page(num,size);
		}
		
		//pagination sorting
		@GetMapping("/paginationsort/{pnum}/{psize}/{name}")
		public List<CustomerDetails> paginationsorting(@PathVariable("pnum")int pnum,@PathVariable("psize")int psize,@PathVariable("name")String name)
		{
			return Service.paginationsorting(pnum,psize,name);
		}
		CustomerService usrService;
		@PostMapping("/checkLogin")
			public String validateUser(@RequestBody login u)
			{
			System.out.println(u.getUsername());
				return Service.validateUser(u.getUsername(),u.getPassword());
			}
		@PostMapping("/addUser")
		public login user(@RequestBody login u)
		{
		return Service.saveUser(u);
		}
		
}