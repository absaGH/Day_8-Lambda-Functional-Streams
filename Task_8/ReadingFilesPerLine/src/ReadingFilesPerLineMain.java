
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
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
public class ReadingFilesPerLineMain {
    public static List<String> read(String file){
        List<String> rows = new ArrayList<>();
        
        try{
            Files.lines(Paths.get(file), StandardCharsets.UTF_8).forEach(row -> rows.add(row));
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return rows;
    }
    public static void main(String[] args){
        List<String> flines = read("SampleData");
        PrintStream out = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        for(String ln : flines)
            out.println(ln);
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(java.nio.charset.Charset.defaultCharset());
    }
}
