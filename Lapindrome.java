import java.io.*;
public class Lapindrome {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine().toLowerCase().trim();
        int len=s.length()-1;

        String start="",end="";

        int index=0;
        int[] arr1=new int[27];
        int[] arr2=new int[27];

        while(index<len){
         //   start+=s.charAt(index++);
            arr1[s.charAt(index++)-'a']++;
            arr2[s.charAt(len--)-'a']++;
        //    end+=s.charAt(len--);
        }
        boolean flag=false;
        for(int i=0;i<27;i++) {
            if(arr1[i]!=arr2[i]) {
                System.out.println("The given string is not lapindrome");
                flag=true;
                break;
            }
        }
        if(!flag) System.out.println("The given string is a lapindrome");

        br.close();

    }

}
