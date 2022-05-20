package application;

import java.util.Locale;
import java.util.Scanner;

import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new UsaInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}

}
