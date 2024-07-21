package com.spring;
import org.springframework.context.support.*;
import org.springframework.context.*;
public class StudentTest {
	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student1=(Student)context.getBean("Student1");
		System.out.println(student1);
	}
}
