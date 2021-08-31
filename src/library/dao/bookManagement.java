package library.dao;

import library.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class bookManagement {
    Scanner sc = new Scanner(System.in);
    private List<Book> books = new ArrayList<>();
    public List<Book> getlist(){
        return books;
    }
    public void add(Book book){
        for (Book book1 : books){
            if (book1.getId() == book.getId()){
                System.out.println("Mã sách đã tồn tại");
                return;
            }
        }
        books.add(book);
        System.out.println("đã add thành công !!");
    }
    public Book searchId(int code){
        for (Book book2 : books){
            if (book2.getId() == code ){
                return book2;
            }
        }
        System.out.println("Mã sách không hợp lệ:");
        return null;
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public void update(Book book){
        System.out.println("Enter ID book new:");
        int code = sc.nextInt();
        sc.nextLine();
        book.setId(code);
        System.out.println("Enter  producer new:");
        String producer = sc.nextLine();
        book.setProducer(producer);
        System.out.println("Enter  releaseNumber new:");
        int re = sc.nextInt();
        book.setReleaseNumber(re);
        sc.nextLine();
        System.out.println("Enter  author new:");
        String author = sc.nextLine();
        book.setAuthor(author);
        System.out.println("Enter  page new:");
        int page = sc.nextInt();
        book.setPage(page);
        sc.nextLine();
        System.out.println("đã sửa thành công: ");
    }
}
