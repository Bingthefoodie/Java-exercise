
/*
 * File name: CommissionProgrammer.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: lab 6
 * Date: 2022-11-18
 * Professor: Daniel Cormier
 */

/**
 * CommissionProgrammer class extends Programmer.
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 * @see Programmer.java
 */

public class CommissionProgrammer extends Programmer{ 
/**
 * gross weekly sales
 */
private double grossSales; 
/**
 * commission percentage
 */
private double commissionRate; 


/**constructor
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber programmer's social security number
 * @param grossSales commission programmer's gross sales
 * @param commissionRate programmer's commission rate
 */
public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

/**
 * @param grossSales set gross sales amount on the creation of apps
 */
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 

/**
 * @return return gross sales amount 
 */
public double getGrossSales() {
return grossSales;
} 

/**
 * @param commissionRate set commission rate
 */
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

/**
 *@return return commission rate 
 */
//return commission rate
public double getCommissionRate() {
return commissionRate;
} 

/**
 * calculate earnings; override abstract method earnings in Programmer.
 */
@Override                                                           
public double earnings() {                                            
return getCommissionRate() * getGrossSales();                    
}                                             

/**
 * return String representation of CommissionProgrammer object
 */
@Override                                                     
public String toString() {                                  
    return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",     
       "commission programmer", super.toString(),              
       "gross sales", getGrossSales(),                       
       "commission rate", getCommissionRate());              
 } 

}

