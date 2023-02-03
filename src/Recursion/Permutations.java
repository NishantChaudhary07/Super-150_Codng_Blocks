package Recursion;

public class Permutations {
    public static void permutations(String input,String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }

        for(int i=0;i<input.length();i++){
            permutations(input.substring(0,i)+input.substring(i+1),output+input.charAt(i));
        }
    }

    public static void main(String[] args) {
        permutations("ABC","");
    }
}
