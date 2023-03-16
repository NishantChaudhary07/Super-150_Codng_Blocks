package GRAPH;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    private HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();

    public Graph(int v){
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }

    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

    public boolean ContainsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }

    public boolean containsVertex(int v1){
        return map.containsKey(v1);
    }

    public int numOfEdges(){
        int edges=0;
        for(int key:map.keySet()){
            edges+=map.get(key).size();
        }
        return edges/2;
    }

    public void removeEdge(int v1,int v2){
        if(ContainsEdge(v1,v2)){
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    public void removeVertex(int v1){
        for(int key:map.get(v1).keySet()){
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }

    public void display(){
        for(int key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }

    public boolean hasPath(int src, int des, HashSet<Integer> vis){
        if(src==des){
            return true;
        }
        vis.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!vis.contains(nbrs)) {
                boolean ans = hasPath(nbrs, des,vis);
                if(ans){
                    return ans;
                }
            }
        }
        vis.remove(src);
        return false;
    }
    public static void main(String[] args) {
        Graph g=new Graph(7);
        g.addEdge(1,4,6);
        g.addEdge(1,2,10);
        g.addEdge(2,3,7);
        g.addEdge(3,4,5);
        g.addEdge(4,5,1);
        g.addEdge(5,6,4);
        g.addEdge(7,5,2);
        g.addEdge(6,7,3);
//        g.display();
//        g.removeVertex(4);
//        g.display();
        System.out.println(g.hasPath(1,6,new HashSet<Integer>()));
    }
}


