
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
public class AverageSelectedMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<String> data = new ArrayList<>();
        
        String val, ans;
        System.out.println("Input numbers, type \"end\" to stop");
        
        while(true){
            val = input.nextLine();
            if(val.equals("end"))
                break;
            data.add(val);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers?(n/p)");
        ans = input.nextLine();
        if(ans.equals("n"))
            System.out.println("Average of the negative numbers: " + data.stream().mapToInt(s -> Integer.valueOf(s)).filter(avg -> avg < 0).average().getAsDouble());
        else
            System.out.println("Average of the negative numbers: " + data.stream().mapToInt(s -> Integer.valueOf(s)).filter(avg -> avg > 0).average().getAsDouble());
    }
}
