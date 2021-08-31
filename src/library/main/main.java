package library.main;

import library.dao.bookManagement;
import library.dao.journalManagement;
import library.dao.newspaperManagement;
import library.model.Book;
import library.model.Journal;
import library.model.Newspaper;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        bookManagement bookManagement = new bookManagement();
        journalManagement journalManagement = new journalManagement();
        newspaperManagement newspaperManagement = new newspaperManagement();
        List<Book> books = bookManagement.getlist();
        List<Journal> journals = journalManagement.get();
        List<Newspaper> newspapers = newspaperManagement.getlist();
        while (true){
            showMenu();
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    showBook();
                    int chon = sc.nextInt();
                    switch (chon) {
                        case 1:
                            Book book = inputBook();
                            bookManagement.add(book);
                            break;
                        case 2:
                            System.out.println("Nhập ID cần xóa:");
                            int code = sc.nextInt();
                            Book book2 = bookManagement.searchId(code);
                            if (book2 == null) {
                                break;
                            } else {
                                bookManagement.removeBook(book2);
                                System.out.println("Đã xóa thành công !!!");
                            }
                            break;
                        case 3:
                            System.out.println("Nhập ID sách cần tìm:");
                            int s = sc.nextInt();
                            Book book3 = bookManagement.searchId(s);
                            if (book3 == null) {
                                break;
                            } else {
                                System.out.println(book3);
                            }
                            break;
                        case 4:
                            System.out.println("nhập id sách cần sửa:");
                            int i = sc.nextInt();
                            Book book1 = bookManagement.searchId(i);
                            if (book1 == null) {
                                break;
                            } else {
                                bookManagement.update(book1);
                            }
                            break;
                        case 5:
                            for (Book book4 : books) {
                                display(book4);
                            }
                            break;
                        case 6:
                            Collections.sort(books, new Comparator<Book>() {
                                @Override
                                public int compare(Book b1, Book b2) {
                                    if (b1.calcualateCost() < b2.calcualateCost()) {
                                        return -1;
                                    } else if (b1.calcualateCost() == b2.calcualateCost()) {
                                        return 0;
                                    } else {
                                        return 1;
                                    }
                                }
                            });
                            System.out.println("sắp xếp giá tăng dần là:");
                            for (Book book6 : books) {
                                System.out.println(book6);
                            }
                            break;
                        case 7:
                            return;
                        default:
                            System.out.println("mời nhập lại");
                            break;
                    }
                    break;
                case 2:
                    showJournal();
                    int enter = sc.nextInt();
                    switch (enter){
                        case 1:
                            Journal journal = inputJournal();
                            journalManagement.add(journal);
                            break;
                        case 2:
                            System.out.println("Nhập ID cần xóa:");
                            int n = sc.nextInt();
                            Journal journal2 = journalManagement.searchId(n);
                            if (journal2 == null){
                                break;
                            } else {
                                journalManagement.removeBook(journal2);
                                System.out.println("Đã xóa thành công");
                            }
                            break;
                        case 3:
                            System.out.println(" Nhập ID cần tìm: ");
                            int idd = sc.nextInt();
                            Journal journal3 = journalManagement.searchId(idd);
                            if (journal3 == null){
                                break;
                            } else {
                                System.out.println(journal3);
                            }
                            break;
                        case 4:
                            System.out.println("Nhập ID cần sửa:");
                            int iddd =sc.nextInt();
                            Journal journal4 = journalManagement.searchId(iddd);
                            if (journal4 ==null){
                                break;
                            } else {
                                journalManagement.update(journal4);
                            }
                            break;
                        case 5:
                            for ( Journal journal5 : journals){
                                System.out.println(journal5);
                            }
                            break;
                        case 6:
                            return;
                        default:
                            System.out.println("mời nhập lại");
                            showMenu();
                            break;
                    }
                    break;
                case 3:
                    showNewspaper();
                    int n = sc.nextInt();
                    switch (n){
                        case 1:
                            Newspaper newspaper = inputNewspaper();
                            newspaperManagement.addNewspaper(newspaper);
                            break;
                        case 2:
                            System.out.println("Nhập ID cần xóa:");
                            int k = sc.nextInt();
                            Newspaper newspaper2 = newspaperManagement.searchId(k);
                            if (newspaper2 == null){
                                break;
                            } else {
                                newspaperManagement.removeBook(newspaper2);
                                System.out.println("Đã xóa thành công");
                            }
                            break;
                        case 3:
                            System.out.println(" Nhập ID cần tìm: ");
                            int idd = sc.nextInt();
                            Newspaper newspaper3 = newspaperManagement.searchId(idd);
                            if (newspaper3 == null){
                                break;
                            } else {
                                System.out.println(newspaper3);
                            }
                            break;
                        case 4:
                            System.out.println("Nhập ID cần sửa:");
                            int iddd =sc.nextInt();
                            Newspaper newspaper4 = newspaperManagement.searchId(iddd);
                            if (newspaper4 ==null){
                                break;
                            } else {
                                newspaperManagement.update(newspaper4);
                            }
                            break;
                        case 5:
                            for ( Newspaper newspaper5 : newspapers){
                                System.out.println(newspaper5);
                            }
                            break;
                        case 6:
                            return;
                        default:
                            System.out.println("mời nhập lại");
                            break;
                    }
                    break;
                default:
                    System.out.println("mời bạn nhập lại");
                    break;
            }
        }
    }
    public static void  showMenu(){
        System.out.println("1.Book:");
        System.out.println("2.journal:");
        System.out.println("3.newspaper:");
        System.out.println("choose:");
    }
    public static void showBook(){
        System.out.println("1.Add Book:");
        System.out.println("2.Delete Book:");
        System.out.println("3.Search Book:");
        System.out.println("4.Update Book:");
        System.out.println("5.Display All:");
        System.out.println("6. Sort books by price ascending:");
        System.out.println("7.Exit:");
        System.out.println("choose:");
    }
    public static void showJournal(){
        System.out.println("1.Add Journal:");
        System.out.println("2.Delete Journal:");
        System.out.println("3.Search Journal:");
        System.out.println("4.Update Journal:");
        System.out.println("5.Display All:");
        System.out.println("6.Exit:");
    }
    public static void showNewspaper(){
        System.out.println("1.Add Newspaper:");
        System.out.println("2.Delete Newspaper:");
        System.out.println("3.Search Newspaper:");
        System.out.println("4.Update Newspaper:");
        System.out.println("5.Display All:");
        System.out.println("6.Exit:");
    }
    public static Book inputBook(){
        System.out.println("Enter ID book:");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter producer:");
        String producer = sc.nextLine();
        System.out.println("Enter releaseNumber:");
        int re = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter author:");
        String author = sc.nextLine();
        System.out.println("Enter page:");
        int page = sc.nextInt();
        return new Book(code,producer,re,author,page);
    }
    public static void display(Book book){
        System.out.println(book.toString());
    }
    public static Journal inputJournal(){
        System.out.println("Enter ID Journal:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter producer:");
        String producer = sc.nextLine();
        System.out.println("Enter releaseNumber:");
        int re = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter releaseDate:");
        String rel =sc.nextLine();
        System.out.println("Enter issueNumber:");
        int iss = sc.nextInt();
        return new Journal(id , producer , re , rel , iss);
    }
    public static void display(Journal journal){
        System.out.println(journal.toString());
    }
    public static Newspaper inputNewspaper(){
        System.out.println("Enter ID Newspaper:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter producer:");
        String producer = sc.nextLine();
        System.out.println("Enter releaseNumber:");
        int re = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter releaseDate:");
        String rel =sc.nextLine();
        return new Newspaper(id , producer , re , rel );
    }
    public  static  void displayNewspaper(Newspaper newspaper){
        System.out.println(newspaper.toString());
    }
}
