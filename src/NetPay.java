/*
 * [NetPay].java
 * Author:  [Joseph Nguyen] 
 * Submission Date:  [1/23/2020]
 *
 * Purpose: The purpose of this program is to calculate the net pay after taking off the deductions from the gross pay which is
 *calculated based on an input of how many hours have been worked for the week.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class NetPay {

	//declaration of constants
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;

	public static void main(String[] args) {

		//this is to make it so that you can keyboard input how many hours was worked
		int hoursPerWeek;
		System.out.print("Hours Per Week:\t\t");
		Scanner keyboard = new Scanner(System.in);
		hoursPerWeek = keyboard.nextInt();

		//this is calculating the gross pay
		double grossPay;
		grossPay = hoursPerWeek * PAY_PER_HOUR;

		//this is all of the deduction category calculations
		double federal = grossPay * (FEDERAL_TAX_PERCENT/100);
		double state = grossPay * (STATE_TAX_PERCENT/100);
		double socialSecurity = grossPay * (SS_PERCENT/100);
		double medicare = grossPay * (MEDICARE_PERCENT/100);
		double deductions;
		deductions = federal + state + socialSecurity + medicare;

		//this is the net pay calculation
		double netPay;
		netPay = grossPay - deductions;

		//this is to print out all of the information that was calculated and coded into the required format
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);

		keyboard.close();

	}

}
