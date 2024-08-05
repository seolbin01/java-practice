package com.seolbin.chap06.class_and_object.level02.normal.book.run;

import com.seolbin.chap06.class_and_object.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bookdto1 = new BookDTO();
        bookdto1.printInformation();

        BookDTO bookdto2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bookdto2.printInformation();

        BookDTO bookdto3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        bookdto3.printInformation();

    }
}
