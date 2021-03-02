public class ArrivalAndDeparture {
    public static void main(String args[]) {
        String arrival[] = {"1:00","1:40","1:50","2:00","2:15","4:00"};
        String departure[] = {"1:10","3:00","2:20","2:30","3:15","6:00"};

        int platform=1;

        String[] s=new String[2];
        int arrival_time,departure_time;

        for(int i=1;i<arrival.length;i++) {

            s=arrival[i].split(":");
            arrival_time=Integer.parseInt(s[0]+s[1]);

            s=departure[i-1].split(":");
            departure_time=Integer.parseInt(s[0]+s[1]);

            if(arrival_time<departure_time)
                platform++;
       //     System.out.print(arrival_time+" ");
        }

        System.out.println("The no of platform needed is : "+platform);
    }
}
