package library.dao;
import library.model.Journal;
import library.model.Newspaper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class newspaperManagement {
    Scanner sc = new Scanner(System.in);
    private List<Newspaper> newspapers = new ArrayList<>();
    public List<Newspaper> getlist(){
        return newspapers;
    }
    public void addNewspaper (Newspaper newspaperr){
        for (Newspaper newspaper : newspapers){
            if (newspaper.getId() == newspaperr.getId()){
                System.out.println("Mã báo đã tồn tại");
            }
            return;
        }
        newspapers.add(newspaperr);
        System.out.println("Đã add thành công !!!");
    }
    public Newspaper searchId(int code){
        for (Newspaper newspaper : newspapers){
            if (newspaper.getId() == code ){
                return newspaper;
            }
        }
        System.out.println("Mã tạp chí không hợp lệ:");
        return null;
    }
    public void removeBook(Newspaper newspaper){
        newspapers.remove(newspaper);
    }
    public void update(Newspaper newspaper){
        System.out.println("Enter ID newspaper new:");
        int code = sc.nextInt();
        sc.nextLine();
        newspaper.setId(code);
        System.out.println("Enter  producer new:");
        String producer = sc.nextLine();
        newspaper.setProducer(producer);
        System.out.println("Enter  releaseNumber new:");
        int re = sc.nextInt();
        newspaper.setReleaseNumber(re);
        sc.nextLine();
        System.out.println("Enter releaseDate new:");
        String release = sc.nextLine();
        newspaper.setReleaseDate(release);
        System.out.println("đã sửa thành công: ");
    }
}