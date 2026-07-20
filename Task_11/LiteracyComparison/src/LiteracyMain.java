
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
class LiteracyData implements Comparable<LiteracyData>{
    private String country;
    private int year;
    private String gender;
    private double literacy_level;
    
    public LiteracyData(String country, int year, String gender, double literacy_level){
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.literacy_level = literacy_level;
    }
    
    public double getLiteracy(){
        return this.literacy_level;
    }
    
    @Override
    public String toString(){
        return this.country+"("+Integer.toString(this.year)+"),"+this.gender.replace("(%)", "").trim()+","+Double.toString(this.literacy_level);
    }
    
    @Override
    public int compareTo(LiteracyData obj){
        double test = this.literacy_level - obj.getLiteracy();
        if(test < 0.0)
                return -1;
        else if(test > 0.0)
            return 1;
        else
            return 0;
    }
    
}

public class LiteracyMain {
    public static void main(String[] args){
        List<String> literacy = new ArrayList<>();
        List<LiteracyData> data = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("literacy.csv")).forEach(line -> literacy.add(line));
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        literacy.stream().map(line -> line.split(",")).forEach(row -> data.add(new LiteracyData(row[3],Integer.parseInt(row[4]),row[2],Double.parseDouble(row[5]))));
        data.stream().sorted().forEach(obj -> System.out.println(obj));
    }
    
}
