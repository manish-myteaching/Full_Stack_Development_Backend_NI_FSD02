package java8interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MultipalSortingDemo {

	public static void main(String[] args) {

		List<Book> listBooks = Arrays.asList(new Book("101", "Java", "GS", 5000.0),
				new Book("112", "J2ME", "ABC", 5500.0), new Book("109", "SpringBoot", "Road Johansan", 8000.88),
				new Book("103", "J2EE", "AAA", 6600.0), new Book("1113", "JRRR", "BBB", 6000.0),
				new Book("102", "Spring", "Interface21", 5070.0), new Book("111", "Design Pattern", "Kelvin", 8008.88),
				new Book("105", "Hibernate", "Ke", 5670.0), new Book("108", "DS", "ABC", 7000.0),
				new Book("112", "A", "NX", 7800.99));

		Comparator<Book> sortByName = (b1, b2) -> b1.getName().compareTo(b2.getName());
		Comparator<Book> sortByAuthor = (b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor());
		Comparator<Book> sortByPrice = (b1, b2) -> b1.getCost().compareTo(b2.getCost());

		List<Book> sortedBook = listBooks.stream().filter(book -> book.getName().startsWith("J"))
				.sorted(sortByName.thenComparing(sortByAuthor).thenComparing(sortByPrice)).collect(Collectors.toList());
		for (Book b : sortedBook) {
			System.out.println(b);
		}

	}
}
