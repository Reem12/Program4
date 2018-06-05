/*
 * This program uses two approches to search in graph which are 
DFS and BFS. This program reads from file called "input.txt" the adjacency matrix and the 
output for the algorthims is wrriten out in file caled "output.txt".
 */
package prog4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Reem AlGhamdi
 * @Date 6/6/2018
 */
public class SG {
 private final String[][] matrix;
 
 
 public SG(String[][] inp){
 matrix = inp;
 }
 
 public LinkedList<Node>[] create(){  // create adjancy list //
 LinkedList<Node>[] nodes = new  LinkedList[matrix[0].length];
 
for(int i=0;i<matrix[0].length;i++){
LinkedList list  = new LinkedList();
nodes[i] = list;
Node e  = new Node(matrix[0][i]);
nodes[i].add(e);
}
int k=0;
for(int r=1;r<matrix.length;r++){
    for(int c=0;c<matrix.length-1;c++){
       if(matrix[r][c].equals("1")){
       nodes[c].add(nodes[k].getFirst());
       }
    }
k++;
}
return nodes;
}
 
 
public String DFS(LinkedList<Node>[] l, int index){ // DFS //
String DFS = "[ ";
Stack<Node> st = new Stack();
Node s = l[index].getFirst(); // get starting node
st.push(s);

while(!st.isEmpty()){
    Node n = st.peek();
    s = getNotVis(l[myIndex(n)]);
    if(s!=null){
    s.mark();
    st.push(s);
    DFS+=s.name()+" ";
    s = getNotVis(l[myIndex(s)]);
    } else {
    st.pop();
    }

}
DFS = DFS+"]";
return DFS;
}

public int myIndex(Node node){
for(int i=0;i<matrix[0].length;i++){
if(matrix[0][i].equals(node.name()))
    return i;
}
System.out.println("Error");
return -1;
}



public void printAdj(LinkedList<Node>[] n){
      for(int i=0;i<matrix.length-2;i++){
        System.out.println(n[i].getFirst().name() + ": "+ n[i].toString());
        }
}


public Node getNotVis(LinkedList<Node> n){ // get not vis and return null if all vis
Node current = null;
int index = 0;
while (index<n.size()){
current = n.get(index);
if(!current.vis())
    return current;
index++;
}
return null;
}



public String BFS(LinkedList<Node>[] l, int index){ // BFS // 
String BFS = "[ ";

Queue<Node> q = new LinkedList();
Node s = l[index].getFirst(); // get starting node
q.add(s);

while(!q.isEmpty()){
    Node n = q.peek();
    s = getNotVis(l[myIndex(n)]);
    if(s!=null){
    s.mark();
    q.add(s);
    BFS+=s.name()+" ";
    s = getNotVis(l[myIndex(s)]);
    } else {
    q.remove();
    }

}

BFS = BFS+"]";
return BFS;
}
 
 
 
 
 
 
}
