package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    /* 설명.
     *  아래의 3가지는 ComponentScan 범위 안에 어노테이션들이 달렸을 때 유효하다.
     *  1. @Service에 의해서 BookService 타입의 bookServixe bean이 관리된다.
     *  2. BookDAOImpl에 있는 @Repository에 의해서 bookDAOImpl bean이 관리 된다.(BookDTO 타입이기도 하다.)
     *  3. @Autowired에 의해서 BookDTO 타입의 반이 BookService의 필드인 bookDAO 필드에 주입된다.(대입된다,)
    * */
    @Autowired
    private BookDAO bookDAO;        // ComponentScan 범위 안에 BookDAO 타입의 bean이 대입됨
                                    // BookDAO에 의존적

//    private final BookDAO bookDAO;          // 필드 주입은 final x

    public BookService() {
    }

    /* 설명. 도서 목록 전체 조회 */
    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    /* 설명. 도서 번호로 도서 조회 */
    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.searchBookBySequence(sequence);
    }
}
