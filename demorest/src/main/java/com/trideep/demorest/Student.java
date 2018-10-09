package com.trideep.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Student {

	private String name;
	private int point;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Alien [name=" + name + ", point=" + point + ", id=" + id + "]";
	}
	
	
}
