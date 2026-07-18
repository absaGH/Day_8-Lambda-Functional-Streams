
import java.util.ArrayList;
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
class Person implements Comparable<Person>{
    private String fname;
    private String lname;
    private int dob;
    
    public Person(String fname, String lname, int dob){
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }
    
    @Override
    public int compareTo(Person other){
        int cmp = this.lname.compareTo(other.fname);
        return cmp;
    }
    public String getName(){
        return this.lname;
    }
}

public class UniqueLastNamesMain {
    public static void main(String[] args){
        List<Person> data = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        String ans, fname, lname;
        int dob;
        while(true){
            System.out.print("Continue personal information input? \"quit\" ends:\n");
            ans = input.nextLine();
            if(ans.equals("quit"))
            {
                break;
            }
            else{
                System.out.print("Input first name: ");
                fname = input.nextLine();
                System.out.print("Input last name: ");
                lname = input.nextLine();
                System.out.print("Input the year of birth: ");
                dob = input.nextInt();
                input.nextLine();
                data.add(new Person(fname, lname, dob));
                System.out.println("\n");
            }
        }
        System.out.println("\nUnique last names in alphabetical order:");
        data.stream().distinct().sorted().forEach(obj -> System.out.println(obj.getName()));
    }
}
