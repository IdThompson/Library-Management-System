package model;

import enumServer.Role;

public class LibraryUser extends Base{
    public LibraryUser(String firstName, String lastName, Role roleValue, String id, Book book) {
        super(firstName, lastName, roleValue, id, book);
    }


}
