package pl.coderslab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.base.Book;
import pl.coderslab.base.MemoryBookService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    MemoryBookService memory;

    @Autowired
    public BookController(MemoryBookService memory) {
        this.memory = memory;
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return memory.getList();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable long id) {
        Optional<Book> result = memory.getBookById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return new Book();
        }
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return memory.addBook(book);
    }
}
