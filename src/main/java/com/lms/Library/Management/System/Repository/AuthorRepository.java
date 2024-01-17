package com.lms.Library.Management.System.Repository;

import com.lms.Library.Management.System.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
