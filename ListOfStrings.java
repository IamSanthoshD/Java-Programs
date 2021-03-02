import java.io.*;
import java.util.ArrayList;
public class ListOfStrings {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<>(10);
        int min=Integer.MAX_VALUE;
        int max=0;
        System.out.println("Enter the 10 strings : ");
        for(int i=0;i<10;i++) {
            list.add(br.readLine().trim());
        }

        String minStr="",maxStr="";
        for(String s:list) {
            if(s.length()<min){
                min=s.length();
                minStr=s;
            }
            else if(s.length()>max){
                max=s.length();
                maxStr=s;
            }
        }

        System.out.println("The shortest string is : "+minStr);
        System.out.println("The longest string is : "+maxStr);

        br.close();

    }
}
