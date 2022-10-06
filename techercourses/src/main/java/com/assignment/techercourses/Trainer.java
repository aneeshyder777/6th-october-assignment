//trainer class
package com.assignment.techercourses;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.assignment.techercourses.Course;

@Entity(name ="teacher") //Table name 
public class Trainer {
	
	
	@Id //annotation
	@PrimaryKeyJoinColumn  //joining columns
	private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL) //declaring the relation as one to many
	//creating an object of list 
	List<Course> cour= new ArrayList<Course>();
	//generating getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getCour() {
		return cour;
	}
	public void setCour(List<Course> cour) {
		this.cour = cour;
	}
	
}
