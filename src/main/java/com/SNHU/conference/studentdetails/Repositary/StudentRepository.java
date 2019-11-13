package com.SNHU.conference.studentdetails.Repositary;

import com.SNHU.conference.studentdetails.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
