
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
public class PuttingUserInputMain {
    public static void main(String[] args){
        List<String> values = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        String temp;
        while(true){
           temp = input.nextLine();
           if(temp.equals(""))
               break;
           else
               values.add(temp);
        }
        
        values.stream().forEach(str -> System.out.println(str));
    }
}
