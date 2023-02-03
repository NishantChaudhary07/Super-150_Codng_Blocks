public class DivideString {
    public static void main(String[] args) {
        String st = "Hello";
        String st1 = "";
        for (int i = 1; i <= st.length(); i++) {
            st1 = "";
            for (int j = 0; j<=st.length()-i; j++) {
                st1 += st.substring(j,j+i);
                System.out.println(st1);
                st1="";
            }

        }
    }
}
