/*
 * This program uses two approches to search in graph which are 
DFS and BFS. This program reads from file called "input.txt" the adjacency matrix and the 
output for the algorthims is wrriten out in file caled "output.txt".
 */
package prog4;

/**
 *
 * @author Reem AlGhamdi
 * @Date 6/6/2018
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
public class FileMgmt {
private Scanner x;
private String filename;

public FileMgmt(String input){
 filename = input;
 }
 public String fileName(){
 return filename;
 }
 
 //open file
 public void open(){
 try{
      x = new Scanner(new java.io.File(filename));
 }
 catch(FileNotFoundException e){
 System.out.println("Could not find file!");
 }

}
 //read file into String 
public void read(){
String s = "";
while(x.hasNext()){
s = s + x.next() +" ";
}

 String [] s2 = s.split(","); // split by spaces
 
 ArrayList<String[][]> lines= new ArrayList<>();
 String [][] a = new String[lines.size()][];

    for (int i = 0; i < a.length; i++){
        
      
        }

}

public void write() throws FileNotFoundException{ // write console to file // 
PrintStream myconsole= new PrintStream(new File(filename));
System.setOut(myconsole);
}

public String[][] read2dString(){
ArrayList<String[]> lines= new ArrayList<>();
while(x.hasNextLine()){
    String line =x.nextLine().trim();
    String[] s=line.split(",");
        lines.add(s);
}

String[][] string2D = new String[lines.size()][];
for(int i =0; i<string2D.length;i++)
    string2D[i] = lines.get(i);
return string2D;
}



}
