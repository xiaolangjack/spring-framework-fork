package com.jack.model;

/**
 * Created By: yy<workinglang@163.com>
 * Created At: 2022/5/2 0:29
 * <p></p>
 */

public class Person {
	private String name;
	private String age;

	private Address address;


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person() {
	}

	public Person(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				", address=" + address +
				'}';
	}
}
