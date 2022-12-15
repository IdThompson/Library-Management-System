package model;

import interfaceService.LibrarianService;
import serviceImplimentation.LibrarianImplement;

import java.util.*;

import static enumServer.Role.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("merby", 7, "Quin", true);
        System.out.println(book1.getBookTitle());

       Queue<LibraryUser> queue = new PriorityQueue<>(new CustomComparator());

       List<LibraryUser> fifoQueue = new LinkedList<>();
       fifoQueue.add(new LibraryUser("junior" , "lalib" , JUNIOR , "1" , book1));
        fifoQueue.add(new LibraryUser("teacher" , "lalib" , TEACHER , "1" , book1));
        fifoQueue.add(new LibraryUser("senior" , "lalib" , SENIOR , "1" , book1));



        queue.offer(new LibraryUser("junior" , "lalib" , JUNIOR , "1" , book1));
       queue.offer(new LibraryUser("teacher" , "lalib" , TEACHER , "1" , book1));
       queue.offer(new LibraryUser("senior" , "lalib" , SENIOR , "1" , book1));

        LibrarianService librarianService = new LibrarianImplement();
        librarianService.librarianLendsABookByPriority(queue);

        System.out.println("-------------------FIFO STARTS HERE----------------------------");

        librarianService.librarianLendsBookByFIFO(fifoQueue);


    }
}