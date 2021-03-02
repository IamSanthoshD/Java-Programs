import java.io.*;
public class RemoveVowels {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string to remove vowels : ");
        String str = br.readLine().trim();

        str = str.replaceAll("[aeiouAEIOU]", "");

        System.out.println("String without vowels : "+str);

        br.close();
    }
}