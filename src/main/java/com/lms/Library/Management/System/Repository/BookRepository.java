package com.lms.Library.Management.System.Repository;

import com.lms.Library.Management.System.Entities.Book;
import com.lms.Library.Management.System.Enums.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findBooksByGenre(Genre genre);
}
