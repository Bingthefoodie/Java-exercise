
/*
 * File name: HourlyProgrammer.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: lab 6
 * Date: 2022-11-18
 * Professor: Daniel Cormier
 */

/**
 * HourlyProgrammer class extends Programmer.
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 * @see Programmer.java
 */

public class HourlyProgrammer extends Programmer{
/**
 *  wage per hour
 */
private double wage; 
/**
 *  hours worked for week
 */
private double hours; 

/**constructor
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber programmer's social security number
 * @param wage  programmer's wage
 * @param hours programmer's working hours
 */
public HourlyProgrammer(String firstName, String lastName,String socialSecurityNumber, double wage, double hours) {
super(firstName, lastName, socialSecurityNumber);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

/**
 * @param wage  set wage
 */
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

/**
 * @return  return wage
 */
public double getWage() {
return wage;
} 

/**
 * @param hours  set hours worked
 */
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

/**
 * @return  return hours worked
 */
public double getHours() {
return hours;
} 

/**
 * calculate earnings; override abstract method earnings in Programmer
 */
@Override                                                           
public double earnings() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          

/**
 * return String representation of HourlyProgrammer object              
 */
@Override                                                             
    
public String toString() {
return String.format("hourly programmer: %s%n%s: $%,.2f; %s: %,.2f", super.toString(),
   "hourly wage",getWage(),"hours worked", getHours() );
} 
                     
}

