
/*
 * File name: Invoice.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: lab 6
 * Date: 2022-11-18
 * Professor: Daniel Cormier
 */

/**
 * This is the Invoice class which is an UNRELATED CLASS to the Programmer superclass
 * The Invoice class implements Payme interface.
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 */

public class Invoice implements Payme {

private String partNumber; 
private String partDescription;
private int quantity;
private double pricePerItem;

/**
 * four-argument constructor
 * @param part parts for the invoice
 * @param description describe what item
 * @param count number of items sold
 * @param price the price of the item
 */
public Invoice(String part, String description, int count, 
 double price) {
 partNumber = part;
 partDescription = description;
 setQuantity(count); // validate and store quantity
 setPricePerItem(price); // validate and store price per item
}

//set part number
public void setPartNumber(String part) {
 partNumber = part; // should validate
}

//get part number
public String getPartNumber() {
 return partNumber;
}

//set description
public void setPartDescription(String description) {
 partDescription = description; // should validate
}

//get description
public String getPartDescription() {
 return partDescription;
}

//set quantity
public void setQuantity(int count) {
 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
}

//get quantity
public int getQuantity() {
 return quantity;
}

//set price per item
public void setPricePerItem(double price) {
 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
}

//get price per item
public double getPricePerItem() {
 return pricePerItem;
}

/**
 * return String representation of Invoice object
 */
@Override
public String toString() {
 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem());
} 

/**
 * method required to carry out contract with interface Payme
 */
@Override
public double getPaymentAmount() {
 return getQuantity() * getPricePerItem(); // calculate total cost
}
}


