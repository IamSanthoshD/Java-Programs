import java.io.*;
public class FirstRepeatingElement {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine().toLowerCase().trim();

        boolean flag=false;

        for(int i=0;i<s.length()-1;i++) {
            char c=s.charAt(i);
            for(int j=i+1;j<s.length();j++) {
                if(c==s.charAt(j)) {
                    flag=true;
                    break;
                }

            }
            if(flag){
                System.out.println("The first repeating element in "+s+" is : "+c);
                break;
            }
        }

        if(!flag) System.out.println("There is no repeating character in "+s);

        br.close();


    }
}
