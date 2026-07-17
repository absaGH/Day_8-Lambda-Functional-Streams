
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yosef S
 */
public class PositiveNumbersMain {
    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> values = numbers.stream().filter(val -> val > 5).collect(Collectors.toCollection(ArrayList::new));
        return values;   
    }
    public static void main(String[] args){
        List<Integer> sample = new ArrayList<>();
        sample.add(6);
        sample.add(-2);
        sample.add(-3);
        sample.add(8);
        System.out.println(positive(sample));
    }
}
