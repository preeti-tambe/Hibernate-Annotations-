package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptbl")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roll; 
	@Column(name="Name")
	private String name;
	@Column(name="Result")
	private double result;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double result) {
		super();
		this.name = name;
		this.result = result;
	}


	public Employee(int roll, String name, double result) {
		super();
		this.roll = roll;
		this.name = name;
		this.result = result;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getresult() {
		return result;
	}
	public void setresult(double result) {
		this.result = result;
	}
	
	
	
	

}