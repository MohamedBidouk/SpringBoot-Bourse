package com.example.mohamed.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Candidate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int CIN;
	private String firstname;
	private String lastname;
	private int bacgeneration;
	
	@ManyToOne
	private Category category;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCIN() {
		return CIN;
	}

	public void setCIN(int cIN) {
		CIN = cIN;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public int getBacGeneration() {
		return bacgeneration;
	}

	public void setBacGeneration(int bacgeneration) {
		this.bacgeneration = bacgeneration;
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidate(int cIN, String firstname, String lastname, int bacgeneration) {
		super();
		CIN = cIN;
		this.firstname = firstname;
		this.lastname = lastname;
		this.bacgeneration = bacgeneration;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", CIN=" + CIN + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", bacgeneration=" + bacgeneration + ", category=" + category + "]";
	}
	
	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	

}
