
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yosef S
 */
public class LimitedNumbersMain {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        int val;
        
        while(true){
            val = input.nextInt();
            if(val < 0){
                break;
            }else{
                values.add(val);
            }
        }
        
        values.stream().filter(s -> s <= 5 && s >= 1).forEach(num -> System.out.println(num));
    }
}
