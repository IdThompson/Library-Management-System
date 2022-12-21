package model;

import interfaceService.LibrarianService;
import serviceImplimentation.LibrarianImplement;

import java.util.*;

import static enumServer.Role.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Law of finance", 04, "JO Thompson", true);
        System.out.println(book1.getBookTitle());

//       Queue<LibraryUser> queue = new PriorityQueue<>(new CustomComparator());
// Below is FIFO
       List<LibraryUser> fifoQueue = new LinkedList<>();
       fifoQueue.add(new LibraryUser("Idowu" , "Toluwani" , JUNIOR , "1" , book1));
        fifoQueue.add(new LibraryUser("Thompson" , "Stephen" , TEACHER , "1" , book1));
        fifoQueue.add(new LibraryUser("Emmanuel" , "Olukunle" , SENIOR , "1" , book1));


//Below is Priority
        PriorityQueue<LibraryUser> queue = new PriorityQueue<>();

        queue.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        queue.offer(new LibraryUser("Daniel" , "James" , JUNIOR , "1" , null));
       queue.offer(new LibraryUser("Tobi" , "James" , TEACHER , "1" , book1));
       queue.offer(new LibraryUser("Phoebe" , "Great" , SENIOR , "1" , book1));

        LibrarianService librarianService = new LibrarianImplement();
        librarianService.librarianLendsABookByPriority(queue);

        System.out.println("-------------------FIFO STARTS HERE----------------------------");

        librarianService.librarianLendsBookByFIFO(fifoQueue);


    }
}