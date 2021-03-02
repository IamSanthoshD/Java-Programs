import java.util.Scanner;
public class Prime {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting range :  ");
        int starting_range=sc.nextInt();
        System.out.print("Enter the ending range :  ");
        int ending_range=sc.nextInt();

        System.out.println("The number of prime number that satisfies the formula is : "+solve(starting_range,ending_range));

        sc.close();

    }

    private static int solve(int start,int end) {
        int count=0;
        int p=0;

        for(int i=0;i<end/2;i++) {
            for(int j=0;j<end/2;j++) {
                int number=primeFormula(i,j);
                if(isPrime(number) && number>=start && number<=end)
                    count++;
                else if(number>end)
                    break;
            }
        }

        return count;
    }

    private static int primeFormula(int i,int j) {
        int a=(int)Math.pow(2,i);
        int b=(int)Math.pow(3,j);
        int ans=(a*b)+1;
        return ans;
    }


    private static boolean isPrime(int n) {
        if(n==0 || n==1)
            return false;

        if(n==2 || n==3 || n==5)
            return true;

        if(n%2==0 || n%3==0)
            return false;

        for(int i=5;i<=n/2;i+=2) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}