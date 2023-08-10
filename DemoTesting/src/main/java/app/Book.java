package app;

public class Book {
	private String title;
	private String catergory;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCatergory() {
		return catergory;
	}
	public void setCatergory(String catergory) {
		this.catergory = catergory;
	}
	public Book(String title, String catergory) {
		super();
		this.title = title;
		this.catergory = catergory;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", catergory=" + catergory + "]";
	}
	
	
}
