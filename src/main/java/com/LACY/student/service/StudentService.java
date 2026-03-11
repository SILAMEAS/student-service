package com.LACY.student.service;

import com.LACY.student.model.Student;
import com.LACY.student.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Transactional
  public void save(Student student) {
    this.studentRepository.save(student);
  }

  @Transactional(readOnly = true)
  public List<Student> list() {
    return this.studentRepository.findAll();
  }

  @Transactional(readOnly = true)
  public List<Student> listBySchool(Long schoolId) {
    return this.studentRepository.findAllBySchoolId(schoolId);
  }
}
