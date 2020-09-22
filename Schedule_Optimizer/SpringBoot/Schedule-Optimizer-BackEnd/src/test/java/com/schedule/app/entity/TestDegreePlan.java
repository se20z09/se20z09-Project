package com.schedule.app.entity;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestDegreePlan {
	
	DegreePlan dp1;
	ArrayList<Course> courseList;

	@Before
	public void setUp() throws Exception {
		courseList = new ArrayList<Course>();
		courseList.add(new Course("CSC", 510, 3, true, true, true, true, true, 2020));
		dp1 = new DegreePlan("14CSCBS", "CSC", "Computer Science", courseList);
	}

	@Test
	public void testDegreePlan() {
		DegreePlan dp2 = new DegreePlan("14CSCBS", "CSC", "Computer Science", courseList);
		assertEquals(dp1.getName(), dp2.getName());
		assertEquals(dp1.getDegreeId(), dp2.getDegreeId());
		assertEquals(dp1.getDepartment(), dp2.getDepartment());
		assertEquals(dp1.getClass(), dp2.getClass());
		
		try {
			DegreePlan dp3 = new DegreePlan("14CSCBS", "", "Computer Science", courseList);
			fail("Exception did not trigger.");
		} catch (Exception e) {
			assertEquals("Department abbreviation is not valid.", e.getMessage());
		}
		
		try {
			DegreePlan dp4 = new DegreePlan("14CSCBS", "MATHS", "Computer Science", courseList);
			fail("Exception did not trigger.");
		} catch (Exception e) {
			assertEquals("Department abbreviation is not valid.", e.getMessage());
		}
	}

	@Test
	public void testSetDegreeId() {
		dp1.setDegreeId("14CHEBS");
		assertEquals("14CHEBS", dp1.getDegreeId());
	}

	@Test
	public void testSetDepartment() {
		dp1.setDepartment("PCC");
		assertEquals("PCC", dp1.getDepartment());
		try {
			dp1.setDepartment("");
			fail("Exception did not trigger.");
		} catch (Exception e) {
			assertEquals("Department abbreviation is not valid.", e.getMessage());
		}
		try {
			dp1.setDepartment("MATHS");
			fail("Exception did not trigger.");
		} catch (Exception e) {
			assertEquals("Department abbreviation is not valid.", e.getMessage());
		}
	}

	@Test
	public void testSetName() {
		try {
			dp1.setName("");
			fail("Exception did not trigger.");
		} catch (Exception e) {
			assertEquals("Name cannot be blank.", e.getMessage());
		}
		dp1.setName("Polymer & Color Chemistry");
		assertEquals("Polymer & Color Chemistry", dp1.getName());
	}

}
