package com;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Batch {
	
	@Id
	private String bcode;
	private String subject;
	private String trainer;
	private String timing;
	private int noofstd;
	
	@OneToMany(mappedBy="batch")
	private List<Student> students;
	
	public void addStudent(Student s) {
		students.add(s);
		s.setBatch(this);
	}
	
	public void removeBatch(Student s) {
		students.remove(s);
		s.setBatch(null);
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public int getNoofstd() {
		return noofstd;
	}

	public void setNoofstd(int noofstd) {
		this.noofstd = noofstd;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}
