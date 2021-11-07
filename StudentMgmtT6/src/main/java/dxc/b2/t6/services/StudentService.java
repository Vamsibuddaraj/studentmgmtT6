package dxc.b2.t6.services;
import java.util.List;

import dxc.b2.t6.entity.Student;

public interface StudentService
{
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);

	Student updateStudent(Student student);

	void deleteStudentById(Long id);
}