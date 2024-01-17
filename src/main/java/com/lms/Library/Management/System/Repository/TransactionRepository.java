package com.lms.Library.Management.System.Repository;

import com.lms.Library.Management.System.Entities.Book;
import com.lms.Library.Management.System.Entities.LibraryCard;
import com.lms.Library.Management.System.Entities.Transaction;
import com.lms.Library.Management.System.Enums.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    Transaction findTransactionByBookAndCardAndTransactionStatus(Book book, LibraryCard card, TransactionStatus issued);
}
