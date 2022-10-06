//course class
package com.assignment.techercourses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="subject")//Table name and annotation
public class Course {
	@Id
	private int cid;
	private String Name;
	//generating getters and setters from source
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
