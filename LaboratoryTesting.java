import java.util.Scanner;
public class LaboratoryTesting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
        int h=sc.nextInt();
        int o=sc.nextInt();

        int water=0,carbon=0,carbondioxide=0;

        while ((h-2>=0) && (o-1>=0)) {
                water++;
                h-=2;
                o--;
        }

        while(c-1>=0 && o-2>=0) {
                carbon++;
                c--;
                o-=2;
        }

        while ((c-1>=0) && (h-4>=0)) {
                carbondioxide++;
                h-=4;
                c--;
        }
        System.out.println(water+" "+carbon+" "+carbondioxide);

        sc.close();
    }
}
