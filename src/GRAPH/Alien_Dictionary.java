package GRAPH;

import java.util.*;
//LeetCode 269 LintCode 892
public class Alien_Dictionary {
        public String alienOrder(String[] words){
            HashMap<Character, List<Character>> map=new HashMap<>();
            for(int i=0;i<words.length;i++){
                String s=words[i];
                for(int j=0;j<s.length();j++){
                    if(!map.containsKey(s.charAt(j))){
                        map.put(s.charAt(j),new ArrayList<>());
                    }
                }
            }
            for(int i=0;i<words.length-1;i++){
                String s1=words[i];
                String s2=words[i+1];
                if(s1.startsWith(s2) && s1.length()>s2.length()){
                    return "";
                }
                for(int j=0;j<Math.min(s1.length(),s2.length());j++){
                    if(s1.charAt(j)!=s2.charAt(j)){
                        map.get(s1.charAt(j)).add(s2.charAt(j));
                    }
                }
            }
            return TopologicalSort(map);
        }

        public String TopologicalSort(HashMap<Character, List<Character>> map){
            int[] in=Indegree(map);
            StringBuilder sb=new StringBuilder();
            Queue<Character> q=new LinkedList<>();
            for(char ch:map.keySet()){
                if(in[ch-'a']==0){
                    q.add(ch);
                }
            }

            int count=0;
            while(!q.isEmpty()){
                char rem=q.remove();
                count++;
                sb.append(rem);
                for(char nbr:map.get(rem)){
                    in[nbr-'a']--;
                    if(in[nbr-'a']==0){
                        q.add(nbr);
                    }
                }
            }
            return count==map.size()?sb.toString():"";
        }

        public int[] Indegree(HashMap<Character, List<Character>> map){
            int[] in=new int[26];
            for(char key:map.keySet()){
                for(int nbr:map.get(key)){
                    in[nbr-'a']++;
                }
            }
            return in;
        }

    public static void main(String[] args) {
        Alien_Dictionary obj = new Alien_Dictionary();
        String[] starr={"wrt", "wrf", "er", "ett", "rftt"};
        System.out.println(obj.alienOrder(starr));
    }
}
