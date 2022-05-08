package co.edureka.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id
	@Column(name = "EMP_ID", nullable = false, unique = true)
	private Integer empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name = "EMP_SAL", precision = 2, length = 10)
	private Float empSalary;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}
}
