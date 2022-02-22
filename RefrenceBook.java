package Project;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
class RefrenceBook {
	protected int bookNumber;
	protected String publisher;
	protected String bookTitle;
	protected LocalDate publicationDate;
	protected String branchLocation;
	protected Double size;
	private static int counter;
	
	
	public RefrenceBook()
	{
		bookNumber = 1000 + counter;
		publisher = "Null";
		bookTitle = "Title" + counter;
		publicationDate = LocalDate.of(1900, 02, 02);
		branchLocation = "NullLibrary";
		size = 0.0;
		counter++;
	}
	
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public LocalDate getPublicationDate() {
		return publicationDate;
	}
    /*public void setPublicationDate(int year, month int dayOfMonth) {
		this.publicationDate = LocalDate.of();
	}*/
	

	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public void setPublicationDate(int year, int month, int day) {
		this.publicationDate = LocalDate.of(year, month, day);
	}
	public String getBranchLocation() {
		return branchLocation;
	}
	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}
	public Double getSize() {
		return size;
	}
	public void setSize(Double size) {
		this.size = size;
	}
	
	public void print()
	{
		System.out.println();
		System.out.println("Book Number: " + bookNumber);
		System.out.println("Publisher: " + publisher);
		System.out.println("Publication Date: " + publicationDate);
		System.out.println("branchLocation: " + branchLocation);
		System.out.println("Size: " + size);
	}

	
	

}
