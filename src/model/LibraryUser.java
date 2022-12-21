package model;

import enumServer.Role;

public class LibraryUser extends Base{
    public LibraryUser(String firstName, String lastName, Role roleValue, String id, Book book) {
        super(firstName, lastName, roleValue, id, book);
    }


    @Override
    public int compareTo(Base o) {
        return this.getRoleValue().getRole() > o.getRoleValue().getRole() ? -1 : 1;
    }
}
