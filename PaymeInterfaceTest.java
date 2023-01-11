
/*
 * File name: PaymenInterfaceTest.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: lab 6
 * Date: 2022-11-18
 * Professor: Daniel Cormier
 */

/**
 * This is the test for your interface Payme.
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 */

public class PaymeInterfaceTest  {
	/**
	 * 
	 * @param args command line parameter
	 */

	public static void main(String[] args) {

		/**
		 *  CREATE SIX-ELEMENTS Payme array HERE 
		 */

		Payme[] payme=new Payme[6] ;


		/**
		 * POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
		 */

		Invoice invoice1=new Invoice("22776","brakes",3,300);
		Invoice invoice2=new Invoice("33442","gear",5,90.99);
		SalariedProgrammer salariedProgrammer= new SalariedProgrammer("Chioma", "Chidimma","345-67-0001",320);
		HourlyProgrammer hourlyProgrammer= new HourlyProgrammer("Amara","Chukwu","234-56-7770",18.95,40);
		CommissionProgrammer commisionProgammer= new CommissionProgrammer("Peter","Goodman","123-45-6999",16500,0.44);
		BasePlusCommissionProgrammer basePlusCommissionProgrammer=new BasePlusCommissionProgrammer("Ester","Patel","102-34-5888",1200,0.04,720);

		payme[0]=invoice1;
		payme[1]=invoice2;
		payme[2]=salariedProgrammer;
		payme[3]=hourlyProgrammer;
		payme[4]=commisionProgammer;
		payme[5]=basePlusCommissionProgrammer;


		System.out.println("Payment for Invoices and Programmers are processed polymorphically:"); 

		/**
		 * generically process each element in array paymeObjects
		 */

		for (Payme currentPayme : payme) {
			// invoke the toString()method, output currentPayme and its appropriate payment amount
			System.out.printf("%n%s \n", currentPayme.toString()); 
			//determine whether the element is a basePlusCommissionProgrammer
			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				// downcast Payme reference to 
				// BasePlusCommissioProgrammer reference
				BasePlusCommissionProgrammer programmer = 
						(BasePlusCommissionProgrammer) currentPayme;

				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f\n",
						programmer.getBaseSalary());

			} 

			/**
			 * print statement to print all the objects payment due.
			 */
			System.out.printf("payment due: $%,.2f%n",
					currentPayme.getPaymentAmount());
		}
	}
}


