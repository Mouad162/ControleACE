package ma.xproce.controlearchii.service;

import ma.xproce.controlearchii.dto.BookDTO;

import java.util.List;

public interface Bookservice {
    BookDTO saveBook(BookDTO bookDTO);

    boolean deleteBook(Long id);

    List<BookDTO> getBooksByTitle(String title);

    List<BookDTO> getBooksByTitleAndAuthor(String title, String author);

    List<BookDTO> saveBooks(List<BookDTO> bookDTOs);
}
