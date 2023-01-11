/*
 * File name: Programmer.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: lab 6
 * Date: 2022-11-18
 * Professor: Daniel Cormier
 */

/**
 * Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 */

public abstract class Programmer implements Payme {
/**
 * first name of programmer
 */
private String firstName;
/**
 * last name of programmer
 */
private String lastName;
/**
 * programmer's SSN
 */
private String socialSecurityNumber;

/**constructor
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber programmer's social security number
 */
public Programmer(String firstName, String lastName, String socialSecurityNumber) {
 this.firstName = firstName;
 this.lastName = lastName;
 this.socialSecurityNumber = socialSecurityNumber;
}
/**
 * getter and setter for the programmer's firstname, lastname and SSN
 * 
 */
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

public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}

/**
 * return String representation of Programmer object
 */
@Override
public String toString() {
return String.format(" %s %s%n%s: %s", 
  getFirstName(), getLastName(),"social security number", getSocialSecurityNumber());
} 

/**
 * abstract class must be overridden by concrete subclass
 * @return will return earnings of the programmer
 **/

public abstract double earnings(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/

public double getPaymentAmount() {
	return earnings();
}
}

