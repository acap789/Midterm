package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	static ArrayList<Course> courselist = new ArrayList<Coiurse>();
	static ArrayList<Semester> semesterlist = new ArrayList<Semester>();
	static ArrayList<Section> sectionList = new ArrayList<Section>();
	static ArrayList<Student> studentlist = new Arraylist<Student>();

	@BeforeClass
	public static void setup() {
	}

	Student S1 = new Student('F', 'M', 'L', new date(), eMajor.BUSINESS, 'Adress', '(123)-123-1234', 'Email@udel.edu' );
	Student S2 = new Student('F', 'M', 'L', new date(), eMajor.CHEM, 'Adress', '(123)-123-1234', 'Email@udel.edu' );
	Student S3 = new Student('F', 'M', 'L', new date(), eMajor.COMPSI, 'Adress', '(123)-123-1234', 'Email@udel.edu' );
	Student S4 = new Student('F', 'M', 'L', new date(), eMajor.NURSING, 'Adress', '(123)-123-1234', 'Email@udel.edu' );
	Student S5 = new Student('F', 'M', 'L', new date(), eMajor.PHYSICS, 'Adress', '(123)-123-1234', 'Email@udel.edu' );
	Student S6 = new Student('F', 'M', 'L', new date(), eMajor.BUSINESS, 'Adress', '(123)-123-1234', 'Email@udel.edu' );
	Student S7 = new Student('F', 'M', 'L', new date(), eMajor.CHEM, 'Adress', '(123)-123-1234', 'Email@udel.edu' );
	Student S8 = new Student('F', 'M', 'L', new date(), eMajor.COMPSI, 'Adress', '(123)-123-1234', 'Email@udel.edu' );
	Student S9 = new Student('F', 'M', 'L', new date(), eMajor.NURSING, 'Adress', '(123)-123-1234', 'Email@udel.edu' );
	Student S10 = new Student('F', 'M', 'L', new date(), eMajor.PHYSICS, 'Adress', '(123)-123-1234', 'Email@udel.edu' );

	Student.add(S1);
	Student.add(S2);
	Student.add(S3);
	Student.add(S4);
	Student.add(S5);
	Student.add(S6);
	Student.add(S7);
	Student.add(S8);
	Student.add(S9);
	Student.add(S10);

	
	
	@Test
	public void test() {
		assertEquals(1, 1);
	}
}