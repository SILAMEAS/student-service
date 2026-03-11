package com.LACY.student.repository;

import com.LACY.student.model.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository
    extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {
  List<Student> findAllBySchoolId(Long schoolId);
}
