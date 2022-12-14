package model;

public abstract class Base {
 private String firstName;
 private String lastName;
 private String id;
 private boolean staff;



 public Base(String firstName, String lastName, String id) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.id = id;

 }

 public Base(String firstName, String lastName, boolean staff) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.staff = staff;
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



 @Override
 public String toString() {
  return "Base{" +
          "firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", id=" + id +
          ", staff=" + staff +
          '}';
 }
}
