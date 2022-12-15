package model;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Librarian extends Base{



    public Librarian(String firstName, String lastName, boolean staff) {
        super(firstName, lastName, staff);
    }

    private Queue<LibraryUser> queue = new PriorityQueue<>();

}
