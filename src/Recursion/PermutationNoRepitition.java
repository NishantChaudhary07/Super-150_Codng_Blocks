package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationNoRepitition {
    public static void permutations(String input,String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }

        for (int j = 0; j < input.length(); j++) {
            boolean flag = false;
            for (int i = j+1; i < input.length(); i++) {
                if(input.charAt(i)==input.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(!flag) {
                permutations(input.substring(0, j) + input.substring(j + 1), output + input.charAt(j));
            }
        }
    }

//    Using ArrayList

public static void permutation(String input,String output){
    if(input.length()==0){
        System.out.println(output);
        return;
    }
    List<Character> vis=new ArrayList<>();
    for(int i=0;i<input.length();i++){
        char ch=input.charAt(i);
        if(!vis.contains(ch)) {
            vis.add(ch);
            permutation(input.substring(0, i) + input.substring(i + 1), output + ch);
        }
    }
}
    public static void main(String[] args) {
        permutations("ABCA","");
    }
}
