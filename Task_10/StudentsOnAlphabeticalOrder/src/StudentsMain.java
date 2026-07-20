
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yosef S
 */
class Student implements Comparable<Student>{
    private String fname;
    
    public Student(String fname){
        this.fname = fname;
    }
    
    public String getFname(){
        return this.fname;
    }
    @Override
    public int compareTo(Student stud){
        //return this.fname.compareTo(stud.getFname());
        return this.fname.compareToIgnoreCase(stud.getFname());
    }
    @Override
    public String toString(){
        return this.fname;
    }
}

public class StudentsMain {
    public static void main(String[] args){
        List<Student> st = new ArrayList<>();
        
        st.add(new Student("Eyob"));
        st.add(new Student("Belay"));
        st.add(new Student("Abrham"));
        st.add(new Student("ABEBE"));
        
        st.stream().sorted().forEach(obj -> System.out.println(obj));
    }
}
