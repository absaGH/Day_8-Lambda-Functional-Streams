
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
public class AverageMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<String> data = new ArrayList<>();
        
        String val;
        
        System.out.println("Enter a number.");
        while(true){
            val = input.nextLine();
            if(val.equals("end"))
                break;
            data.add(val);  
        }
        
        System.out.println("average of the numbers: " + data.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble());
    }
}
