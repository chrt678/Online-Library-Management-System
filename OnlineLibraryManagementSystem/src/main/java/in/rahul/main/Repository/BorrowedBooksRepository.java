package in.rahul.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.rahul.main.entity.BorrowStatus;
import in.rahul.main.entity.BorrowedBooks;
import in.rahul.main.entity.User;

@Repository
public interface BorrowedBooksRepository extends JpaRepository<BorrowedBooks, Long>

{

	List<BorrowedBooks> findByStatus(BorrowStatus status);

	List<BorrowedBooks> findByUserAndStatus(User user, BorrowStatus status);

	List<BorrowedBooks> findByUserId(long id);

	long countByStatus(BorrowStatus status);

}
