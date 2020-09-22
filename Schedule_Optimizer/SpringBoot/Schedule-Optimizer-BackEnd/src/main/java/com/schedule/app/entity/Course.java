package com.schedule.app.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
/**
 * @file Course.java
 * @author Nick Garner, nrgarner Class defines state and behavior for Course
 *         objects which represent courses listed in the NCSU course catalog.
 *         When a student initiates optimization with their chosen degree plan,
 *         required courses are scraped from
 *         https://webappprd.acs.ncsu.edu/php/coursecat/degree_requirements.php,
 *         turned into Course objects, and assembled into an ArrayList to be
 *         compared to the student's current progress from MyPackPortal.
 *
 */
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	// Database ID for this Course record
	private long dbid;

	@Column(name = "department")
	// Abbreviation of the course's department, e.g. CSC
	private String department;

	@Column(name = "coursenumber")
	// Number of the course, e.g. 510
	private int courseNumber;

	@Column(name = "credits")
	// Number of credits the course is worth, e.g. 3
	private int credits;

	@Column(name = "prereq1")
	// Prerequisite for this course, default to null
	private Course prereq1 = null;

	@Column(name = "prereq2")
	// Prerequisite for this course, default to null
	private Course prereq2 = null;

	@Column(name = "prereq3")
	// Prerequisite for this course, default to null
	private Course prereq3 = null;

	@Column(name = "coreq")
	// Corequisite for this course, default to null
	private Course coreq = null;

	@Column(name = "isprereq")
	// Does this course fulfill a prerequisite for another course? Default to false
	private boolean isPrereq = false;

	@Column(name = "allsemesters")
	// Is this course offered all semesters each year? Or just certain semesters?
	private boolean allSemesters;

	@Column(name = "allyears")
	// Is this course offered every year or only odd/even years?
	private boolean allYears;

	@Column(name = "fall")
	// Is this course offered in the Fall semester?
	private boolean fall;

	@Column(name = "spring")
	// Is this course offered in the Spring semester?
	private boolean spring;

	@Column(name = "nextyear")
	// What is the next year this course is offered? E.g. 2020 for offered this year
	private int nextYear;

	/**
	 * Creates a new course object that has no prerequisites or corequisites
	 * 
	 * @param department   Abbreviation of course's department, e.g. CSC
	 * @param courseNumber Number of course, e.g. 510
	 * @param credits      Number of credits course is worth, e.g. 3
	 * @param isPrereq     Does this course fulfill a prerequisite for another
	 *                     course?
	 * @param allSemesters Is this course offered all semesters of the school year?
	 * @param allYears     Is this course offered every year?
	 * @param fall         Is this course offered in the Fall semester?
	 * @param spring       Is this course offered in the Spring semester?
	 * @param nextYear     The next year that this course will be offered, e.g. 2020
	 *                     for current year
	 */
	public Course(String department, int courseNumber, int credits, boolean isPrereq, boolean allSemesters,
			boolean allYears, boolean fall, boolean spring, int nextYear) {
		if (department.length() < 2 || department.length() > 4) {
			throw new IllegalArgumentException("Department abbreviation is not valid.");
		}
		this.department = department;
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.isPrereq = isPrereq;
		this.allSemesters = allSemesters;
		this.allYears = allYears;
		this.fall = fall;
		this.spring = spring;
		this.nextYear = nextYear;
	}

	/**
	 * Creates a new course object that has no prerequisites or corequisites
	 * 
	 * @param department   Abbreviation of course's department, e.g. CSC
	 * @param courseNumber Number of course, e.g. 510
	 * @param credits      Number of credits course is worth, e.g. 3
	 * @param prereq1      Prerequisite for this course, null if none
	 * @param prereq2      Prerequisite for this course, null if none
	 * @param prereq3      Prerequisite for this course, null if none
	 * @param coreq        Corequisite for this course, null if none
	 * @param isPrereq     Does this course fulfill a prerequisite for another
	 *                     course?
	 * @param allSemesters Is this course offered all semesters of the school year?
	 * @param allYears     Is this course offered every year?
	 * @param fall         Is this course offered in the Fall semester?
	 * @param spring       Is this course offered in the Spring semester?
	 * @param nextYear     The next year that this course will be offered, e.g. 2020
	 *                     for current year
	 */
	public Course(String department, int courseNumber, int credits, Course prereq1, Course prereq2, Course prereq3,
			Course coreq, boolean isPrereq, boolean allSemesters, boolean allYears, boolean fall, boolean spring,
			int nextYear) {
		this.department = department;
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.prereq1 = prereq1;
		this.prereq2 = prereq2;
		this.prereq3 = prereq3;
		this.coreq = coreq;
		this.isPrereq = isPrereq;
		this.allSemesters = allSemesters;
		this.allYears = allYears;
		this.fall = fall;
		this.spring = spring;
		this.nextYear = nextYear;
	}

	public long getDbid() {
		return dbid;
	}

	public void setDbid(long dbid) {
		this.dbid = dbid;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public ArrayList<Course> getPrereqs() {
		ArrayList<Course> prereqs = new ArrayList<Course>();
		prereqs.add(prereq1);
		if (prereq2 != null) {
			prereqs.add(prereq2);
		}
		if (prereq3 != null) {
			prereqs.add(prereq3);
		}
		return prereqs;
	}

	public Course getCoreq() {
		return coreq;
	}

	public void setCoreq(Course coreq) {
		this.coreq = coreq;
	}

	public boolean isPrereq() {
		return isPrereq;
	}

	public void setPrereq(boolean isPrereq) {
		this.isPrereq = isPrereq;
	}

	public boolean isAllSemesters() {
		return allSemesters;
	}

	public void setAllSemesters(boolean allSemesters) {
		this.allSemesters = allSemesters;
	}

	public boolean isAllYears() {
		return allYears;
	}

	public void setAllYears(boolean allYears) {
		this.allYears = allYears;
	}

	public boolean isFall() {
		return fall;
	}

	public void setFall(boolean fall) {
		this.fall = fall;
	}

	public boolean isSpring() {
		return spring;
	}

	public void setSpring(boolean spring) {
		this.spring = spring;
	}

	public int getNextYear() {
		return nextYear;
	}

	public void setNextYear(int nextYear) {
		this.nextYear = nextYear;
	}

}
