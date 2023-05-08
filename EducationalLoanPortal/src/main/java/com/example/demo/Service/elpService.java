package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.LoanApplicationModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Repository.LoanApplicationRepository;
import com.example.demo.Repository.UserRepository;

public class elpService {
	@Autowired
	public UserRepository urepo;
//	public LoginRepository lrepo;
//	public AdminRepository arepo;
	@Autowired
	public LoanApplicationRepository larepo;
//Usermodel
	public UserModel savedetails(UserModel id) {
		// TODO Auto-generated method stub
		return urepo.save(id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		urepo.deleteById(id);
		
	}

	public List<UserModel> getUser() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}

	public UserModel updateInfo(UserModel id) {
		// TODO Auto-generated method stub
		return urepo.saveAndFlush(id);
	}
		//LoanApplication

	public LoanApplicationModel save(LoanApplicationModel id) {
		// TODO Auto-generated method stub
		return larepo.save(id);
	}

	public void deletela(int id) {
		// TODO Auto-generated method stub
		larepo.deleteById(id);
	}

	public List<LoanApplicationModel> getUser1() 
	{
		// TODO Auto-generated method stub
		return larepo.findAll();
	}
		
	
	
	public LoanApplicationModel updateInfo(LoanApplicationModel id) {
		// TODO Auto-generated method stub
		return larepo.saveAndFlush(id);
	}

}

