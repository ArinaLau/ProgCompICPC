import java.util.Scanner;

//acmicpc2016 - E

public class StreetLightPole {
    public static void main(String[] args) {
        int test_case, hn, cn, status[][], steps;

        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in).useDelimiter("[,\\s+]");

        System.out.print("Enter number of test cases: ");
        test_case = scanner.nextInt();
        System.out.print("\n");

       // do{
        for(int c=0; c<test_case; c++) {
            System.out.print("Enter number of horizontal and vertical streets: ");
            hn = in.nextInt();
            cn = in.nextInt();
            status = new int[hn][cn];
            for (int i = 0; i < hn; i++) {
                System.out.print("Enter integer: ");
                for (int j = 0; j < cn; j++) {
                    status[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < hn; i++) {
                for (int j = 0; j < cn; j++) {

                }
            }

//            System.out.println("Case " + c + ": " + steps);

            test_case--;
        }
        //}while(test_case>0);

    }
}
