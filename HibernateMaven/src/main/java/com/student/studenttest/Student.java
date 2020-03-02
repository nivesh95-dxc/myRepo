package com.student.studenttest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.services.StudentService;

public class Student {

	public static void main(String[] args) {
		ApplicationContext appContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService=(StudentService)appContext.getBean("studentBean");
		String message=studentService.getName()+ " "+studentService.getAge()+" "+studentService.getRollNo();
		System.out.println(message);

	}

}
