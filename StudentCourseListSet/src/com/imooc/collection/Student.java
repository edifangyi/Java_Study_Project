package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Ñ§ÉúÀà
 * @author Administrator
 *
 */
public class Student {

	public String id;
	
	public String name;
	
	public Set<Course> courses;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.courses = new HashSet<Course>();
	}
}
