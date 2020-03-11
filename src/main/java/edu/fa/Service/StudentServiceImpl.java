package edu.fa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.Repository.StudentRepository;
import edu.fa.Repository.StudentRepositoryImpl;
import edu.fa.model.Student;


@Service("studentService")
public class StudentServiceImpl implements StudentService {
@Autowired
private StudentRepository studentRepository;

public StudentRepository getStudentRepository() {
	return studentRepository;
}
public void setStudentRepository(StudentRepository studentRepository) {
	System.out.println("nguyen tien dong yeu hoang thi bich hong");
	this.studentRepository = studentRepository;
}
@Autowired
public StudentServiceImpl(StudentRepository studentRepository) {
	super();
	this.studentRepository = studentRepository;
	System.out.println("Contructor injection");
}

public StudentServiceImpl() {
	super();
	System.out.println("Contructor injected");
}

public List<Student> getAllStudent(){
	return studentRepository.getAllStudent();
}

}
