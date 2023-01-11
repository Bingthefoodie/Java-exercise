/*
 * File name: SalariedProgrammer.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: lab 6
 * Date: 2022-11-18
 * Professor: Daniel Cormier
 */

/**
 * SalariedProgrammer concrete class extends abstract class Programmer.
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 * @see Programmer.java
 */

public class SalariedProgrammer extends Programmer{

/**
 * programmer's weeklySalary
 */
private double weeklySalary;


/**constructor
 *
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber programmer's social security number
 * @param weeklySalary programmer's weekly salary
 * 
 */
public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) {
super(firstName, lastName, socialSecurityNumber); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * @param weeklySalary  set salary
 */
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * @return weeklySalary
 */
public double getWeeklySalary() {
return weeklySalary;
} 

/**
 * calculate earnings; override abstract method earnings in Programmer
 */
@Override                                                           
public double earnings() {                                          
return getWeeklySalary();                                        
}                                            

/**
 * return String representation of SalariedProgrammer object   
 */
@Override                                                  
public String toString() {
return String.format("salaried programmer:%s%n%s: $%,.2f",super.toString(),
  "weekly salary",getWeeklySalary());
} 

}

