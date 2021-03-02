import java.io.*;
public class Permutations {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string for permutations : ");
        String s=br.readLine().trim();

        findPermutations(s,"");

        br.close();
    }
    private static void findPermutations(String original,String per) {
        if(original.equals("")) {
            System.out.print(per+" ");
            return;
        }

        char c;
        for(int i=0;i<original.length();i++) {
            c=original.charAt(i);

            String temp=original.substring(0,i)+original.substring(i+1);

            findPermutations(temp,per+c);

        }
    }

}
