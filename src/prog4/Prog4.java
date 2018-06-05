/*
 * This program uses two approches to search in graph which are 
DFS and BFS. This program reads from file called "input.txt" the adjacency matrix and the 
output for the algorthims is wrriten out in file caled "output.txt".
 */
package prog4;

import java.io.FileNotFoundException;
import java.util.LinkedList;

/**
 *
 * @author Reem AlGhamdi
 * @Date 6/6/2018
 */
public class Prog4 {

    public static void main(String[] args) throws FileNotFoundException {
        
        // read input
        FileMgmt x = new FileMgmt("input.txt");
        x.open();
        String[][] str2D = x.read2dString();
        
        // create new SG
        SG sg = new SG(str2D);
        LinkedList<Node>[] adjList = sg.create();
        
        // call DFS , BFS
        String DFS = sg.DFS(adjList,0);
        adjList = sg.create();
        String BFS = sg.BFS(adjList,0);
        
        // output file
        FileMgmt y = new FileMgmt("output.txt");
        y.write();
        System.out.println("DFS: " + DFS);
       System.out.println("BFS: " + BFS);
    }
    
}
