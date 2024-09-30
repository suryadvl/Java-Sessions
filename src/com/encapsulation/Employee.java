package com.encapsulation;

public class Employee {
	
	
	// private variables and hiding the data meme. 
	private String Name;
	private int Age;
	private double salary;
	private boolean isPerm;
	public Employee(String name, int age, double salary, boolean isPerm) {
		Name = name;
		Age = age;
		this.salary = salary;
		this.isPerm = isPerm;
	}
	
	
	
	// public setters and getters
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPerm() {
		return isPerm;
	}
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
		
	
	
	
	
	
	
	
}
