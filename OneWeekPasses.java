package Project;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalDate;
public class OneWeekPasses {
	Timer timer;
	Book book;
	Account account;
	LocalDate date;
	
	public OneWeekPasses(Book book, Account account, LocalDate date)
	{
		timer = new Timer();
		timer.schedule(new task(), 1);
	}
	
	class task extends TimerTask
	{
		public void run()
		{
		book.removeReservation(account);
		}

	}
	
	
	
}
