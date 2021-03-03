package com.greatwits.rasika;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeOperationGreatwits")
public class EmployeeVo {
	@Id
	@Column(length = 3)
	private int EmployeeId;
	@Column(length = 10)
	private String EmployeeName;
	@Column(length = 10)
	private String EmployeeLastName;
	@Column(length = 2)
	private String EmployeeAge;
	@Column(length = 10)
	private String EmployeePhoneNo;

	public String getEmployeeName() {
		return EmployeeName;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeLastName() {
		return EmployeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		EmployeeLastName = employeeLastName;
	}

	public String getEmployeeAge() {
		return EmployeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		EmployeeAge = employeeAge;
	}

	public String getEmployeePhoneNo() {
		return EmployeePhoneNo;
	}

	public void setEmployeePhoneNo(String employeePhoneNo) {
		EmployeePhoneNo = employeePhoneNo;
	}

}
