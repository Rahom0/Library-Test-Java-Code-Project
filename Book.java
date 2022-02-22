package Project;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Book extends RefrenceBook {
	private Account[] reservations;
	private final int reservationTime = 2;
	private double totalReservationTime;
	int numberOfReservations = 0;
	private LocalDate timer;
	private final int maxReservations = 20;
	private boolean reserveStatus = false;



	private boolean checkoutStatus = false;
	
	public Book()
	{
		reservations = new Account[maxReservations];
	}
	
	//Checks out book (Maybe make this into a book class that checks if
	   // book is available for checkout. Have a book.getreservation status
	   // after reservation lines.

		//Make sure to call remove reservation when used in Account class.
	
	/*public void checkOut() 
	{
		//Checks if book is neither checked out nor reserved.
		if (checkoutStatus == false && reserveStatus == false)
		{
			checkoutStatus = true;
			System.out.println();
			System.out.println("You have checked out this book: " + bookTitle);
		}
		
		//Checks if book is reserved but not checked out.
		else if (checkoutStatus == false && reserveStatus == true)
		{
			System.out.println();
			System.out.println(bookTitle + " is reseved.");
		}
		
		//Checks if books checked out but not reserved.
		else if (checkoutStatus == true && reserveStatus == false)
		{
			System.out.println();
			System.out.println(bookTitle + " is checked out.");
		}
		
		//Runs if book is both checked out and reserved.
		else
		{
			System.out.println();
			System.out.println(bookTitle + " is checked out and has, " + numberOfReservations + " reservations.");
			
		}
		
	}*/
	
	
	
	
	
	
	//Sets reservation
	

	public void setReservation(Account e) 
	{
		boolean check = false;
		
		System.out.println();

		for (int i = 0; i < reservations.length; ++i) // Checks if user is in books reservation Array.
		{
			if(reservations[i] == e)
			{
				check = true;
				break;
			}
		}
		
		if(check == true) //Checks if user has reserved book already.
		{
			System.out.println();
			System.out.println("This book: " + bookTitle + " has already been reserved by that user");
			return;
		}
		
		
		if(numberOfReservations >= reservations.length) // checks if number of reservations is enough to fill up size of array.
		{
			System.out.println();
			System.out.println("This book: " + bookTitle + " already has" + reservations.length + "reservations.");
			System.out.println(reservations.length);
			System.out.println(reservations[0]);
			return;
		}
		
		
		reservations[numberOfReservations] = e;
		if ((numberOfReservations + 1) == 1) // Checks if number of items in array is singuar.
		{
			System.out.println();
			System.out.println(e.getAccountNumber() + " has reserved " + bookTitle + ", this book has " + (numberOfReservations + 1) + " reservations.");
			++numberOfReservations; //increments i variable, which is global to entire class.
			return;
		}
		
		else;
		System.out.println();
		System.out.println(e.getAccountNumber() + " has reserved " + bookTitle + ", this book has " + (numberOfReservations + 1) + " reservations.");
		numberOfReservations++; //Increments i variable, which is global to entire class.
	}
	
	
	
	
	
	//removes reservation
	
	
	public void removeReservation(Account e)
	{
		for (int i = 0; i < reservations.length; ++i) //loops through array
		{
			if (reservations[i] == e) // checks of account e exists in array.
			{
				for(int j = i; j < reservations.length - 1; ++j) // replaces shifts array onto e's index.
				{
					reservations[j] = reservations[j + 1];
				}
				numberOfReservations--;
				reservations[reservations.length - 1] = null; // replaces last index of Array with null.
			}
		}
		
		System.out.println("");
		System.out.println("You have removed, " + e.getAccountNumber() + "\'s reservation on " + bookTitle + ".");
	}
	
	
	
	
	public boolean getReservationStatus() {
		return reserveStatus;
	}

	public void setReservationStatus(boolean reserveStatus) {
		this.reserveStatus = reserveStatus;
	}
	
	
	
	
	//prints all reservations
	
	public void printReservations()
	{
		for (int i = 0; i < reservations.length; ++i)
		{
			if (reservations [i] != null)
			System.out.print(reservations[i].getAccountNumber() + " ");
		}
	}
	
	
	
	//gets the number of Reservations
	
	public int getNumberOfReservatons() // gets the number of reservations.
	{
		System.out.println();
		System.out.println("The number of reservations is: " + numberOfReservations);
		return numberOfReservations;
		
	}
	
	
	
	
	
	//Returns book and changes its status to not checked out.
	
	public void returnBook()
	{
		System.out.println("You have returned " + bookTitle);
		checkoutStatus = false;
	}
	
	public void setCheckoutStatus(boolean b)
	{
		checkoutStatus = b;
	}
	
	public boolean getCheckoutStatus()
	{
		return checkoutStatus;
	}
	
	
	
	/*public void timer()
	{
		
		LocalDate day = LocalDate.now().plusDays(7);
		
		if (day.getDayOfWeek() == DayOfWeek.SATURDAY)
		{
			day.plusDays(2);
		}
		
		if(day.getDayOfWeek() == DayOfWeek.SUNDAY)
		{
			day.plusDays(1);
		}
		
		new Timer (1000, removeReservations()).start;
		
	}*/
	
	@Override
	public void print()
	{
		super.print();
		
		totalReservationTime = numberOfReservations * reservationTime;
		System.out.println();
		System.out.println("Number of reservations: " + numberOfReservations);
		System.out.println("Total Reservation Time: " + totalReservationTime + " days.");
	}
	

}
