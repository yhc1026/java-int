package uestc.book;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Authors author1=new Authors("Jack", "1234@abc.com", 'M');
        Authors author2=new Authors("Mark", "5678@abc.com", 'M');
        Authors author3=new Authors("Jane", "0000@abc.com", 'F');

        List<Authors> authors= Arrays.asList(author1, author2, author3);

        Book book1=new Book("JAVA",authors , 50.0, 100 );

        System.out.println(book1.getAuthors());
        System.out.println(book1.getAuthorsNames());
    }
}
