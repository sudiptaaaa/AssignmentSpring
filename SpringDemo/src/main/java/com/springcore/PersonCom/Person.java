package com.springcore.PersonCom;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class Person {
	
	@Value("101")
	private String id;
	
	@Value("Sudipta")
	private String name;
	
	@Value("Intern")
	private String desng;
	
	@Value("#{alist}")
	private List<String> contact;
	
	@Value("#{blist}")
	private List<String> projects;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesng() {
		return desng;
	}
	public void setDesng(String desng) {
		this.desng = desng;
	}
	public List<String> getContact() {
		return contact;
	}
	public void setContact(List<String> contact) {
		this.contact = contact;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String id, String name, String desng, List<String> contact, List<String> projects) {
		super();
		this.id = id;
		this.name = name;
		this.desng = desng;
		this.contact = contact;
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", desng=" + desng + ", contact=" + contact + ", projects="
				+ projects + "]";
	}
	
	
}
