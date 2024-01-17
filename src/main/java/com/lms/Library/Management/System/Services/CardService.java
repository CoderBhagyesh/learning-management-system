package com.lms.Library.Management.System.Services;

import com.lms.Library.Management.System.Entities.LibraryCard;
import com.lms.Library.Management.System.Entities.Student;
import com.lms.Library.Management.System.Enums.CardStatus;
import com.lms.Library.Management.System.Exceptions.CardNotFoundException;
import com.lms.Library.Management.System.Repository.CardRepository;
import com.lms.Library.Management.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;
    @Autowired
    StudentRepository studentRepository;
    public LibraryCard generatedCard() {
        LibraryCard card = new LibraryCard();

        card.setCardStatus(CardStatus.NEW);

        card = cardRepository.save(card);

        return card;
    }

    public String associateStudentWithCard(Integer studentId, Integer cardNo) throws Exception{
        //I am having only the PK of both
        //But I need the Entities to set attributes and save

        Optional<Student> studentOptional = studentRepository.findById(studentId);
        Student student = studentOptional.get();

        Optional<LibraryCard> optionalLibraryCard = cardRepository.findById(cardNo);
        if(!optionalLibraryCard.isPresent()) {
            throw new CardNotFoundException("Card with " + cardNo + " is not Found");
        }

        LibraryCard libraryCard = optionalLibraryCard.get();

        //Setting the required attributes of the libraryCard Entity
        libraryCard.setCardStatus(CardStatus.ACTIVE);
        libraryCard.setNameOnCard(student.getName());
        libraryCard.setStudent(student);

        //Setting the attribute of the student Entity
        student.setLibraryCard(libraryCard);


        studentRepository.save(student);

        return "Card with "+cardNo+" has been associated to student with "+studentId;
    }
}
