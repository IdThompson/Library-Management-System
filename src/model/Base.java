package model;

import enumServer.Role;

public abstract class Base {
 private String firstName;
 private String lastName;

 private Role roleValue;
 private String id;
 private boolean staff;
 private Book book;

 public Base(String firstName, String lastName, Role roleValue, String id, Book book) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.roleValue = roleValue;
  this.id = id;
  this.book = book;
 }

 public Base(String firstName, String lastName, boolean staff) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.staff = staff;
 }

 public Base(String bookTitle, int numberOfCopy, String author, boolean available) {
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public Role getRoleValue() {
  return roleValue;
 }

 public void setRoleValue(Role roleValue) {
  this.roleValue = roleValue;
 }

 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public boolean isStaff() {
  return staff;
 }

 public void setStaff(boolean staff) {
  this.staff = staff;
 }

 public Book getBook() {
  return book;
 }

 public void setBook(Book book) {
  this.book = book;
 }

 @Override
 public String toString() {
  return "Base{" +
          "firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", rankValue=" + roleValue +
          ", id='" + id + '\'' +
          ", staff=" + staff +
          ", book=" + book +
          '}';
 }
}
