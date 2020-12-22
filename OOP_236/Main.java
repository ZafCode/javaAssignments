package assignments.replit.OOP_236;

public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book(2,"cemil Meric","BU üLKe",468);
		Book book2 = new Book();
		book2.setAuthor("ihsan oktay anar");
		book2.setId(1);
		book2.setPages(500);
		book2.setTitle("puslu kitalar Atlasi");
		Book book3 = new Book(3,"ali","kis günesi",50);
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		
		System.out.println(Shelf.addBook(book1));
		System.out.println(Shelf.addBook(book2));
		System.out.println(Shelf.addBook(book3));
		System.out.println(Shelf.addBook(2,"dostoyevski" , "suc VE ceZa", 1000));
		System.out.println(Shelf.addBook(5,"dosToyevski" , "karamozov kardesler", 99));
		Shelf.addBook(6,"dostoyevski" , "yeraltindan notlar", 299);
		System.out.println(Shelf.getTheBooks().toString());
		
		
//		Shelf.removeBook(2);
		Shelf.removeBook("dostoYevski");
		
		System.out.println(Shelf.getTheBooks().toString());
		
//		System.out.println(Shelf.getAllBooksForAuthor("dostoyevski").toString());
		
		Shelf.clearBookShelf();
		System.out.println(Shelf.isShelfEmpty());
		
		

	}

}
