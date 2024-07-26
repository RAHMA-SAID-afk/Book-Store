package book.Repository;


import book.Entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {

}
