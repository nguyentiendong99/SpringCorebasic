package edu.fa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.fa.Service.StudentService;

public class EducationApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentService service = context.getBean("studentService", StudentService.class);
		System.out.println(service.getAllStudent().size());
	}
}
