package library.dao;
import library.model.Journal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class journalManagement {
    Scanner sc = new Scanner(System.in);
    private List<Journal> journals = new ArrayList<>();
    public List<Journal> get(){
        return journals;
    }
    public void add(Journal journal){
        for (Journal journal1 : journals){
            if (journal.getId() == journal1.getId()){
                System.out.println("Mã tạp chí đã tồn tại");
                return;
            }
        }
        journals.add(journal);
        System.out.println("đã add thành công !!");
    }
    public Journal searchId(int code){
        for (Journal journal1 : journals){
            if (journal1.getId() == code ){
                return journal1;
            }
        }
        System.out.println("Mã tạp chí không hợp lệ:");
        return null;
    }
    public void removeBook(Journal journal){
        journals.remove(journal);
    }
    public void update(Journal journal){
        System.out.println("Enter ID journal new:");
        int code = sc.nextInt();
        sc.nextLine();
        journal.setId(code);
        System.out.println("Enter  producer new:");
        String producer = sc.nextLine();
        journal.setProducer(producer);
        System.out.println("Enter  releaseNumber new:");
        int re = sc.nextInt();
        journal.setReleaseNumber(re);
        sc.nextLine();
        System.out.println("Enter releaseDate new:");
        String release = sc.nextLine();
        journal.setReleaseDate(release);
        System.out.println("Enter issueNumber:");
        int iss = sc.nextInt();
        journal.setIssueNumber(iss);
        System.out.println("đã sửa thành công: ");
    }
}