package com.pdvtechnocrats.Details;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="prospect_name")
	private String name;
	@Column(name="demographic")
	private String demographic;
	@Column(name="source")
	private String source;
	
	@Column(name="added")
	private String addedBy;
	@Column(name="date_added")
	private String date;
	@Column(name="set_type")
	private String set;
	@Column(name="how_many")
	private int nums;
	@Column(name="details_info")
	private String details;
	
	public Details(String name, String demographic, String source, String addedBy, String date, String set, int nums,
			String details) {
		super();
		this.name = name;
		this.demographic = demographic;
		this.source = source;
		this.addedBy = addedBy;
		this.date = date;
		this.set = set;
		this.nums = nums;
		this.details = details;
	}
	
	public Details(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDemographic() {
		return demographic;
	}
	public void setDemographic(String demographic) {
		this.demographic = demographic;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAddedBy() {
		return this.addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSet() {
		return set;
	}
	public void setSet(String set) {
		this.set = set;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
