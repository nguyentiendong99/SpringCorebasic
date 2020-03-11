package edu.fa.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.fa.model.Student;
@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {
	public List<Student> getAllStudent(){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("nguyen tien dong","ha noi"));
		return studentList;
	}

}
