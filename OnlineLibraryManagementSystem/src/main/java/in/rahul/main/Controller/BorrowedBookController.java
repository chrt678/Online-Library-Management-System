package in.rahul.main.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.rahul.main.Repository.BorrowedBooksRepository;
import in.rahul.main.Repository.UserRepository;
import in.rahul.main.Service.BorrowedBooksService;
import in.rahul.main.entity.BorrowStatus;
import in.rahul.main.entity.BorrowedBooks;
import in.rahul.main.entity.User;

@Controller
@RequestMapping("/borrow")
public class BorrowedBookController {

	@Autowired
	private BorrowedBooksService borrowedBooksService;

	@Autowired
	private BorrowedBooksRepository borrowedBooksRepository;

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/form")
	public String borrowForm() {
		return "borrowForm";
	}

	@PostMapping("/doBorrow")
	public String doBorrow(@RequestParam long bookId, Principal principal, Model model) {
		try {
			User user=userRepository.findByUsername(principal.getName()).get();
			borrowedBooksService.borrowBook(user.getId(), bookId);
			return "redirect:/borrow/success";
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
			return "borrowFail";
		}
	}

	@GetMapping("/success")
	public String successPage() {
		return "borrowSuccess";
	}

	@GetMapping("/fail")
	public String failPage() {
		return "borrowFail";
	}

	@GetMapping("/list")
	public String listAll(Model model, Principal principal) {

		String username = principal.getName();
		User user = userRepository.findByUsername(username).orElse(null);
		if (user != null) {
			List<BorrowedBooks> borrowedBooks = borrowedBooksRepository.findByUserAndStatus(user,
					BorrowStatus.BORROWED);
			model.addAttribute("borrowedBooks", borrowedBooks);
		} else {
			model.addAttribute("borrowedBooks", List.of());
		}

		return "BorrowListOfUser";
	}

	@GetMapping("/return")
	public String returnBookFormPage() {
		return "returnForm";
	}

//....................................Rest for Postman...............................................................................

	@PostMapping("/api/borrow")
	@ResponseBody
	public BorrowedBooks apiBorrow(@RequestParam long id, @RequestParam long bookId) {
		return borrowedBooksService.borrowBook(id, bookId);
	}

	@PostMapping("/api/return")
	@ResponseBody
	public BorrowedBooks apiReturn(@RequestParam Long borrowedBookId) {
		return borrowedBooksService.returnBook(borrowedBookId);
	}

	@GetMapping("/api/all")
	@ResponseBody
	public List<BorrowedBooks> apiAll() {
		return borrowedBooksService.findAll();
	}

	@PostMapping("/doReturn")

	public String doReturn(@RequestParam long borrowedBookId, Model model) {
		try {
			borrowedBooksService.returnBook(borrowedBookId);
			return "returnSuccess.html";
		}

		catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "borrowFail.html";
	}

}