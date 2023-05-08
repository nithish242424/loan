package com.example.demo.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CustomerDetails;
import com.example.demo.Model.login;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Repository.loginrepo;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;
	
	public String addCustomer(CustomerDetails customer)
	{
		repository.save(customer);
		return "Added";
	}
	public List<CustomerDetails> getCustomer()
	{
		return repository.findAll();
	}
	public Optional<CustomerDetails> getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String updateCustomer(CustomerDetails customer)
	{
		repository.save(customer);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}
	
	public List<CustomerDetails> page(int num, int size) {
		Page<CustomerDetails> p=repository.findAll(PageRequest.of(num, size));
		return p.getContent();
	}

	public List<CustomerDetails> paginationsorting(int pnum, int psize, String name) {
		// TODO Auto-generated method stub
		Page<CustomerDetails> p=repository.findAll(PageRequest.of(pnum, psize,org.springframework.data.domain.Sort.by(name).ascending()));
		return p.getContent();
}
	public List<CustomerDetails> sorting(String name) {
		
		return repository.findAll(org.springframework.data.domain.Sort.by(name));
	}
	@Autowired
	loginrepo userRepo;
	public login saveUser(login u)
	{
	return userRepo.save(u);
	}  
	public String validateUser(String username,String password)
	{
		String result="";
		login u=userRepo.findByUsername(username);
		if(u==null)
		{
			result="Invalid user";
		}
			else
			{
				if(u.getPassword().equals(password))
				{
					result="Login success";
				}
				else
				{
					result="Login failed";
				}
			}
		

		return result;
		}
	
}