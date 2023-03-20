package GRAPH;

import java.util.*;

public class Graph_Valid_Tree {
    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Graph_Valid_Tree(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean Valid_Tree() {
        HashSet<Integer> vis = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int count=0;
        for (int src : map.keySet()) {
            if(vis.contains(src)){
                continue;
            }
            count++;
            q.add(src);
            while (!q.isEmpty()) {
//      1.      remove
                int rem = q.poll();
//      2.      if already visited ignores
                if (vis.contains(rem)) {
                    return false;
                }
//      3.          update visited
                vis.add(rem);
//      4.      Self Work
                System.out.print(rem + " ");
//      5.          add unvisited neighbours
                for (int nbrs : map.get(rem).keySet()) {
                    if (!vis.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }

            }
        }
        return count==1;
    }

}