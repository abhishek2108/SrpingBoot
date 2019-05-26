package com.springlearning.consuming.datamodel;

public class Student {

	private long id;
	private String name;
	private String major;
	private int semester;
	private String homeTown;

	public Student() {

	}

	public Student(String name, String major, int semester, String homeTown) {
		
		this.name = name;
		this.major = major;
		this.semester = semester;
		this.homeTown = homeTown;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", semester=" + semester + ", homeTown="
				+ homeTown + "]";
	}

}
