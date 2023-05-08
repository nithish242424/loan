package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class details {
@Id
private int id;
private String bookname;
private String takendate;
private String duedate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getTakendate() {
	return takendate;
}
public void setTakendate(String takendate) {
	this.takendate = takendate;
}
public String getDuedate() {
	return duedate;
}
public void setDuedate(String duedate) {
	this.duedate = duedate;
}
@Override
public String toString() {
	return "details [id=" + id + ", bookname=" + bookname + ", takendate=" + takendate + ", duedate=" + duedate + "]";
}

}
