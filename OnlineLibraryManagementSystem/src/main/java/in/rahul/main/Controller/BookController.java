package in.rahul.main.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.rahul.main.Repository.BookRepository;
import in.rahul.main.entity.Books;

@Controller
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/books")
	public String showBooks(@RequestParam(required = false) String bookAuthor,
			@RequestParam(required = false) String bookCategory, Model model) {
		List<Books> books = bookRepository.findAll();

		// show only available books
		books = books.stream().filter(b -> b.getBookAvailableCopies() > 0).collect(Collectors.toList());

		// show filter by Category
		if (bookCategory != null && !bookCategory.isEmpty()) {
			books = books.stream().filter(b -> b.getBookCategory().equalsIgnoreCase(bookCategory))
					.collect(Collectors.toList());
		}
		model.addAttribute("books", books);

		return "availableBooks";
	}

}
