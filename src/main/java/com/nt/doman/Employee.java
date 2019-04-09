package com.nt.doman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;



@Data
@XmlRootElement(name="Employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	
	private int empid;
	private String name;
	private int salary;
	private String email;
		
}
