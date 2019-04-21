import java.util.Scanner;
import static java.lang.Math.max;

//acmicpc2016 - D

public class BricksOnWall {
    public static void main(String[] args) {
        int test_case, bricks_no, thickness[], width[], dp[];


        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in).useDelimiter("[,\\s+]");

        System.out.print("Enter number of test cases: ");
        test_case = scanner.nextInt();
        System.out.print("\n");

        do{
            System.out.print("Enter number of bricks: ");
            bricks_no = scanner.nextInt();
            //int num= (bricks_no-1) *2;
            thickness = new int[101];
            width = new int[101];
            int total = 0;

            for(int i=0; i<bricks_no; i++) {
                System.out.print("Enter thickness and width of brick: ");
                thickness[i] = in.nextInt();
                //System.out.print("Enter width of brick: ");
                width[i] = in.nextInt();
                total += thickness[i];
            }

            dp = new int[202];
            for (int i=0;i<202;i++) dp[i] = 0;
            for(int i=1;i<=bricks_no;i++){
                for(int j=total;j>=thickness[i]+width[i];j--){
                    dp[j] = max(dp[j],dp[j-thickness[i]-width[i]]+thickness[i]);
                }
            }
            System.out.println("Minimum total thickness : " + (total-dp[total]));
            test_case--;
        }while(test_case>0);
    }
}
