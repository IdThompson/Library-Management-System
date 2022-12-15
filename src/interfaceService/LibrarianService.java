package interfaceService;

import model.LibraryUser;

import java.util.List;
import java.util.Queue;

public interface LibrarianService {
    void librarianLendsABookByPriority(Queue<LibraryUser> libraryUserQueue);

     void librarianLendsBookByFIFO(List<LibraryUser> libraryUsers);
}
