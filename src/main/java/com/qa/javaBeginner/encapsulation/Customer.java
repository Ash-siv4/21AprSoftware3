package com.qa.javaBeginner.encapsulation;

public class Customer {

	// read & write

	// attributes/variables
	private String name;
	private int age;
	private String address;
	private int accoutNo;

	// constructors - also shows overloading
	public Customer() {

	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Customer(int age, String address, int accoutNo) {
		super();
		this.age = age;
		this.address = address;
		this.accoutNo = accoutNo;
	}

	public Customer(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Customer(String name, int age, String address, int accoutNo) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.accoutNo = accoutNo;
	}

	// getters & setters methods
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAccoutNo() {
		return accoutNo;
	}

	public void setAccoutNo(int accoutNo) {
		this.accoutNo = accoutNo;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", address=" + address + ", accoutNo=" + accoutNo + "]";
	}
	
	public int add(int a,int b) {
		return 0;
	}
	
	public boolean bool() {
		return true;
	}

}
