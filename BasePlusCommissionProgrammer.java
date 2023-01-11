

/*
 * File name: BasePlusCommissionProgrammer.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: lab 6
 * Date: 2022-11-18
 * Professor: Daniel Cormier
 */

/**
 * BasePlusCommissionProgrammer class extends CommissionProgrammer.
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 * @see CommissionProgrammer.java
 */


public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
/**
 * base salary per week
 */
private double baseSalary; 

/**
 * constructor
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber programmer's social security number
 * @param grossSales commission programmer's gross sales
 * @param commissionRate programmer's commission rate
 * @param baseSalary programmer's base salary amount
 */
public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

/**
 * @param baseSalary  set base salary of the programmer
 */ 
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

/**
 * @return  return base salary
 */
public double getBaseSalary() {
return baseSalary;
}

/**
 * calculate earnings; override method earnings in CommissionProgrammer
 */
@Override                                                            
public double earnings() {                                             
return getBaseSalary() + super.earnings();                        
} 

/**
 * return String representation of BasePlusCommissionProgrammer object
 */
@Override                                                            
public String toString() {

return String.format("%s %s; %s: $%,.2f",                        
        "base-plus", super.toString(),                            
        "base salary", getBaseSalary());
} 

}



