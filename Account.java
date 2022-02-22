package Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	private int age;
	private String name;
	private int accountNumber = 1000;
	private int phoneNumber;
	private int pin;
	private double balance;
	private static int counter;
	Scanner scnr = new Scanner(System.in);
	private String userChoice;
	
	//Array list for the number of books checked out
	private ArrayList<Book> books;
	
	public Account()
	{
		age = 0;
		this.name = "null";
		accountNumber+= counter;
		phoneNumber = 0000000000;
		pin = 0000;
		balance = 0.00;
		counter++;
		books = new ArrayList<Book>();
	}
	
	public Account(String n)
	{
		age = 0;
		this.name = n;
		accountNumber+= counter;
		phoneNumber = 0000000000;
		pin = 0000;
		balance = 0.00;
		counter++;
		books = new ArrayList<Book>();
	}
	
	
	public void checkoutBook(Book b)
	{
		if(b.getCheckoutStatus() == false)
		{
			if(b.getReservationStatus() == false)
			{
				//books.add(b)
				b.setCheckoutStatus(true);
				System.out.println("You have checked out this book.");
			}
			else
			{
				System.out.println("Book is reserved");
				System.out.println("Would you like to set a reservation? (y/n)");
				userChoice = scnr.nextLine();
				if (userChoice.equals("y"))
				{
					b.setReservation(this);
				}
				else
				{
					System.out.println("Bye");
				}
			}
			
		}
		if(b.getCheckoutStatus() == true)
		{
			System.out.println("Book is checked out.");
			System.out.println("Would you like to set a reservation? (y/n)");
			userChoice = scnr.nextLine();
			if (userChoice.equals("y"))
			{
				b.setReservation(this);
			}
			else
			{
				System.out.println("Bye");
			}
		}
		
		b.removeReservation(this);
		
	}
	 

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Account.counter = counter;
	}
	
	public void print()
	{
		System.out.println();
		System.out.println("Age: " + age);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Pin: " + pin);
		System.out.println("Balance: " + balance);
	}
	

}




