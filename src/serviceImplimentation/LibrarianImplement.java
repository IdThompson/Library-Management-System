package serviceImplimentation;

import enumServer.Role;
import interfaceService.LibrarianService;
import model.Book;
import model.CustomComparator;
import model.LibraryUser;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class LibrarianImplement implements LibrarianService {

    @Override
    public void librarianLendsABookByPriority(Queue<LibraryUser> libraryUserQueue) {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-8s  %20s  %20s %20s %20s %n" , "NAME" , "ROLE" , "BOOK TITLE" , "NO. COPIES" , "AUTHOR");
        System.out.println("--------------------------------------------------------------------------------------------");
        Iterator iterator = libraryUserQueue.iterator();
        while (iterator.hasNext()){
            processBookLending(libraryUserQueue.poll());
        }
    }

    public void librarianLendsBookByFIFO(List<LibraryUser> libraryUsers){
        for (LibraryUser libraryUser : libraryUsers){
            if (libraryUser.getRoleValue() != Role.TEACHER){
                processBookLending(libraryUser);
            }
        }
    }

    private void processBookLending(LibraryUser libraryUser){
        if (checkBookAvailability(libraryUser.getBook())){
            libraryUser.getBook().setNumberOfCopy(libraryUser.getBook().getNumberOfCopy() - 1);
            System.out.printf("%-8s  %20s  %20s %20s %20s %n" , libraryUser.getFirstName() , libraryUser.getRoleValue().toString() , libraryUser.getBook().getBookTitle() , String.valueOf(libraryUser.getBook().getNumberOfCopy()), libraryUser.getBook().getAuthor());

        }else {
            System.out.println("Book Already Taken");
        }
    }

    private boolean checkBookAvailability(Book book){
        if (book.getNumberOfCopy() < 1){
            book.setAvailable(false);
            return false;
        }
        return true;
    }
}
