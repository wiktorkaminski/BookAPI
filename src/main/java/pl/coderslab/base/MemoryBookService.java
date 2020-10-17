package pl.coderslab.base;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MemoryBookService {
    private List<Book> list;

    public MemoryBookService() {
        this.MockBookService();
    }

    public void MockBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	głową	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }

    public List<Book> getList() {
        return list;
    }

    public Optional<Book> getBookById(long id) {
        return list.stream().filter(item -> item.getId() == id)
                .findFirst();
    }
}