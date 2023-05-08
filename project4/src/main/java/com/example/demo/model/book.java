package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class book {
   @Id
   @GeneratedValue
   private int id;
   private String phnno;
   private String bookname;
   private String name;
   @OneToMany(cascade=CascadeType.ALL)
   @JoinColumn
   private List<details>model;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPhnno() {
	return phnno;
}
public void setPhnno(String phnno) {
	this.phnno = phnno;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "book [id=" + id + ", phnno=" + phnno + ", bookname=" + bookname + ", name=" + name + "]";
}
   
}
