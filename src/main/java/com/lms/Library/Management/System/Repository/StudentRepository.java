package com.lms.Library.Management.System.Repository;

import com.lms.Library.Management.System.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
