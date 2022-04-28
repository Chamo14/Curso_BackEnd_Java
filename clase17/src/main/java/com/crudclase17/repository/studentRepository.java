package com.crudclase17.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudclase17.entity.Student;

@Repository
public interface studentRepository extends JpaRepository<Student, Long> {
	Student saveStudent(Student student);
	Student updateStudent(Student student,Long id);
	void deleteById(Long id);
	

}
