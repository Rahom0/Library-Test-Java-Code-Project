package Project;
import java.util.HashMap;
public class Library {
	
	
	HashMap<Integer, Account> person;
	HashMap<Integer, RefrenceBook> book;
	
	public Library()
	{
		person = new HashMap<Integer, Account>();
		book = new HashMap<Integer, RefrenceBook>();
	}
	
	public HashMap<Integer, RefrenceBook> getBooks()
	{
		return book;
	}
	public HashMap<Integer, Account> getAccounts()
	{
		return person;
	}
	
	public void addBook()
	{
		RefrenceBook b = new RefrenceBook();
		book.put(b.getBookNumber(), b);
	}
	
	public void addAccount(String name)
	{
		Account a = new Account(name);
		person.put(a.getAccountNumber(), a);
	}
	
	public int getNumberOfBooks()
	{
		System.out.println(book.size());
		return book.size();
		
	}

	public RefrenceBook getBook(int x)
	{
		return book.get(x);
	}
	
}




