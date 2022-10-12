import java.util.*;

public class Main {
  static class Graph{
    int V;
    LinkedList<Integer>[]adj;
  Graph(int V){
    this.V=V;
    adj=new LinkedList[V];
      for(int i=0;i<adj.length;i++){
        adj[i]=new LinkedList<Integer>();
    }
  }
  void addEdge(int v,int w){
    adj[v].add(w);
    }
  void DFSREC(int v,boolean visited[]){
    visited[v]=true;
    System.out.print(v+" ");
    Iterator<Integer> i=adj[v].listIterator();
      while(i.hasNext()){
        int n=i.next();
      if(!visited[n]){
        DFSREC(n, visited);
      }
    }
  }
  void DFS(int v){
      boolean visited[]=new boolean[v];
      DFSREC(0, visited);
  }
  void DFSStack(int s){
    Vector<Boolean> visited=new Vector<Boolean>();
    java.util.Stack<Integer> st = new java.util.Stack<>();
      for(int i=0;i<V;i++){
        visited.add(false);
  }
    st.push(s); 
      while(st.empty()==false){
        s=st.peek();
        st.pop();
        if(visited.get(s)==false){
          System.out.print(s+" ");
          visited.set(s,true);
        }
        Iterator<Integer>itr=adj[s].iterator();
        while(itr.hasNext()){
          int v=itr.next();
            if(!visited.get(v)){
              st.push(v);
          }
        }
      }
    }
  }
  public static void main(String args[]){
    Graph g=new Graph(7);
    g.addEdge(0,1);
    g.addEdge(0,2);
    g.addEdge(2,3);
    g.addEdge(2,4);
    g.addEdge(4,5);
    g.addEdge(1,3);
    g.addEdge(3,5);
    System.out.println("The Depth first Traveresal with source 0 is");
    g.DFS(7);
    System.out.println();
    System.out.println("Depth first travrersal with source zero using stack");
    g.DFSStack(0);
  }
}
