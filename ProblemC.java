import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        int Mix[] = new int[77];

        int N, no=1;

        /*for(int i=0; i<77; i++)
        {
            Mix[i] = i+1;
        }*/

      //  int result = 1;

       // result = Mix[1] + Mix[2];
        //Mix[1] + Mix[2] = result;

        for(int i = 3; i <= 76; ++i)
        {
            Mix[i] = Mix[i - 2] + Mix[i - 3];

        }

        //special cases
        Mix[1] = Mix[2] = 0;
        Mix[3] =1;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter a number : ");
            N = in.nextInt();

            if(N>0)
                System.out.println("Case " + (no++) + ": " + (Mix[N] + Mix[N-1]));
        }while(N>0);


    }
}
