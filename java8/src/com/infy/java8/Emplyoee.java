package com.infy.java8;

public class Emplyoee {

	int empId;
	char gender;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Emplyoee [empId=" + empId + ", gender=" + gender + "]";
	}

}
