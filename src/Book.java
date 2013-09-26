
public class Book {
	private static String TAG = "Book";
	
	private String title;
	private int pages;

	private static String publisher="Home Inc.";
	public Book(String s) {title = s; pages = 100; }

	public String getTitle(){return title;}
}
