package GRAPH;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Cycle {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public Is_Cycle(int v){
        map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }

    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);  //v1-->v2
    }

    public boolean TopologicalSort(){
        int[] in=Indegree();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int rem=q.remove();
//            System.out.print(rem+" ");
            count++;
            for(int nbr:map.get(rem).keySet()){
                in[nbr]--;
                if(in[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        return count==map.size()?false:true;
    }
    public int[] Indegree(){
        int[] in=new int[map.size()+1];
        for(int key:map.keySet()){
            for(int nbr: map.get(key).keySet()){
                in[nbr]++;
            }
        }
        return in;
    }

    public static void main(String[] args) {
        Is_Cycle t = new Is_Cycle(7);
        t.addEdge(1, 2,0);
        //t.addEdge(2, 1);
        t.addEdge(1, 4,0);
        t.addEdge(2, 3,0);
        t.addEdge(3, 6,0);
        t.addEdge(1, 2,0);
        t.addEdge(4, 3,0);
        t.addEdge(4, 6,0);
        t.addEdge(4, 5,0);
        t.addEdge(5, 7,0);
        t.addEdge(5, 6,0);
        t.addEdge(7, 6,0);
        System.out.println(Arrays.toString(t.Indegree()));
        t.TopologicalSort();
//        System.out.println(t.IsCycle());
    }
}
