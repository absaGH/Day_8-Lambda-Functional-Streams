
import java.util.ArrayList;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yosef S
 */
public class DivisibleMain {
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers){
        return numbers.stream().filter(val -> val%2 == 0 || val%3 == 0 || val%5 == 0).collect(Collectors.toCollection(ArrayList::new));
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(num -> System.out.println(num));
    }
}
