package constructorsInJava;
// Question6.Create a class book with fields bookId,title and author.Initialize the fields using the parameterized constructor

public class Book {
	public Book(int bookId,String title,String author) {
		System.out.println("Book ID : " +bookId);
		System.out.println("Title Name : " +title);
		System.out.println("Author Name : " +author);
	}
	public static void main(String[] args) {
		Book b=new Book(4523,"Wings of Fire","A.P.J.Abdul.Kalam");
	}

}
