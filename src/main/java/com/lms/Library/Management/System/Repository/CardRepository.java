package com.lms.Library.Management.System.Repository;

import com.lms.Library.Management.System.Entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard, Integer> {

}
