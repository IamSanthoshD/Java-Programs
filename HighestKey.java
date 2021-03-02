import java.util.*;
public class HighestKey {
    public static void main(String args[])  {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of key&value :");
        int n=sc.nextInt();

        TreeMap<String,Integer> map=new TreeMap<>();

        while(n-->0) {
            System.out.println("Enter the key and value ");
            String s=sc.next();
            int i=sc.nextInt();
            map.put(s,i);
        }

        System.out.println("The Highest order Key is : "+map.lastKey()+" = "+map.get(map.lastKey()));

        sc.close();

    }
}
