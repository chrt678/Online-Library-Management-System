package in.rahul.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahul.main.entity.Books;

public interface BookRepository extends JpaRepository<Books, Long> {
	List<Books> findByBookAuthor(String bookAuthor);

	List<Books> findByBookCategory(String bookCategory);
}
