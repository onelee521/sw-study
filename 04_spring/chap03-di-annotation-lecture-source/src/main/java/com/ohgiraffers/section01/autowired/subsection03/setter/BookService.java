package com.ohgiraffers.section01.autowired.subsection03.setter;


import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceSetter")
public class BookService {

    private BookDAO bookDAO;

    @Autowired      // 좋은 방식이 아님
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.searchBookBySequence(sequence);
    }

}
