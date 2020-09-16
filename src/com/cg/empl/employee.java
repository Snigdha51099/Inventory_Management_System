package com.cg.empl;

public class employee {

	private String empId;
	private String empName;
	private String password;
	public employee(String empId, String empName, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.password = password;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", password=" + password + "]";
	}
}
