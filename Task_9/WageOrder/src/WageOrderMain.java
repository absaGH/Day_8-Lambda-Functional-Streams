
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
class WageOrder implements Comparable<WageOrder>{
    private String fname;
    private int wage;
    
    public WageOrder(String fname, int wage){
        this.fname = fname;
        this.wage = wage;
    }

    public int getWage(){
        return this.wage;
    }
    @Override
    public int compareTo(WageOrder w){
        return w.getWage() - this.wage;
    }
    @Override
    public String toString(){
        return this.fname + " " + this.wage;
    }
}

public class WageOrderMain {
    public static void main(String[] args){
        List<WageOrder> wages = new ArrayList<>();
        
        wages.add(new WageOrder("Abebe", 1000));
        wages.add(new WageOrder("Alemu", 3000));
        wages.add(new WageOrder("Alme", 1500));
        
        wages.stream().sorted().forEach(obj -> System.out.println(obj));
    }
}
