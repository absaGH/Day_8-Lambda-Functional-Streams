
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yosef S
 */
class Book{
    private String bkname;
    private int recommended_age;
    
    public Book(String bkname, int recommended_age){
        this.bkname = bkname;
        this.recommended_age = recommended_age;
    }
    public String getBkname(){
        return this.bkname;
    }
    public int getRecommendedAge(){
        return this.recommended_age;
    }
    
    @Override
    public String toString(){
        return this.bkname + "(recommended for "+Integer.toString(this.recommended_age)+" year-olds or older)";
    }
}
public class LiteratureMain {
    public static void main(String[] args){
         List<Book> books = new ArrayList<>();
         Scanner input = new Scanner(System.in);
         String bkname;
         int age;
    
        while(true){
            System.out.print("Input the name of the book, empyt stops: ");
            bkname = input.nextLine();
            if(bkname.isEmpty())
                break;
            else{
                System.out.print("Input the age recommandation: ");
                age = input.nextInt();
                books.add(new Book(bkname, age));
                input.nextLine();
            }
        }
        System.out.println("\n");
        System.out.println(books.size() + " books in total.");
        System.out.println("\nBooks:");
        
        Comparator<Book> comparator = Comparator.comparing(Book::getRecommendedAge);
        
        Collections.sort(books, comparator);
        books.stream().forEach(obj -> System.out.println(obj));
    }
}
