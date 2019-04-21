//acmicpc2016 - I

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        int trip, speed[], time[], distance = 0;
        int newtime;

        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in).useDelimiter("[,\\s+]");



        do{
            System.out.print("Enter an integer: ");
            trip = scanner.nextInt();
            System.out.print("\n");

            if(trip == -1){
                break;
            }

         //   do{
            speed = new int[trip];
            time = new int[trip];

            for(int i=0; i<trip; i++) {
                System.out.println("Enter speed (miles per hour) and total elapsed time.");
                speed[i] = in.nextInt();
                time[i] = in.nextInt();

            }

            //int j=0;

            distance = speed[0] * time[0];
            for(int j=1; j<trip; j++){
                newtime = time[j] - time[j-1];
                distance += speed[j] * newtime;
            }

            System.out.println("Distance : " + distance + " miles");


        //    }while(trip>0);

        }while(trip != -1);

    }
}
