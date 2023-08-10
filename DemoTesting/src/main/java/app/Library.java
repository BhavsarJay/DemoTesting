package app;

import java.util.List;

public class Library {
	BookDB db;

	public Library(BookDB db) {
		super(); // WHYYYYY
		this.db= db;
	}

	public List<Book> getBookByCategory(String category){
		if(category.equals("Fiction"))
			return db.getFictionBooks();
		else 
			return null;
	}
}