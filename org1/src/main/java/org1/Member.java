package org1;

public class Member {
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	
	//alt + shift + s -> s
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	//alt + shift + s -> r
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	


}
