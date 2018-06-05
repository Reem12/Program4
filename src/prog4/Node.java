/*
 * This program uses two approches to search in graph which are 
DFS and BFS. This program reads from file called "input.txt" the adjacency matrix and the 
output for the algorthims is wrriten out in file caled "output.txt".
 */
package prog4;

//import java.util.LinkedList;

/**
 *
 * @author Reem AlGhamdi
 * @Date 6/6/2018
 */
public class Node {
private String name;
private Node next;
boolean vis;

public Node(String inp){
vis=false;
next=null;
name = inp;
}

public String name(){
return name;
}

public void name(String x){
name = x;
}

public Node next(){

return next;
} 

public void next(Node input){

next=input;
}

public boolean vis(){

return vis;
}

public void vis(boolean input){

vis=input;
}

public void mark(){
vis = true;
}


public void print(){
System.out.println(name + " | " + vis + " |");
}

}


