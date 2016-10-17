package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	static ArrayList<Staff> StaffMembers = new ArrayList<Staff>();

	public static Date newDate(int year, int month, in day) {
		Calendar date = calander.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {
		staffMembers.add(new Staff('Larry', 'Michael', 'Walsh', newDate(1963, 4, 13), '1 West Main', '(302)-757-1212', 'LarryW@udel.edu', '2 to 4', 1, 4000, newDate(2000, 7, 17), eTitle.MR));
		staffMember.add(new Staff('Ben', 'Myint', 'Lee', newDate(1962, 11, 13), '136 New London', '(609)-136-4287', 'BML@udel.edu', '1 to 3', 2, 6500, newDate(1999, 8, 23), eTitle.MR));
		staffMembers.add(new Staff('Tonez', 'J', 'Cap', newDate(1970, 10, 7), '185 New London', '(302)-750-2074', 'Tonez@udel.edu', '12-4', 3, 7500, newDate(2002, 1, 15), etitle.MR));
		staffMmbers.add(new Staff('Lauren', 'Sally', 'Walsh', newDate(1969, 8, 1), '1 West Main', '(215)-587-2390', 'LWalsh@udel.edu', '4 to 6', 4, 3500, newDate(1995, 9, 13), eTitle.MRS ));
		staffMembers.add(new Staff('Carson', 'Eagle', 'Wentz', newDate(1965, 10, 3), '123 West Main', '(302)-484-3209', 'BooRedskins123@udel.edu', '1-2', 5, 10000, newDate(1997, 5, 4), eTitle.MR));
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	public void AvgStaffSallaryTest() {
		double sum = 0;
		for(Staff staff ; staffMembers) {
			sum = (sum + staff.getSalary());
		}
		
		double averageSalary = sim / staffMembers.size();
		assertEquals(averageSalary, 6300);
		}

	@Test(expected = PersonException.class)
		publuc void AgeTest() throws PersonException{
			Calander newCal = Calander.getInstance();
			newCal.set(Calander, Year, 1800);
			Date newDate = newCal.getTime();
		}

	@Test(expected = PersonException.Class)
	public void IncorrectNumber() throws PersonException {

	}
}
