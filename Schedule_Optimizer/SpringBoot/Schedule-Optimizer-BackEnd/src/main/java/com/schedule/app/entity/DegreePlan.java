package com.schedule.app.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plans")
/**
 * @file DegreePlan.java
 * @author Nick Garner, nrgarner Class defines state and behavior for a
 *         DegreePlan object that is a set of courses required to attain a
 *         specific degree. These objects are based off of the plans listed at
 *         https://webappprd.acs.ncsu.edu/php/coursecat/degree_requirements.php.
 *         Course List will be scraped from the above site and assimilated into
 *         the program when the user initiates optimization at runtime.
 *
 */
public class DegreePlan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	// Database id for this degree plan record
	private long dbid;

	@Column(name = "degreeId")
	// Degree plan identifier in NCSU system, e.g. 14CSCBS
	private String degreeId;

	@Column(name = "department")
	// 3-letter department abbreviation, e.g. CSC
	private String department;

	@Column(name = "name")
	// Name of major/degree, e.g. Computer Science
	private String name;

	@Column(name = "requiredcourses")
	// ArrayList of courses required to complete degree
	private ArrayList<Course> courseList;

	/**
	 * Constructor, creates a new DegreePlan object
	 * 
	 * @param degreeId   Registrar's designator for this degree plan, e.g. 14CSCBS
	 * @param department Abbreviation of degree's department e.g. CSC
	 * @param name       Name of major, e.g. Computer Science
	 * @param courseList ArrayList of courses required to complete degree
	 */
	public DegreePlan(String degreeId, String department, String name, ArrayList<Course> courseList) {
		if (department.length() < 2 || department.length() > 4) {
			throw new IllegalArgumentException("Department abbreviation is not valid.");
		}
		this.degreeId = degreeId;
		this.department = department;
		this.name = name;
		this.courseList = courseList;
	}

	public String getDegreeId() {
		return degreeId;
	}

	public void setDegreeId(String degreeId) {
		this.degreeId = degreeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if (department.length() < 2 || department.length() > 4) {
			throw new IllegalArgumentException("Department abbreviation is not valid.");
		}
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
