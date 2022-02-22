package Project;

public class TestLIB {
	public static void main(String[] args) {
		
		Library place = new Library();
		RefrenceBook one = new RefrenceBook();
		RefrenceBook two = new RefrenceBook();
		Book novel = new Book();
		Account person = new Account();
		Account person2 = new Account();
		Account person3  = new Account();
		
		
		
		person.checkoutBook(novel);
		
		System.out.println("One");
		
		novel.setReservation(person);
		
		System.out.println("TWO");
		
		person.checkoutBook(novel);
		
		novel.setReservation(person2);
		
		System.out.println("Three");
		
		novel.setReservation(person3);
		
		System.out.println("Four");
		
		novel.setReservation(person);
		
		System.out.println("Marked.");
		
		novel.getNumberOfReservatons();
		
		novel.printReservations();
		
		novel.removeReservation(person2);
		
		novel.printReservations();
		
		novel.getNumberOfReservatons();
		
		novel.setReservation(person3);
		
		novel.getNumberOfReservatons();
		
		novel.print();
		
		
		/*System.out.println(novel.getBookNumber());
		
		
		place.getNumberOfBooks();
		
		place.addBook(novel);
		
		place.getNumberOfBooks();
		
		place.addBook(novel);
		
		place.getNumberOfBooks();
		
		System.out.println(place.getBook(1002));
		
		
		person.print();
		
		one.print();
		
		System.out.println();
		
		one.setPublicationDate(2020, 05, 02);
		
		one.print();
				
		System.out.println();
		
		System.out.println(one.getPublicationDate());	
		
		System.out.println();
		
		two.print();
		
		System.out.println();
		
		novel.print();
		
		novel.checkOut();
		novel.checkOut();
		*/
	}

}
