package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.login;

public interface loginrepo extends JpaRepository<login,Integer> {

	login findByUsername(String username); 


}
