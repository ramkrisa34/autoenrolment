package uk.friendslife.autoenrolment.web.validation.datacleansing;

import java.io.Serializable;

/**
 * This is model class containing employee detail
 * @author Ram
 *
 */

public class EmployeeDetailValidator implements Serializable {
	/**
	 * Serial version id
	 */
	private static final long serialVersionUID = 2092250989482426636L;
	
	private String name;
	private int age;
	private float salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
